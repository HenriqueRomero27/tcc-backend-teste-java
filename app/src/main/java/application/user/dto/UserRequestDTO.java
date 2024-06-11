package application.user.dto;

public record UserRequestDTO(Long id, String name, String cpf, String email, String birthday, String number, String profile_image) {
    
}
