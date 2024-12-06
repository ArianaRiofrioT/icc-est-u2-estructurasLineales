package materia.Queues;

import materia.models.Node;

public class Queue {

    private Node front; //Nodo al frente de la cola
    private Node rear; //Nodo al final de la cola

    public Queue() {
        this.front = null;
        this.rear = null;
    }
    
    public void enqueue(int value) {
        Node newNode = New Node(value);
        if(isEmpaty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }
    
    public boolean isEmpaty(){
        return front == null;
    }
}