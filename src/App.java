import Controller.MenuController;
import Ejercicio_01_sing.SignValidator;
import Ejercicio_02_sorting.StackSorter;

import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Gestión de Contactos");
            System.out.println("2. Validación de Signos");
            System.out.println("3. Ordenar una Pila");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea

            switch (choice) {
                case 1:
                    runContactManager();
                    break;
                case 2:
                    System.out.print("Ingresa la cadena para validar: ");
                    String input = scanner.nextLine();
                    boolean isValid = SignValidator.isValid(input);
                    System.out.println("La cadena es " + (isValid ? "válida." : "inválida."));
                    break;
                case 3:
                    Stack<Integer> stack = new Stack<>();
                    System.out.print("Ingresa números separados por espacios: ");
                    String[] numbers = scanner.nextLine().split(" ");
                    for (String num : numbers) {
                        stack.push(Integer.parseInt(num));
                    }
                    Stack<Integer> sortedStack = StackSorter.sortStack(stack);
                    System.out.println("Pila ordenada (tope a fondo): " + sortedStack);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    running = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }

    public static void runContactManager() {
        MenuController menuController = new MenuController();
        menuController.showMenu();
    }
}
