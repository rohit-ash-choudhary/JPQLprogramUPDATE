package com.sp.main.JPQLprogramselect;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transaction;

import com.sp.entity.Employee;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory entitymanagerfact=Persistence.createEntityManagerFactory("main-persistence");
         EntityManager em= entitymanagerfact.createEntityManager();
         EntityTransaction et=em.getTransaction();
         try {
        //select employee id form the 
         et = em.getTransaction();
         et.begin();
         
         // Your update query
         String jql_query = "Update Employee e SET e.Adress = :newAdress where e.employee_id = :emp_id";
         Query query = em.createQuery(jql_query);
         query.setParameter("newAdress", "Pak");
         query.setParameter("emp_id", 1);
   
         int count = query.executeUpdate();
      
         if (count > 0) {
             System.out.println("Successfully updated record");
             et.commit();
         } else {
             et.rollback();
             System.out.println("Failed to update record");
         }
         }
         catch(Exception e)
         { 
        	 
        	 e.printStackTrace();
        	 et.rollback();
         }
         finally {
        	 
        	 em.close();
         }
    }
}
