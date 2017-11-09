package Stack_Queue;

import Stack_Queue.helper.Cat;
import Stack_Queue.helper.Dog;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 10/11/2017.
 */
public class Q6Test {

    @Test
    public void testAnimalShelderDS() throws Exception {
        Q6_AnimalShelterDS animalShelter = new Q6_AnimalShelterDS();
        animalShelter.enqueue(new Cat("Milo"));
        animalShelter.enqueue(new Cat("Sissy"));
        animalShelter.enqueue(new Dog("Azor"));
        animalShelter.enqueue(new Dog("Morgan"));
        animalShelter.enqueue(new Cat("Sally"));
        animalShelter.enqueue(new Dog("George"));
        animalShelter.enqueue(new Dog("Stephan"));
        animalShelter.enqueue(new Cat("Katerina"));

        assertEquals("Azor", animalShelter.dequeueDog());
        assertEquals("Milo", animalShelter.dequeueCat());
        assertEquals("Sissy", animalShelter.dequeueAny());
        assertEquals("Morgan", animalShelter.dequeueAny());
        assertEquals("George", animalShelter.dequeueDog());
        assertEquals("Stephan", animalShelter.dequeueDog());
        assertEquals("Sally", animalShelter.dequeueAny());
        assertEquals("Katerina", animalShelter.dequeueCat());

    }
}
