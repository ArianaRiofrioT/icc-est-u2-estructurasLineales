package materia.Queues;

import java.util.NoSuchElementException;
import materia.models.Node;

public class Queue {
    private Node front; // Nodo al frente de la cola
    private Node rear;  // Nodo al final de la cola
    private int size;   // Tamaño de la cola

    // Constructor: Inicializa una cola vacía
    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value); // Crear un nuevo nodo con el valor dado
        if (isEmpty()) {
            front = newNode; 
            rear = newNode;
        } else {
            rear.setNext(newNode); 
            rear = newNode;        
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        int value = front.getValue(); // Obtener el valor del nodo al frente
        front = front.getNext();     // Mover el frente al siguiente nodo
        if (front == null) {
            rear = null; // Si la cola queda vacía, rear también debe ser null
        }
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return front.getValue();
    }

    public boolean isEmpty() {
        return front == null;
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        return size;
    }

    // Método para imprimir la cola
    public void printQueue() {
        Node current = front;
        System.out.print("Cola: ");
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}