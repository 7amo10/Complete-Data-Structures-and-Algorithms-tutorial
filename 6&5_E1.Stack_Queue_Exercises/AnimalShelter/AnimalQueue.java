package AnimalShelter;

import java.util.LinkedList;

public class AnimalQueue {
  LinkedList<Dog> dogs = new LinkedList<Dog>();
  LinkedList<Cat> cats = new LinkedList<Cat>();
  private int order = 0;

  // enqueue
  public void enqueue(Animal a) {
    a.setOrder(order);
    order++;
    if (a instanceof Dog) {
      dogs.addLast((Dog) a);
    } else if (a instanceof Cat) {
      cats.addLast((Cat)a);
    }
  }

  public int size() {
    return dogs.size() + cats.size();
  }

  // Dequeue dogs
  public Dog dequeueDogs() {
    return dogs.poll();
  }

  // peekDogs
  public Dog peekDogs() {
    return dogs.peek();
  }

  // Dequeue cats
  public Cat dequeueCats() {
    return cats.poll();
  }

  // peekDogs
  public Cat peekCats() {
    return cats.peek();
  }

  // dequeueAny
  public Animal dequeueAny() {
    if (dogs.size()==0) {
      return dequeueCats();
    } else if (cats.size()==0) {
      return dequeueDogs();
    }
    Dog dog = dogs.peek();
    Cat cat = cats.peek();

    if (dog.isOlderThan(cat)) {
      return dogs.poll();
    } else {
      return cats.poll();
    }
  }

  // peek 

  public Animal peek() {
    if (dogs.size() == 0) {
      return cats.peek();
    } else if (cats.size()==0) {
      return dogs.peek();
    }

    Dog dog = dogs.peek();
    Cat cat = cats.peek();

    if (dog.isOlderThan(cat)) {
      return dogs.peek();
    } else {
      return cats.peek();
    }
  }


}