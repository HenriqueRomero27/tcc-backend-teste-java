package application.address.model;

import application.address.dto.AddressRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "address")
@Entity(name = "address")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Address {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String zip_code;
    private String complement;
    private String neighborhood;
    private Integer number;
    private String city;
    private String state;

    public Address(AddressRequestDTO data) {
        this.street = data.street();
        this.zip_code = data.zip_code();
        this.complement = data.complement();
        this.neighborhood = data.neighborhood();
        this.number = data.number();
        this.city = data.city();
        this.state = data.state();
    }
}
