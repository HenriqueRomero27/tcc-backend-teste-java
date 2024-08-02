package application.adoptionRequest.dto;

import application.adoptionHouse.model.AdoptionHouse;
import application.animal.model.Animal;
import application.user.model.User;

public record AdoptionRequestDTO(User user, Animal animal, AdoptionHouse adoptionHouse) {
    
}
