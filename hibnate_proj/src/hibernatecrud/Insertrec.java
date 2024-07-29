/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibernatecrud;
import hibnate_proj.Company;
import java.util.Scanner;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
/**
 *
 * @author DELL
 */
public class Insertrec {
    public static void main(String args[]){
        SessionFactory sf=
       new Configuration().configure().buildSessionFactory();  
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter registration No");
       int regNo = sc.nextInt();
       Company cmp=
          (Company)session.get(Company.class, regNo);
       if(cmp==null)
       {
         System.out.println("Enter company name");
         String cmpName = sc.next();
         System.out.println("Enter city name");
         String cityName = sc.next();
         System.out.println("Enter rank");
         String rank = sc.next();
         System.out.println("Enter platform");
         String platform = sc.next();
         Company cmp1=
          new Company(regNo,cmpName,cityName,rank,platform);
         session.save(cmp1);
         tx.commit();
         session.close();
            System.out.println("Record inserted");
       }    
       else
       {
         System.out.println("Record already inserted");
       }
    }
}
