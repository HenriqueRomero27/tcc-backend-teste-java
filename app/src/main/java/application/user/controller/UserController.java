package application.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
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
    @PostMapping("/create")
    public ResponseEntity saveUser(@RequestBody UserRequestDTO data) {
        User userData = new User(data);
        userRepository.save(userData);
        return ResponseEntity.ok().build();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")    
    @GetMapping("/list")
    public ResponseEntity getAll() {
        var allUsers = userRepository.findAll();
        return ResponseEntity.ok(allUsers);
    }

    // @PatchMapping("/update/{id}")
    // @Transactional
    // public ResponseEntity updateUser(@PathVariable("id") Long id, @RequestBody User user){
    //     return userRepository.findById(id).map(user => {

    //     })
    // }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
