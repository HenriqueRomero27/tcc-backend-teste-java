package application.animal.controller;

import application.animal.Animal;
import application.animal.AnimalResponseDTO;
import application.animal.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalsController {
    @Autowired
    private AnimalRepository animalrepository;

    @GetMapping
    public List<AnimalResponseDTO> getAll() {
        List<AnimalResponseDTO> animalList = animalrepository.findAll().stream().map(AnimalResponseDTO::new).toList();
        return animalList;
    }

}