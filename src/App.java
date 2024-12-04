import Materia.Queues.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static void runStack() {
        //Instanciar la clase
        Stack stack = new Stack();

        //Agregar elementos a la fila
        stack.push(5);
        stack.push(7);
        stack.push(10);
        System.out.println("Cima   ->" +stack.peek());
        System.out.println("Retirar   ->" +stack.peek());
        System.out.println("Cima   ->" +stack.peek());
        System.out.println("Retirar   ->" +stack.peek());
        System.out.println("Cima   ->" +stack.peek());
        }
}

