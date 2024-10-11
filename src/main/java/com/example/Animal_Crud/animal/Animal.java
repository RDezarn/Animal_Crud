package com.example.Animal_Crud.animal;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int animalId;

    @Column(nullable = false)
    private String animalName;

    @Column(nullable = false)
    private String animalSpecies;

    @Column(nullable = false)
    private String animalHabitat;

    private String animalSciname;
    private String animalDescription;

    /**
     * Creates a new animal
     * @param newID - the animal's ID
     * @param newName - the animal's name
     * @param newSpecies - the animal's species
     * @param newHabitat - the animal's habitat
     */
    public Animal(int newID, String newName, String newSpecies, String newHabitat){
        this.animalId = newID;
        this.animalName = newName;
        this.animalSpecies = newSpecies;
        this.animalHabitat = newHabitat;
    }

    /**
     * Creates a new animal
     * @param newID - the animal's ID
     * @param newName - the animal's name
     * @param newSpecies - the animal's species
     * @param newHabitat - the animal's habitat
     * @param newSci - the animal's scientific name
     * @param newDes - the animal's description
     */
    public Animal(int newID, String newName, String newSpecies, String newHabitat, String newSci, String newDes){
        this.animalId = newID;
        this.animalName = newName;
        this.animalSpecies = newSpecies;
        this.animalHabitat = newHabitat;
        this.animalSciname = newSci;
        this.animalDescription = newDes;
    }

    public int getAnimalId() {
        return animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public String getAnimalHabitat() {
        return animalHabitat;
    }

    public String getAnimalSciname() {
        return animalSciname;
    }

    public String getAnimalDescription() {
        return animalDescription;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalSpecies(String animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

    public void setAnimalHabitat(String animalHabitat) {
        this.animalHabitat = animalHabitat;
    }

    public void setAnimalSciname(String animalSciname) {
        this.animalSciname = animalSciname;
    }

    public void setAnimalDescription(String animalDescription) {
        this.animalDescription = animalDescription;
    }
}
