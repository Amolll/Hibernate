package org.techamol;


import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class HQLApp
{
   public static void main(String x[])
   {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	Query q=session.createQuery("from Employee emp where emp.id=?");
	q.setParameter(0,3);//here 0 is a parameter index and 2 is value in hql parameter start from 0th
	List list=q.list();
	Iterator i=list.iterator();
	while(i.hasNext())
	{
		Employee emp=(Employee)i.next();
	System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSal());
	}

   }
}