package assignment3;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class DogShelterTest {

    Dog M = new Dog("Max", 11, 0, 2, 100.0);

    Dog R = new Dog("Rex", 8, 100, 5, 50.0);
    Dog S = new Dog("Stella", 5, 50, 2, 250.0);
    Dog L = new Dog("Lessie", 3, 70, 9, 25.0);
    Dog P = new Dog("Poldo", 10, 60, 1, 35.0);
    Dog B = new Dog("Bella", 1, 55, 15, 120.0);
    Dog C = new Dog("Cloud", 4, 10, 23, 80.0);
    Dog A = new Dog("Archie", 6, 120, 18, 40.0);
    Dog D = new Dog("Daisy", 7, 15, 12, 35.0);

    DogShelter shelter = new DogShelter(M);

    @Test
    void shelter() {
    }

    @Test
    void adopt() {
    }

    @Test
    void testAdopt() {
    }

    @Test
    void findOldest() {
    }

    @Test
    void findYoungest() {
    }

    @Test
    void findDogToAdopt() {
    }

    @Test
    void budgetVetExpenses() {
    }

    @Test
    void getVetSchedule() {
    }

    @Test
    void iterateFunctionalityTest() {
        Iterator<Dog> shelterIterator = shelter.iterator();

        assertTrue(shelterIterator.hasNext(), "Iterator should haveNext");
        assertNotNull(shelterIterator.next(), "Iterator should return object of type Dog");
        assertFalse(shelterIterator.hasNext(), "Iterator should not haveNext");
    }

    @Test
    void WhenNoMoreElementsIteratorShouldThrowException() {
        Iterator<Dog> shelterIterator = shelter.iterator();

        shelterIterator.next();
        assertThrows(NoSuchElementException.class, shelterIterator::next);
    }

    @Test
    void DogsReturnInAgeOrderSmallAmount() {
        Iterator<Dog> shelterIterator = shelter.iterator();

    }
}