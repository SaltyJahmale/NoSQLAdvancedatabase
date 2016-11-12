package controller;

import model.Employee;

import javax.persistence.EntityManager;

/**
 * Created by dewi on 12.11.16.
 */
public class EmployeeService {

    private EntityManager entityManager;

    public EmployeeService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Employee createEmployee(Employee employee) {
        entityManager.persist(employee);
        return employee;
    }
}
