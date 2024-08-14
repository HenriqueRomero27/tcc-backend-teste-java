package application.address.dto;

public record AddressRequestDTO(String street, String zip_code, String complement, String neighborhood, Integer number, String city, String state) {
    
}
