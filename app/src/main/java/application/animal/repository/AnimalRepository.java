package application.animal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.animal.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}