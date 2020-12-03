package assignment3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ShelterTest {
    // The shelter
    DogShelter shelter;

    // My test 🐶
    Dog max = new Dog("Max", 11, 0, 2, 100.0);
    Dog emma = new Dog("Emma", 3, 2, 5, 350.0);
    Dog neptune = new Dog("Neptune", 12, 3, 250, 0.0);
    Dog izzie = new Dog("Izzie", 6, 5, 15, 150.0);
    Dog tyler = new Dog("Tyler", 7, 4, 11, 12.0);

    @AfterEach
    void destroyShelter() {
        shelter = null;
    }

    @Test
    // Neptune is older than Max but has been in the shelter for longer
    void ShelterOneYoungerDogLowerPriority() {
        // Setup
        shelter = new DogShelter(neptune);

        // Test
        shelter.shelter(max);

        // Assert
        assertAll("Sheltering a younger dog with lower priority",
                () -> assertThat("Root node shouldn't change", shelter.root.d, is(neptune)),
                () -> assertThat("Root node should have a younger dog", shelter.root.younger, notNullValue()),
                () -> assertThat("New dog should be younger", shelter.root.younger.d, is(max))
                );
    }

    @Test
    // Neptune is older than Izzie but Izzie has been in the shelter for longer
    void ShelterOneYoungerDogHigherPriority() {
        // Setup
        shelter = new DogShelter(neptune);

        // Test
        shelter.shelter(izzie);

        // Assert
        assertAll("Sheltering a younger dog with higher priority priority",
                () -> assertThat("Root node should change", shelter.root.d, is(izzie)),
                () -> assertThat("Root node should have an older dog", shelter.root.older, notNullValue()),
                () -> assertThat("Original dog should be older", shelter.root.older.d, is(neptune))
        );
    }

    @Test
    // Izzie is younger than Max but has been in the shelter for longer
    void ShelterOneOlderDogLowerPriority() {
        // Setup
        shelter = new DogShelter(izzie);

        // Test
        shelter.shelter(max);

        // Assert
        assertAll("Sheltering an older dog with lower priority",
                () -> assertThat("Root node shouldn't change", shelter.root.d, is(izzie)),
                () -> assertThat("Root node should have an older dog", shelter.root.older, notNullValue()),
                () -> assertThat("New dog should be older", shelter.root.older.d, is(max))
        );
    }

    @Test
    // Max is younger than Neptune but hasn't been in the shelter for as long
    void ShelterOneOlderDogHigherPriority() {
        // Setup
        shelter = new DogShelter(max);

        // Test
        shelter.shelter(neptune);

        // Assert
        assertAll("Sheltering an older dog with higher priority",
                () -> assertThat("Root node should change", shelter.root.d, is(neptune)),
                () -> assertThat("Root node should have a younger dog", shelter.root.younger, notNullValue()),
                () -> assertThat("Original dog should be younger", shelter.root.younger.d, is(max))
        );
    }

    @Test
    void ShelterSeveralDogsRightLeftRotation() {
        // Setup
        shelter = new DogShelter(tyler);
        DogShelter.DogNode emmaNode = shelter.new DogNode(emma);
        shelter.root.younger = emmaNode;
        emmaNode.parent = shelter.root;

        // Test
        shelter.shelter(izzie);

        // Assert
        assertAll("");
    }

    @Test
    void ShelterSeveralDogsLeftRightRotation() {
        // Setup
        shelter = new DogShelter(tyler);
        DogShelter.DogNode emmaNode = shelter.new DogNode(emma);
        shelter.root.older = emmaNode;
        emmaNode.parent = shelter.root;

        // Test
        shelter.shelter(izzie);

        // Assert
    }

    // Should there be test cases for several dogs, younger/older?
}