package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
    
}
