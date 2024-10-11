package com.example.Animal_Crud.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository AnimalRepository;

    /**
     * Gets a list of all animals in the server
     * @return - A list of all animals
     */
    public List<Animal> getAllAnimals() {
        return AnimalRepository.findAll();
    }

    /**
     * Get an animal by a specific animalID
     * @param animalId - the animalID
     * @return - the animal
     */
    public Animal getAnimalById(int animalId) {
        return AnimalRepository.findById(animalId).orElse(null);
    }

    /**
     * Gets all animals of a given species
     * @param Species - the animals species to be found
     * @return - A list of all animals of that species
     */
    public List<Animal> getAnimalBySpecies(String Species){
        return AnimalRepository.getAnimalsBySpecies(Species);
    }

    /**
     * Gets all animals with names that contain a string
     * @param name - the string to be found in the name
     * @return - A list of all animals wiht that string in their name
     */
    public List<Animal> getAnimalByName(String name){
        return AnimalRepository.getAnimalsByName(name);
    }

    /**
     * Adds a new animal to the repository
     * @param animal - the animal to be added
     */
    public void addNewAnimal(Animal animal){
        AnimalRepository.save(animal);
    }

    /**
     * Updates an animal
     * @param animalID - the animal id to be updated
     * @param animal - the updated animal details
     */
    public void updateAnimal(int animalID, Animal animal){
        Animal existing = getAnimalById(animalID);
        existing.setAnimalId(animal.getAnimalId());
        existing.setAnimalName(animal.getAnimalName());
        existing.setAnimalSpecies(animal.getAnimalSpecies());
        existing.setAnimalHabitat(animal.getAnimalHabitat());
        existing.setAnimalSciname(animal.getAnimalSciname());
        existing.setAnimalDescription(animal.getAnimalDescription());

        AnimalRepository.save(existing);
    }

    /**
     * Deletes an animal from the repository
     * @param animalId - the animal id to be deleted
     */
    public void deleteAnimalById(int animalId){
        AnimalRepository.deleteById(animalId);
    }

}
