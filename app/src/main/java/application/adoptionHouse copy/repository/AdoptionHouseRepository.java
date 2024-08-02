package application.adoptionHouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.adoptionHouse.model.AdoptionHouse;

public interface AdoptionHouseRepository extends JpaRepository<AdoptionHouse, Long> {
    
}
