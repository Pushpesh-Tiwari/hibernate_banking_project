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
public class updaterec {
   public static void main(String args[]){
        SessionFactory sf=
       new Configuration().configure().buildSessionFactory();  
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       Scanner sc = new Scanner(System.in);
       System.out.println("ENter registration No");
       int regNo = sc.nextInt();
       Company cmp=
          (Company)session.get(Company.class, regNo);
       if(cmp==null)
       {
         System.out.println("Record not found");
       }    
       else
       {
         System.out.println(cmp.getRegNo()+" "+
                 cmp.getCompName()+" "+cmp.getRank()+
                 cmp.getCity()+" "+cmp.getPlatform());
         
         System.out.println("Enter updated company name");
         String ucompName = sc.next();
         cmp.setCompName(ucompName);
         session.update(cmp);
         tx.commit();
         System.out.println("Recordupdated successfully");
         System.out.println(cmp.getRegNo()+" "+
                 cmp.getCompName()+" "+cmp.getRank()+
                 cmp.getCity()+" "+cmp.getPlatform());
       }
    }
}
