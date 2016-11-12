import controller.EmployeeService;
import model.Employee;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by dewi on 12.11.16.
 */
public class TestEmployee {

    @Test
    public void createEmployee() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        EmployeeService employeeService = new EmployeeService(entityManager);

        Employee employee1 = new Employee();

        entityManager.getTransaction().begin();
        Employee employee = employeeService.createEmployee(employee1);
        entityManager.persist(employee);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

}
