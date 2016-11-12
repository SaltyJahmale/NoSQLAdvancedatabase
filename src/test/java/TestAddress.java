import controller.AddressService;
import model.Address;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by dewi on 12.11.16.
 */
public class TestAddress {

    @Test
    public void createAddress() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        AddressService addressService = new AddressService(entityManager);

        Address address1 = new Address();

        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }

        Address address = addressService.createAddress(address1);
        entityManager.persist(address);
        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();

    }

}
