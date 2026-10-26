import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad de términos: ");
        int n = scanner.nextInt();
        
        int a = 0;
        int b = 1;
        int contador = 1;
        
        // Ciclo while para generar la serie de Fibonacci
        while (contador <= n) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
            contador++;
        }
        
        System.out.println();
        scanner.close();
    }
}