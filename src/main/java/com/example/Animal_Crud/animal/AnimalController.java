package com.example.Animal_Crud.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService service;


    /**
     * Gets a list of all animals in the database
     * http://localhost:8080/animals/all
     * @return - a list of all animals
     */
    @GetMapping("/all")
    public List<Animal> getAllAnimals(){
        return service.getAllAnimals();
    }

    /**
     * Gets a specific animal by it's ID
     * http://localhost:8080/animals/all/2
     * @param animalId - the animal Id to query
     * @return - an animal
     */
    @GetMapping("/{animalId}")
    public Animal getAnimalById(@PathVariable int animalId){
        return service.getAnimalById(animalId);
    }

    /**
     * Gets all animals of a set species
     * http://localhost:8080/animals?species=toad
     * @param species - the species to be found
     * @return - all animals of that species
     */
    @GetMapping("")
    public List<Animal> getAnimalsBySpecies(@RequestParam(name = "species", defaultValue = "toad") String species){
        return service.getAnimalBySpecies(species);
    }

    /**
     * Gets all animals with a string in their name
     * http://localhost:8080/animals?name=toad
     * @param name - the string to be found in the name
     * @return a list of all animals with that string in their name
     */
    @GetMapping("")
    public List<Animal> getAnimalsByName(@RequestParam(name = "name", defaultValue = "toad") String name){
        return service.getAnimalByName(name);
    }

    /**
     * Creates a new animal
     * http://localhost:8080/animals/new
     * data {"animalID": 1, "animalName": "test", "animalSpecies": toad, "animalHabitat": "wherever", "animalSciname": "scitest", "animalDescription": "no"}
     * @param animal - the animal to be added
     * @return - an updated list of all animals
     */
    @PostMapping("/new")
    public List<Animal> addNewAnimal(@RequestBody Animal animal){
        service.addNewAnimal(animal);
        return service.getAllAnimals();
    }

    /**
     * Updates an animal by Id
     * http://localhost:8080/animals/update/2
     * data {"animalID": 1, "animalName": "test", "animalSpecies": toad, "animalHabitat": "wherever", "animalSciname": "scitest", "animalDescription": "no"}
     * @param animalId - the animal id to be updated
     * @param animal - the updated animal info
     * @return - the updated animal
     */
    @PutMapping("/update/{animalId}")
    public Animal updateAnimal(@PathVariable int animalId, @RequestBody Animal animal){
        service.updateAnimal(animalId, animal);
        return getAnimalById(animalId);
    }

    /**
     * Deletes an animal by it's animal Id
     * http://localhost:8080/animals/update/delete/2
     * @param animalID - the animal Id to be deleted
     * @return - an updated list of all animals
     */
    @DeleteMapping("/delete/{animalId}")
    public List<Animal> deleteAnimalById (@PathVariable int animalID){
        service.deleteAnimalById(animalID);
        return service.getAllAnimals();
    }

}
