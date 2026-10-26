import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese N: ");
        int n = scanner.nextInt();
        
        int contadorPares = 0;
        int i = 1;
        
        // Ciclo while para recorrer desde 1 hasta N y contar los números pares
        while (i <= n) {
            if (i % 2 == 0) {
                contadorPares++;
            }
            i++;
        }
        
        System.out.println("Cantidad de pares: " + contadorPares);
        
        scanner.close();
    }
}