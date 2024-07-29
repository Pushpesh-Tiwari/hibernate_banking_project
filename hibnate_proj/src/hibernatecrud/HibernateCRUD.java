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
public class HibernateCRUD {
    public static void main(String args[]){
        SessionFactory sf=
       new Configuration().configure().buildSessionFactory();  
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       Scanner sc = new Scanner(System.in);
       System.out.println("ENter registration No1");
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
//       Company cmp =
//          new Company(1211,"TCS","Indore","10","Java");
//       session.save(cmp);  // replacemet of insert query
//       tx.commit();
//       session.close();
//         System.out.println("Record inserted");
//SEVERE: Unsuccessful: create table cmptable1 
//(registrationNo1 integer not null, companyname1 varchar(255), 
//city1 varchar(255), rank1 varchar(255), platform1 varchar(255), primary key (registrationNo1))
//Jul 03, 2024 10:21:15 PM org.hibernate.tool.hbm2ddl.SchemaUpdate execute
//SEVERE: Table 'cmptable1' already exists