package application.animal.controller;

import application.animal.model.Animal;
import application.animal.repository.AnimalRepository;
import application.animal.dto.AnimalRequestDTO;
import application.animal.dto.AnimalResponseDTO;

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

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animal")
public class AnimalsController {
    @Autowired
    private AnimalRepository animalrepository;
    
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveAnimal(@RequestBody AnimalRequestDTO data) {
        Animal animalData = new Animal(data);
        
        animalrepository.save(animalData);
        System.out.print(animalData);
        return;
        
    }
        
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<AnimalResponseDTO> getAll() {
        List<AnimalResponseDTO> animalList = animalrepository.findAll().stream().map(AnimalResponseDTO::new).toList();
        return animalList;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnimal (@PathVariable Long id) {
        animalrepository.deleteById(id);
    }

    // @PutMapping("/{id}")
    // public void updateUser(@PathVariable Long id, @RequestBody Animal animal) {
    //     animalrepository.
    // }

}