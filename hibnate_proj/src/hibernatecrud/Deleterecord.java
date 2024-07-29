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
public class Deleterecord {
    public static void main(String args[]){
    SessionFactory sf=
       new Configuration().configure().buildSessionFactory();  
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter registration No to delete record");
       int regNo = sc.nextInt();
       Company cmp=
          (Company)session.get(Company.class, regNo);
       if(cmp==null)
       {
        System.out.println("No record found");
       }
       else{
       session.delete(cmp);
       System.out.println("record-deleted");
        }
       tx.commit();
       session.close();
}
}
