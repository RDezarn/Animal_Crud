package com.example.Animal_Crud.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository  extends JpaRepository<Animal, Integer> {

    List<Animal> getAnimalsBySpecies(String species);

    @Query(value = "select * from animals s where s.animalName like ?1", nativeQuery = true)
    List<Animal> getAnimalsByName(String name);

}
