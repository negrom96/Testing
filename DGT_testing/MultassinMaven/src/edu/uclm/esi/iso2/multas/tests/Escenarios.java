package edu.uclm.esi.iso2.multas.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import edu.uclm.esi.iso2.multas.dao.DriverDao;
import edu.uclm.esi.iso2.multas.dao.GeneralDao;
import edu.uclm.esi.iso2.multas.domain.Driver;
import edu.uclm.esi.iso2.multas.domain.Inquiry;
import edu.uclm.esi.iso2.multas.domain.Manager;
import edu.uclm.esi.iso2.multas.domain.Sanction;
import junit.framework.Assert;

public class Escenarios {
	private Configuration cfg;
	private SessionFactory factory;
	private Session session;

	@Test
	public void testCreacionDeExpediente() {
		Manager m=Manager.get();
		int idExpediente=m.openInquiry("0001", 140, "CR", 90);
		Sanction multa=m.identifyDriver(idExpediente, "5000000");
		m.pay(multa.getId());
	}

}
