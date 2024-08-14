package application.address.dto;

import application.address.model.Address;

public record AddressResponseDTO(Long id, String street, String zip_code, String complement, String neighborhood, Integer number, String city, String state) {
    public AddressResponseDTO(Address address) {
        this(address.getId(),
            address.getStreet(),
            address.getZip_code(),
            address.getComplement(),
            address.getNeighborhood(),
            address.getNumber(),
            address.getCity(),
            address.getState()
        );
    }  
}
