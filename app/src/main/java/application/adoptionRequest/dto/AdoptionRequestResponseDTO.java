package application.adoptionRequest.dto;

import application.adoptionHouse.model.AdoptionHouse;
import application.adoptionRequest.model.AdoptionRequest;
import application.animal.model.Animal;
import application.user.model.User;

public record AdoptionRequestResponseDTO(Long id, User user, Animal animal, AdoptionHouse adoptionHouse) {
    public AdoptionRequestResponseDTO(AdoptionRequest adoptionRequest) {
        this(adoptionRequest.getId(),
            adoptionRequest.getUser(),
            adoptionRequest.getAnimal(),
            adoptionRequest.getAdoptionHouse()
        );
    }  
}
