package edu.uclm.esi.iso2.multas.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import edu.uclm.esi.iso2.multas.dao.DriverDao;
import edu.uclm.esi.iso2.multas.dao.GeneralDao;
import edu.uclm.esi.iso2.multas.dao.OwnerDao;

@Entity
@Table
public class Inquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable=false, updatable=false)
	private Date dateOfIssue;
	@Column(nullable=false, updatable=false)
	private String location;
	@ManyToOne(targetEntity=Owner.class)
	private Owner owner;
	@Column(nullable=false, updatable=false)
	private double speed;
	@Column(nullable=false, updatable=false)
	private double maxSpeed;
	@OneToOne(fetch = FetchType.LAZY, targetEntity=Sanction.class, cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Sanction sanction;
	
	public Inquiry() {
		
	}
	
	public Inquiry(String license, double speed, String location, double maxSpeed) {
		this();
		this.dateOfIssue=new Date(System.currentTimeMillis());
		this.speed=speed;
		this.maxSpeed=maxSpeed;
		this.location=location;
		this.owner=findOwner(license);
	}

	private Owner findOwner(String license) {
		OwnerDao dao=new OwnerDao();
		return dao.findByLicense(license);
	}

	public Sanction createSanctionFor(String dni) {
		int points=calculatePoints();
		int amount=calculateAmount();
		Sanction sanction=new Sanction();
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni(dni);
		sanction.setSanctionHolder(driver);
		sanction.setPoints(points);
		sanction.setAmount(amount);
		GeneralDao<Sanction> daoSanction=new GeneralDao<>();
		daoSanction.insert(sanction);
		return sanction;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	private int calcular_menores60 (String modo) {
		int velocidadeslimite [] = {31, 50, 51, 60, 61, 70, 71, 80};
		int incr;
		switch((int)maxSpeed) {
			case 30: incr = 0;  break;
			case 40: incr = 10; break;
			case 50: incr = 20; break;
			default: return 0;
		}
		return tratarvelocidad (velocidadeslimite, incr,  modo);
	}
	private int calcular_mayores60 (String modo) {
		int velocidadeslimite [] = {61, 90, 91, 110, 111, 120, 121, 130};
		int incr;
		switch((int)maxSpeed) {
			case 60:  incr = 0;  break;
 			case 70:  incr = 10; break;
			case 80:  incr = 20; break;
			case 90:  incr = 30; break;
			case 100: incr = 40; break;
			case 110: incr = 50; break;
			case 120: incr = 60; break;
			default:  return 0;
		}
		return tratarvelocidad (velocidadeslimite, incr, modo);
	}
	private int tratarvelocidad (int velocidades[], int incremento, String modo) {
		int points, amount;
		for (int i= 0; i < velocidades.length; i++)
			velocidades [i] += incremento;
		if (speed>=velocidades[0] && speed<=velocidades[1]) {
			points = 0; amount = 100;
		}
		else if (speed>=velocidades[2] && speed<=velocidades[3]) {
			points = 2; amount = 300;
		}
		else if (speed>=velocidades[4] && speed<=velocidades[5]) {
			points = 4; amount = 400;
		}
		else if (speed>=velocidades[6] && speed <= velocidades[7]) {
			points = 6; amount = 500;
		}
		else {
			points = 6; amount = 600;
		}
		
		if (modo.equals("points"))
			return points;
		else
			return amount;
	}
	private int calculatePoints() {
		if (maxSpeed < 60)
			return calcular_menores60("points");
		else
			return calcular_mayores60("points");
	}
	private int calculateAmount() {
		if (maxSpeed < 60)
			return calcular_menores60("amount");
		else
			return calcular_mayores60("amount");
	}
}