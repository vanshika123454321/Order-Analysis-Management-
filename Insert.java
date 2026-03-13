package com.example;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {

   public static void main(String[] args) {

       SessionFactory factory =
               new Configuration()
               .configure("hibernate.cfg.xml")
               .addAnnotatedClass(Orders.class)
               .buildSessionFactory();

       Session session = factory.openSession();

       session.beginTransaction();

       Orders b1 = new Orders("Pen stand",200,1201,new Date());

       session.save(b1);
       Orders b2 = new Orders("Cushion covers",500,1202,new Date());

       session.save(b2);

       Orders b3 = new Orders("Squishies",150,1203,new Date());

       session.save(b3);

       Orders b4 = new Orders("Chocolates",100,1204,new Date());

       session.save(b4);

       Orders b5 = new Orders("Gift wraps",50,1205,new Date());

       session.save(b5);

       Orders b6 = new Orders("Jewellery",500,1206,new Date());

       session.save(b6);

       Orders b7 = new Orders("Utensils",450,1207,new Date());

       session.save(b7);

       Orders b8 = new Orders("Watch",2000,1208,new Date());

       session.save(b8);

       Orders b9 = new Orders("Earphones",500,1209,new Date());

       session.save(b9);

       Orders b10 = new Orders("Phone case",250,1210,new Date());

       session.save(b10);
       session.getTransaction().commit();

       session.close();
       factory.close();

       System.out.println("Data inserted successfully");

   }
}