package org.techamol;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HQLDeleteApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Query q=session.createQuery("delete from Employee e where e.id=:empid");
		q.setParameter("empid",2);
		int value=q.executeUpdate();
		 if(value>0)
		 {
			System.out.println("Record deleted Success............."); 
		 }
		 else
		 {
			 System.out.println("Some problem is there..............");
		 }
		 t.commit();
		 session.close();
	}

}
