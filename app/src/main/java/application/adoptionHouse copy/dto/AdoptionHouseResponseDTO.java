package application.adoptionHouse.dto;

import application.adoptionHouse.model.AdoptionHouse;

public record AdoptionHouseResponseDTO(Long id, String name, String cnpj, String pictures, String logo, String number, String email) {
    public AdoptionHouseResponseDTO(AdoptionHouse adoptionHouse) {
        this(adoptionHouse.getId(),
            adoptionHouse.getName(),
            adoptionHouse.getCnpj(),
            adoptionHouse.getPictures(),
            adoptionHouse.getLogo(),
            adoptionHouse.getNumber(),
            adoptionHouse.getEmail()
        );
    }  
}
