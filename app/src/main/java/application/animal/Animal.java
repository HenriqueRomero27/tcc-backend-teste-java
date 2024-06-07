package application.animal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "animals")
@Entity(name = "animals")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Animal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private String breed;
    private String coatColor;
    private String coatLength;
    private String situation;
    private String behavior;
    private String observation;
    private String image;

    public Animal(AnimalRequestDTO data) {
        this.name = data.name();
        this.age = data.age();
        this.gender = data.gender();
        this.breed = data.breed();
        this.coatColor = data.coatColor();
        this.coatLength = data.coatLength();
        this.situation = data.situation();
        this.behavior = data.behavior();
        this.observation = data.observation();
        this.image = data.image();
    }
}