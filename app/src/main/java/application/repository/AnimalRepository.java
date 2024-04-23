package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Long>{ 
    
}
