package com.agriculture_demo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_Agriculture {
	public static void main(String[] args) {
		System.out.println("Project Start");
		SessionFactory factory = new Configuration().configure("com\\agriculture_demo\\Hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Agriculture a1 = new Agriculture(1, "rose", "red", 250.59);
		Agriculture a2 = new Agriculture(2, "Hibiscus ", "white", 170.45);
		Agriculture a3 = new Agriculture(3, "rainlyLily", "pink", 210.89);
		Agriculture a4 = new Agriculture(4, "deliya", "puple", 185.97);

		Transaction t1 = session.beginTransaction();
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(a4);
		t1.commit();

		Transaction t2 = session.beginTransaction();
		List<Agriculture> list = session.createQuery("from Agriculture").list();
		System.out.println("list= " + list);
		t2.commit();
		session.close();
		System.out.println("project end");
	}
}
