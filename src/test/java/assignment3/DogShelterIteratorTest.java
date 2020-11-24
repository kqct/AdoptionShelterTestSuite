package assignment3;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class DogShelterIteratorTest {
    Dog M = new Dog("Max", 11, 0, 2, 100.0);

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