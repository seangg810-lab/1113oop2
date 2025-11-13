import java.util.LinkedList;
import java.util.List;
class MyQueue<T> {
    private List<T> queue;
    public MyQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null; 
        }
        return queue.remove(0);
    }
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return queue.get(0);
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // 返回队列中的元素数量
    public int size() {
        return queue.size();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();
        //do some test if needed
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);

        System.out.println("Size: " + intQueue.size());
        System.out.println("Dequeue: " + intQueue.dequeue());
        System.out.println("Peek: " + intQueue.peek());
        System.out.println("Is Empty: " + intQueue.isEmpty());

        MyQueue<Person> peopleQueue = new MyQueue<>();
        peopleQueue.enqueue(new Person("Alice", 25));
        peopleQueue.enqueue(new Person("Bob", 30));

        System.out.println("People Queue size: " + peopleQueue.size());
        System.out.println("Dequeue person: " + peopleQueue.dequeue());
    }
}


//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------