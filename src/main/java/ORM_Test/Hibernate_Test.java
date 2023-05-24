package ORM_Test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class Hibernate_Test {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;


    public static void main(String[] args) {


        Customer customer = new Customer(150, "علی رضا", "همدانی", "اصفهان");
        Hibernate_Test ht = new Hibernate_Test();
        ht.createAccount(customer);

    }

    void createAccount(Customer customer) {


        try {

            Configuration configuration = new Configuration();
            configuration.addResource("Customer.hbm.xml");
            configuration.configure();


            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }

        try {
            Session session = sessionFactory.openSession();
Transaction t= session.beginTransaction();
            session.save(customer);
            t.commit();
            session.close();

        } catch (Exception e) {
            System.out.println("Message :" + e.getMessage());
            System.out.println(" cause :" + e.getCause());
            e.printStackTrace();
        }
/*
            Configuration configuration = new Configuration();


            configuration.configure("Hibernate.cfg.xml");


            org.hibernate.service.ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            //configuration.addResource("Customer.hbm.xml");

            //ServiceRegistry serviceRegistry = (ServiceRegistry) new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            Session session = sessionFactory.openSession();

            session.beginTransaction();
            session.save(customer);
            session.getTransaction().commit();

            sessionFactory.close();


 */


    }


}

