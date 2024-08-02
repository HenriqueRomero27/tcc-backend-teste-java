package application.adoptionRequest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.adoptionRequest.dto.AdoptionRequestDTO;
import application.adoptionRequest.dto.AdoptionRequestResponseDTO;
import application.adoptionRequest.model.AdoptionRequest;
import application.adoptionRequest.repository.AdoptionRequestRepository;

import java.util.List;

@RestController
@RequestMapping("/adoption-houses")
public class AdoptionRequestController {
    @Autowired
    private AdoptionRequestRepository adoptionRequestRepositoty;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping 
    public void saveAdoptionRequest(@RequestBody AdoptionRequestDTO data) {
        AdoptionRequest adoptionRequestData = new AdoptionRequest(data);

        adoptionRequestRepositoty.save(adoptionRequestData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<AdoptionRequestResponseDTO> getAll() {
        List<AdoptionRequestResponseDTO> adoptionRequestList = adoptionRequestRepositoty.findAll().stream().map(AdoptionRequestResponseDTO::new).toList();
        return adoptionRequestList;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAdoptionRequest(@PathVariable Long id) {        
        adoptionRequestRepositoty.deleteById(id);
    }
}
