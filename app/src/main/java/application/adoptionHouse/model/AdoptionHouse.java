package application.adoptionHouse.model;

import application.adoptionHouse.dto.AdoptionHouseRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "adoption-houses")
@Entity(name = "adoption-houses")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class AdoptionHouse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String cnpj;
    private String pictures;
    private String logo;
    private String number;
    private String email;

    public AdoptionHouse(AdoptionHouseRequestDTO data) {
        this.name = data.name();
        this.cnpj = data.cnpj();
        this.pictures = data.pictures();
        this.logo = data.logo();
        this.number = data.number();
        this.email = data.email();
    }
}
