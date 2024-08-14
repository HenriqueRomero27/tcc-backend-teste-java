package application.adoptionRequest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.adoptionRequest.model.AdoptionRequest;

public interface AdoptionRequestRepository extends JpaRepository<AdoptionRequest, Long> {
    
}
