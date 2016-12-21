package edu.uclm.esi.iso2.multas;

import static org.junit.Assert.*;
import java.sql.Date;
import org.junit.Test;
import edu.uclm.esi.iso2.multas.dao.GeneralDao;
import edu.uclm.esi.iso2.multas.domain.Driver;
import edu.uclm.esi.iso2.multas.domain.Inquiry;
import edu.uclm.esi.iso2.multas.domain.Manager;
import edu.uclm.esi.iso2.multas.domain.Owner;
import edu.uclm.esi.iso2.multas.domain.Sanction;
import edu.uclm.esi.iso2.multas.domain.SanctionHolder;
import edu.uclm.esi.iso2.multas.domain.Vehicle;

public class TestManager {
	@Test
	public void test140_120() {
		Manager m = Manager.get();
        int idExpediente = m.openInquiry("0001", 140, "La Ronda", 120);
        GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
        Sanction multa= m.identifyDriver(idExpediente, "5000002");
        m.pay(multa.getId());
        assertTrue(multa.getAmount() == 100);
        assertTrue(multa.getPoints()==0);
	}
	@Test
	public void test160_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 160, "La Ronda", 120);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test175_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 175, "La Ronda", 120);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test185_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 185, "La Ronda", 120);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test200_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 200, "La Ronda", 120);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test120_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test150_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}	
	@Test
	public void test165_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 165, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test175_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 175, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test185_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 185, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test110_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test140_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test155_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 155, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test165_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 165, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	
	@Test
	public void test175_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 175, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test100_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 100, "La Ronda", 90);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test130_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La Ronda", 90);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test145_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 145, "La Ronda", 90);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test155_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 155, "La Ronda", 90);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test165_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 165, "La Ronda", 90);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test90_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test120_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test135_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 135, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test145_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 145, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test155_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 155, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test80_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test110_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}

	@Test
	public void test125_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 125, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test145_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 145, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test135_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 135, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test85_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 85, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test105_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001",105, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test115_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 115, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test125_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 125, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test135_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 135, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test60_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 60, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test75_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 75, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test85_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 85, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test95_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 95, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test105_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 105, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test50_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 50, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test65_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 65, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test75_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 75, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test85_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 85, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test95_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 95, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test40_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 40, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test55_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 55, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test65_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 65, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test75_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 75, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test85_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 85, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test121_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 121, "La Ronda", 120);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test150_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La Ronda", 120);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test151_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 151, "La Ronda", 120);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test170_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 170, "La Ronda", 120);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test171_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 171, "La Ronda", 120);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test180_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 175, "La Ronda", 120);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test181_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 181, "La Ronda", 120);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test190_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 190, "La Ronda", 120);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test191_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 200, "La Ronda", 120);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test111_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 111, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test140_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test141_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 141, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}	
	@Test
	public void test160_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 160, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}	
	@Test
	public void test161_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 161, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test170_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 170, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test171_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 171, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test180_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 180, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test181_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 181, "La Ronda", 110);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test101_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 101, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test130_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test131_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 131, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test150_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test151_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 155, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test160_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 155, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test161_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 161, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test170_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 170, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test171_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 171, "La Ronda", 100);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}

	@Test
	public void test91_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 91, "La Ronda", 90);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test120_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La Ronda", 90);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test121_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 121, "La Ronda", 90);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test140_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La Ronda", 90);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test151_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 151, "La Ronda", 90);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test160_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 160, "La Ronda", 90);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test161_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 161, "La Ronda", 90);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test81_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 81, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test110_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test111_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 111, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test130_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test131_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 135, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test140_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test141_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 141, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test150_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test151_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 151, "La Ronda", 80);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test71_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 71, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test100_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 100, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test101_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 101, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test120_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test121_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 121, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test130_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test141_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 141, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test131_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 131, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test140_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La Ronda", 70);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test61_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 61, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test90_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test91_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001",91, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test110_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001",110, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test111_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 111, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test120_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test121_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 121, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test130_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test131_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 131, "La Ronda", 60);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test51_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 51, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test70_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 70, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test71_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 71, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void tes80_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test81_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 81, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test90_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test91_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 91, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test100_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001",100, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test101_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 101, "La Ronda", 50);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test41_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 41, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test60_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 60, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test61_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 61, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test70_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 70, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test71_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 71, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test80_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test81_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 81, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test90_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test91_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 91, "La Ronda", 40);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test31_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 31, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test50_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 50, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 100);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void test51_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 51, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test60_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 60, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 300);
		assertTrue (multa.getPoints() == 2);
	}
	@Test
	public void test61_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 61, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test70_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 70, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 400);
		assertTrue (multa.getPoints() == 4);
	}
	@Test
	public void test71_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 71, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test80_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 500);
		assertTrue (multa.getPoints() == 6);
	}
	@Test
	public void test81_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 81, "La Ronda", 30);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 600);
		assertTrue (multa.getPoints() == 6);
	}
	
	@Test
	public void testSanctionHolder(){
		SanctionHolder s = new SanctionHolder("07654123", "Pedro", "Por su Casa", "Narnia al fin del mundo") {};
		SanctionHolder s1 = new SanctionHolder("07654123", "Pedro", "Por su Casa", "Narnia al fin del mundo") {};
		assertTrue(s.getName().equals("Pedro"));
		assertTrue(s.getLastName().equals("Por su Casa"));
		assertTrue(s.getFullAddress().equals("Narnia al fin del mundo"));
		assertTrue(s.getDni().equals("07654123"));
		assertTrue(!s.equals(s1));
		assertNotNull(s);
		assertFalse(s.hashCode()==0);
		
	}
	
	@Test
	public void testVehicle(){
		Vehicle v = new Vehicle("1996ZZZ");
		Vehicle v2 = new Vehicle("1996AAA");
		assertTrue(v.getLicense().equals("1996ZZZ"));
		v.setLicense("0001");
		assertTrue(v.getLicense().equals("0001"));
		v.setOwner(new Owner());
		assertTrue(!v.equals(v2));
		assertFalse(v.hashCode() == 0);
		
	}
	
	@Test 
	public void testOwner(){
		Owner o = new Owner("00000001", "Miguel", "Negro", "Esi");
		assertTrue(o.getDni().equals("00000001"));
		assertTrue(o.getFullAddress().equals("Esi"));
		assertTrue(o.getName().equals("Miguel"));
		assertTrue(o.getLastName().equals("Negro"));
		o.setName("Pablo");
		assertTrue(o.getName().equals("Pablo"));
		assertNotNull(o);
	}
	
	@Test
	public void testDriver(){
		Driver d = new Driver("0000001", "Paquito", "Chocolatero", "esi");
		assertNotNull(d);
		assertTrue(d.getPoints()==12);
		d.setPoints(8);
		assertTrue(d.getPoints() == 8);
	}
	@Test
	public void testSanction() {
		Sanction multa = new Sanction ();
		Sanction multa2 = new Sanction ();
		Date aux = new Date(0);
		multa.setDateOfPayment(aux);
		assertTrue(multa.getDateOfPayment().equals(aux));
		multa.setDateOfReception(aux);
		assertTrue(multa.getDateOfReception().equals(aux));
		assertNull(multa.getSanctionHolder());
		assertTrue(multa.equals(multa2));
		assertFalse(multa.hashCode() == 0);
	}
	@Test
	public void testInquiry() {
		Date aux = new Date(0);
		Inquiry i = new Inquiry ("0001", 80, "La Ronda", 30);
		i.setId(2);
		i.setDateOfIssue(aux);
		i.setLocation("Ronda del Parque");
		i.setMaxSpeed(100);
		i.setSpeed(120);
		assertTrue(i.getLocation().equals("Ronda del Parque"));
		assertTrue(i.getId() == 2);
		assertTrue(i.getDateOfIssue().equals(aux));
		assertTrue(i.getMaxSpeed() == 100);
		assertTrue(i.getSpeed() == 120);
	}
	@Test
	public void testDefaultcase_menor60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 81, "La Ronda", 45);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 0);
		assertTrue (multa.getPoints() == 0);
	}
	@Test
	public void testDefaultcase_mayor60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 134, "La Ronda", 92);
		GeneralDao <Inquiry>dao = new GeneralDao<>();
        Inquiry i=dao.findById(Inquiry.class, idExpediente);
        assertNotNull(i);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		m.pay(multa.getId());
		assertTrue (multa.getAmount() == 0);
		assertTrue (multa.getPoints() == 0);
	}
}