/**
 * 
 */
package com.sj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author CHETANA J N
 *
 */
public class Customerdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			SessionFactory	factory=new Configuration().configure().buildSessionFactory();
				Session session=factory.openSession();
			Transaction tr=session.beginTransaction();
               Date doc=new Date(2,2,2019);
               Customer c1=new Customer(2,"bca",doc);
               
               session.save(c1);
               tr.commit();
               session.close();
               
               System.out.println("record added");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
               
	}

}
