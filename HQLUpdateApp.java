package org.techamol;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HQLUpdateApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Query q = session.createQuery("update Employee emp set emp.name=?,emp.sal=? where emp.id=?");
		q.setParameter(0, "Raju");
		q.setParameter(1, 52000);
		q.setParameter(2, 4);
		int value = q.executeUpdate();
		if (value > 0) {
			System.out.println("Record Updated Success............");
		} else {
			System.out.println("Some problem is there................");
		}
		t.commit();
		session.close();
	}

}
