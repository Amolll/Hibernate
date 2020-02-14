package org.techamol;
import org.hibernate.*;
import org.hibernate.cfg.*;
 public class ConfigApp
 {
    public static void main(String x[])
    {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	Employee emp=new Employee();
	emp.setId(4);
	emp.setName("");
	emp.setSal(20000);
	session.save(emp);
	t.commit();
	session.close();

    }
 }