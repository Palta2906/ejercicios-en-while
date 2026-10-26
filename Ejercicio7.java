import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese 10 números:");
        
        int i = 1;
        int mayor = 0;
        int menor = 0;
        
        // Ciclo while para solicitar y evaluar los 10 números
        while (i <= 10) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            
            // En la primera iteración, inicializamos mayor y menor
            if (i == 1) {
                mayor = numero;
                menor = numero;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
            i++;
        }
        
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        
        scanner.close();
    }
}