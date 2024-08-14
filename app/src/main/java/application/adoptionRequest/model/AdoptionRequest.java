package application.adoptionRequest.model;

import application.adoptionHouse.model.AdoptionHouse;
import application.adoptionRequest.dto.AdoptionRequestDTO;
import application.animal.model.Animal;
import application.user.model.User;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "adoption-requests")
@Entity(name = "adoption-requests")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class AdoptionRequest {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "adoption-house_id")
    private AdoptionHouse adoptionHouse;

    private String message;

    public AdoptionRequest(AdoptionRequestDTO data) {
        this.user = data.user();
        this.animal = data.animal();
        this.adoptionHouse = data.adoptionHouse();
        this.message = data.message();
    }
}
