package application.adoptionRequest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.adoptionHouse.model.AdoptionHouse;
import application.adoptionRequest.model.AdoptionRequest;

public interface AdoptionRequestRepository extends JpaRepository<AdoptionRequest, Long> {
    
}
