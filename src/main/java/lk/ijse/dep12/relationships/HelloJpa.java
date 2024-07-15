package lk.ijse.dep12.relationships;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lk.ijse.dep12.relationships.util.JpaUtil;

public class HelloJpa {
    public static void main(String[] args) {
        try(EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
            EntityManager entityManager = entityManagerFactory.createEntityManager()){
            System.out.println("EntityManagerFactory is " + entityManagerFactory);
            System.out.println("EntityManager is " + entityManager);

        }
    }
}
