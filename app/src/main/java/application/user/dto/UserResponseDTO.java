package application.user.dto;

import application.user.model.User;

public record UserResponseDTO(Long id, String name, String cpf, String email, String birthday, String number, String profile_image) {
    public UserResponseDTO(User user) {
        this(user.getId(),
            user.getName(),
            user.getCpf(),
            user.getEmail(),
            user.getBirthday(),
            user.getNumber(),
            user.getProfile_image()
        );
    }
}
