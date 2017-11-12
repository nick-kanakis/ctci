package Stack_Queue;

import Stack_Queue.helper.Animal;
import Stack_Queue.helper.Cat;
import Stack_Queue.helper.Dog;

import java.util.LinkedList;
import java.util.List;

/**
 * We have 2 LinkedLists that act like queues for the Cats/Dogs, when inserting an animal we mark it with a incremental
 * order number, this helps when dequeueAny() method is called we compare the top dog/cat from their respective queues and
 * return the oldest.
 */
public class Q6_AnimalShelterDS {
    private int order = 0;
    List<Cat> queueCat = new LinkedList<>();
    List<Dog> queueDog = new LinkedList<>();

    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;
        if (animal instanceof Cat)
            queueCat.add((Cat) animal);
        else if (animal instanceof Dog)
            queueDog.add((Dog) animal);
    }

    public Animal dequeueAny() {
        if (queueDog.size() == 0 && queueCat.size() == 0)
            throw new RuntimeException("Queue is empty");
        Animal adopted;
        if (queueDog.size() == 0) {
            adopted = queueCat.get(0);
            queueCat.remove(0);
        } else if (queueCat.size() == 0) {
            adopted = queueDog.get(0);
            queueDog.remove(0);
        } else if (queueCat.get(0).getOrder() < queueDog.get(0).getOrder()) {
            adopted = queueCat.get(0);
            queueCat.remove(0);
        } else {
            adopted = queueDog.get(0);
            queueDog.remove(0);
        }
        return adopted;
    }

    public Dog dequeueDog() {
        if (queueDog.size() == 0)
            throw new RuntimeException("Queue is empty");
        Dog dog = queueDog.get(0);
        queueDog.remove(0);
        return dog;
    }

    public Cat dequeueCat() {
        if (queueCat.size() == 0)
            throw new RuntimeException("Queue is empty");
        Cat cat = queueCat.get(0);
        queueCat.remove(0);
        return cat;
    }

}
