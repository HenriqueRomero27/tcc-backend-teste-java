package application.address.controller;

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

import application.address.dto.AddressRequestDTO;
import application.address.dto.AddressResponseDTO;
import application.address.model.Address;
import application.address.repository.AddressRepository;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressRepository addressRepositoty;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/") 
    public void saveAddress(@RequestBody AddressRequestDTO data) {
        Address addressData = new Address(data);

        addressRepositoty.save(addressData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/")
    public List<AddressResponseDTO> getAll() {
        List<AddressResponseDTO> addressList = addressRepositoty.findAll().stream().map(AddressResponseDTO::new).toList();
        return addressList;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAddress(@PathVariable Long id) {        
        addressRepositoty.deleteById(id);
    }
}
