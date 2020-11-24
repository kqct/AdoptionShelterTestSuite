package assignment3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShelterTest {
    // The shelter
    DogShelter shelter;

    // My extra test 🐶
    Dog M = new Dog("Max", 11, 0, 2, 100.0);

    // The dogs in the original tree
    Dog R = new Dog("Rex", 8, 100, 5, 50.0);
    Dog S = new Dog("Stella", 5, 50, 2, 250.0);
    Dog L = new Dog("Lessie", 3, 70, 9, 25.0);
    Dog P = new Dog("Poldo", 10, 60, 1, 35.0);
    Dog B = new Dog("Bella", 1, 55, 15, 120.0);
    Dog C = new Dog("Cloud", 4, 10, 23, 80.0);
    Dog A = new Dog("Archie", 6, 120, 18, 40.0);
    Dog D = new Dog("Daisy", 7, 15, 12, 35.0);

    @BeforeEach


    @Test
    void ShelterOneYoungerDogLowerPriority() {

    }

    @Test
    void ShelterOneYoungerDogHigherPriority() {

    }

    @Test
    void ShelterOneOlderDogLowerPriority() {

    }

    @Test
    void ShelterOneOlderDogHigherPriority() {

    }

    @Test
    void ShelterSeveralDogsRightRotation() {

    }

    @Test
    void ShelterSeveralDogsLeftRotation() {

    }

    // Should there be test cases for several dogs, younger/older?
}