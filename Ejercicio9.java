import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int saldo = 1000; // Saldo inicial de S/ 1000[cite: 10]
        
        System.out.println("Saldo actual: S/" + saldo);
        System.out.print("Retiro: ");
        int retiro = scanner.nextInt();
        
        // Ciclo while: se ejecuta mientras el retiro sea diferente de 0[cite: 10]
        while (retiro != 0) {
            
            // Condición: Si el retiro es mayor al saldo, mostrar mensaje de error[cite: 10]
            if (retiro > saldo) {
                System.out.println("Error: El retiro excede el saldo disponible.");
            } else if (retiro < 0) {
                System.out.println("Error: Ingrese un monto positivo.");
            } else {
                saldo -= retiro;
                System.out.println("Saldo restante: S/" + saldo);[cite: 10]
            }
            
            // Si el saldo se agota, termina el programa
            if (saldo <= 0) {
                System.out.println("Su saldo se ha agotado por completo.");
                break;
            }
            
            System.out.print("\nRetiro: ");
            retiro = scanner.nextInt();
        }
        
        System.out.println("Operación finalizada.");
        scanner.close();
    }
}