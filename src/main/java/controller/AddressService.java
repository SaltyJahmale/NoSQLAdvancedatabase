package controller;

import model.Address;

import javax.persistence.EntityManager;

/**
 * Created by dewi on 12.11.16.
 */
public class AddressService {

    private EntityManager entityManager;

    public AddressService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Address createAddress(Address address) {
        entityManager.persist(address);
        return address;
    }
}
