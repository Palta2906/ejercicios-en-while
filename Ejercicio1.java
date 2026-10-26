import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese N: ");
        int n = scanner.nextInt();
        
        int suma = 0;
        int i = 1;
        
        // Ciclo while para sumar desde 1 hasta N[cite: 1]
        while (i <= n) {
            suma += i;
            i++;
        }
        
        System.out.println("Resultado: " + suma);
        
        scanner.close();
    }
}