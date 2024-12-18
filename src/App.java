import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Models.Pantalla;
import materia.Queues.Queue;
import materia.Queues.QueueGenetic;
import materia.Stacks.Stack; 
import materia.Stacks.StackGeneric;

public class App {
    public static void main(String[] args) {
        System.out.println("Iniciando aplicación principal...");
        runSignValidator();
        runStackSorter();
        // Las siguientes llamadas están comentadas para evitar su ejecución
        // pero el código se mantiene disponible.
        // runStack();
        // runStackGeneric();
        // runQueue();
        // runQueueGeneric();
    }
    public static void runSignValidator() {
        System.out.println("\n--- Validación de Signos ---");
        String input1 = "{[()]}";
        String input2 = "{(})";

        System.out.println("Input: " + input1 + " => Output: " + SignValidator.isValid(input1)); // true
        System.out.println("Input: " + input2 + " => Output: " + SignValidator.isValid(input2)); // false
    }

    public static void runStackSorter() {
        System.out.println("\n--- Ordenar un Stack ---");
        java.util.Stack<Integer> javaStack = new java.util.Stack<>();

        javaStack.push(5);
        javaStack.push(1);
        javaStack.push(4);
        javaStack.push(2);
        javaStack.push(3);

        System.out.println("Stack original: " + javaStack);
        StackSorter.sortStack(javaStack);
        System.out.println("Stack ordenado: " + javaStack);
    }

    public static void runStack() {
    
        System.out.println("\n--- Stack Personalizado ---");
        Stack stack = new Stack();
        stack.push(10);
        stack.push(5);
        stack.push(7);
        stack.push(15);
        stack.push(20);
        stack.printStack();
        System.out.println("Cima actual -> " + stack.peek());
    }

    public static void runStackGeneric() {
        
        System.out.println("\n--- Stack Genérico ---");
        StackGeneric<Pantalla> router = new StackGeneric<>();
        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(2, "Menu Page", "/home/menu"));
        router.push(new Pantalla(3, "Users Page", "/home/menu/users"));
        System.out.println("Estoy en: " + router.peek().getRuta());
    }

    public static void runQueue() {
        
        System.out.println("\n--- Queue Personalizada ---");
        Queue cola = new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);
        System.out.println("Frente de la cola: " + cola.peek());
    }

    public static void runQueueGeneric() {
        
        System.out.println("\n--- Queue Genérica ---");
        QueueGenetic<Pantalla> queue = new QueueGenetic<>();
        queue.enqueue(new Pantalla(1, "Inicio", "/inicio"));
        queue.enqueue(new Pantalla(2, "Configuración", "/config"));
        queue.printQueue();
    }
}
