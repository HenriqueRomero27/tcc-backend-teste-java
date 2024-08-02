package application.adoptionHouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import application.adoptionHouse.dto.AdoptionHouseRequestDTO;
import application.adoptionHouse.dto.AdoptionHouseResponseDTO;
import application.adoptionHouse.model.AdoptionHouse;
import application.adoptionHouse.repository.AdoptionHouseRepository;

@RestController
@RequestMapping("/adoption-houses")
public class AdoptionHouseController {
    @Autowired
    private AdoptionHouseRepository adoptionHouseRepositoty;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/create") 
    public void saveAdoptionHouse(@RequestBody AdoptionHouseRequestDTO data) {
        AdoptionHouse adoptionHouseData = new AdoptionHouse(data);

        adoptionHouseRepositoty.save(adoptionHouseData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/list")
    public List<AdoptionHouseResponseDTO> getAll() {
        List<AdoptionHouseResponseDTO> adoptionHouseList = adoptionHouseRepositoty.findAll().stream().map(AdoptionHouseResponseDTO::new).toList();
        return adoptionHouseList;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAdoptionHouse(@PathVariable Long id) {        
        adoptionHouseRepositoty.deleteById(id);
    }
}
