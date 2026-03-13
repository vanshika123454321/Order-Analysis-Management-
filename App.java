package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class App {

    public static void main(String[] args) {

        SessionFactory factory =
                new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Orders.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();

        Query<Orders> q = session.createQuery("from Orders order by cost", Orders.class);

        List<Orders> list = q.getResultList();

        for (Orders o : list) {
            System.out.println(
                    o.getId() + " " +
                    o.getItem() + " " +
                    o.getCost() + " " +
                    o.getUid() + " " +
                    o.getDate()
            );
        }

        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}