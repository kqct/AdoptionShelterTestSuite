package assignment3;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class DogShelterIteratorTest {
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
    DogShelter.DogNode node = shelter.new DogNode(M);


    @Test
    void IterateFunctionalityTest() {
        Iterator<Dog> shelterIterator = shelter.iterator();

        assertThat("Iterator should haveNext", shelterIterator.hasNext(), is(true));
        assertThat("Iterator should return root object of type DogNode",
                shelterIterator.next(), is(instanceOf(Dog.class)));
        assertThat("Iterator should no longer haveNext", shelterIterator.hasNext(), is(false));
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