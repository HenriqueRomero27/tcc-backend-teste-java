package application.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.animal.dto.AnimalResponseDTO;
import application.user.dto.UserRequestDTO;
import application.user.dto.UserResponseDTO;
import application.user.model.User;
import application.user.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping("/create")
    @PostMapping
    public void saveUser(@RequestBody UserRequestDTO data) {
        User userData = new User(data);
        userRepository.save(userData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")    
    @RequestMapping("/list")
    @GetMapping
    public List<UserResponseDTO> getAll() {
        List<UserResponseDTO> userList = userRepository.findAll().stream().map(UserResponseDTO::new).toList();
        return userList;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
