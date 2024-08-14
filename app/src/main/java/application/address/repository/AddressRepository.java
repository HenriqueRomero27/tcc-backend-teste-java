package application.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.address.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
