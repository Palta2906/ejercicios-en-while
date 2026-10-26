import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        long factorial = 1; // Se usa long por si el resultado es un número grande
        int i = 1;
        
        // Ciclo while para calcular el factorial de un número
        while (i <= numero) {
            factorial *= i;
            i++;
        }
        
        System.out.println("Factorial = " + factorial);
        
        scanner.close();
    }
}