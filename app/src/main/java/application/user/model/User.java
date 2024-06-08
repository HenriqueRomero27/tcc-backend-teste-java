package application.user.model;

import jakarta.persistence.Entity;

import java.util.Date;

import application.user.dto.UserRequestDTO;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "users")
@Table(name = "users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String birthday;
    private String number;
    private String profile_image;

    public User(UserRequestDTO data) {
        this.name = data.name();
        this.cpf = data.cpf();
        this.email = data.email();
        this.birthday = data.birthday();
        this.number = data.number();
        this.profile_image = data.profile_image();
    }
}
