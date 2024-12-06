package materia.Queues;

import java.util.NoSuchElementException;

import materia.models.NodeGeneric;

// Clase genérica para la cola
public class QueueGenetic<T> {
    private NodeGeneric<T> front; // Nodo al frente de la cola
    private NodeGeneric<T> rear;  // Nodo al final de la cola
    private int size;             // Tamaño de la cola

    // Constructor: Inicializa una cola vacía
    public QueueGenetic() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    public void enqueue(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value); 
        if (isEmpty()) {
            front = newNode; // Si la cola está vacía, el nuevo nodo es el frente y el final
            rear = newNode;
        } else {
            rear.setNext(newNode); 
            rear = newNode;      
        }
        size++;
    }

    // Método para eliminar y devolver el elemento al frente de la cola
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T value = front.getValue(); // Obtener el valor del nodo al frente
        front = front.getNext();   // Mover el frente al siguiente nodo
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

    public boolean isEmpty() {
        return front == null;
    }

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