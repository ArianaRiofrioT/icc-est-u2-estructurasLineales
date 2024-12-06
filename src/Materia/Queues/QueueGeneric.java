package materia.Queues;

import java.util.NoSuchElementException;

import materia.models.NodeGeneric;

// Clase genérica para la cola
public class QueueGeneric<T> {
    private NodeGeneric<T> front; // Nodo al frente de la cola
    private NodeGeneric<T> rear;  // Nodo al final de la cola
    private int size;             // Tamaño de la cola

    // Constructor: Inicializa una cola vacía
    public QueueGeneric() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Método para agregar un elemento a la cola
    public void enqueue(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value); 
        if (isEmpty()) {
            front = newNode; 
            rear = newNode;
        } else {
            rear.setNext(newNode); 
            rear = newNode;       
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T value = front.getValue(); 
        front = front.getNext();   
        if (front == null) {
            rear = null; 
        }
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return front.getValue();
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return front == null;
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        return size;
    }

    // Método para imprimir los elementos de la cola
    public void printQueue() {
        NodeGeneric<T> current = front;
        System.out.print("Cola genérica: ");
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}