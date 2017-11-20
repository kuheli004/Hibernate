package com.javabrain.main;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.javabrain.model.Employee;

public class StoreData {

	public static void main(String[] args) {
		//creating configuration object
		//Configuration cfg=new Configuration();
		
	/*	AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
		
		//creating seession factory object
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating session object
		Session session=factory.openSession();
		
		//creating transaction object
		Transaction t=session.beginTransaction();*/
			
	/*	Employee e1=new Employee();
		e1.setId(117);
		e1.setFirstName("shalini");
		e1.setLastName("ghosh");
		e1.setSalary(10000);
		
		
		Employee e2=new Employee();
		e2.setId(119);
		e2.setFirstName("pritha");
		e2.setLastName("ghosh");
		e2.setSalary(20000);
		
		Employee e3=new Employee();
		e3.setId(118);
		e3.setFirstName("rahul");
		e3.setLastName("bose");
		e3.setSalary(30000);*/

		/*Employee e4=new Employee();
		e4.setId(120);
		e4.setFirstName("amit");
		e4.setLastName("bose");
		e4.setSalary(40000);
		*/
		
	     @SuppressWarnings("deprecation")
	        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	        Session session = sessionFactory.openSession();
	      /*  Transaction tx=session.beginTransaction();
	   session.save(e4);
	        tx.commit();*/
	       //session.persist(e4);
	       
	
	  /*     Query query=session.createQuery("update Employee set firstname=? where id=?");
	       query.setParameter(0, "chiku");
	       query.setParameter(1, 115);
	  
	        int status=query.executeUpdate();
	        System.out.println("status is :::"+status);*/
	        
	      /* 
	       *       query.setFirstResult(0);
	       *        query.setMaxResults(3);
	        List li=query.list();
	        Iterator it=li.iterator();
	        while(it.hasNext()){
	        	Employee e=(Employee) it.next();
	        	System.out.println("Employee Details:::"+e.getFirstName()+" "+e.getLastName());
	        }
		
		*/
	        
	        /*Criteria crt=session.createCriteria(Employee.class);
	        crt.add(Restrictions.between("salary",20000,30000)).addOrder(Order.desc("salary")).
	        setProjection(Projections.property("firstName"));
	     
	        List li=crt.list();
	        Iterator it=li.iterator();
	        while(it.hasNext()){
	        	String e=(String) it.next();
	        	System.out.println("Employee Details:::"+e);
	        }
	        */
	     /*   Query query=session.getNamedQuery("findEmployeeByName");
	        query.setParameter("name", "rahul");
	        Employee e=(Employee) query.list().get(0);
	        System.out.println("Employee Details:::"+e.getFirstName()+" "+e.getLastName()+" "+e.getSalary());*/
	       
	        Employee emp1=(Employee)session.get(Employee.class,119);  
	        System.out.println(emp1.getId()+" "+emp1.getFirstName()+" "+emp1.getSalary());  
	        session.close();  
	          
	        Session session2=sessionFactory.openSession();  
	        Employee emp2=(Employee)session2.load(Employee.class,119);  
	        System.out.println(emp2.getId()+" "+emp2.getFirstName()+" "+emp2.getSalary());  
	        session2.close();  
	
		System.out.println("successfully saved");

	}

}
