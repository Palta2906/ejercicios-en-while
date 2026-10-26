import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroSecreto = 50; // Número fijo a adivinar
        int intento = 0;
        int intentosRealizados = 0;
        
        // Ciclo while con intentos ilimitados hasta que acierte[cite: 11]
        while (intento != numeroSecreto) {
            System.out.print("Ingrese un número: ");
            intento = scanner.nextInt();
            intentosRealizados++;
            
            // Condiciones indicadas en el ejercicio[cite: 11]
            if (intento < numeroSecreto) {
                System.out.println("El número es mayor\n");[cite: 11]
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor\n");[cite: 11]
            } else {
                System.out.println("¡Correcto!");[cite: 11]
                System.out.println("Intentos realizados: " + intentosRealizados);[cite: 11]
            }
        }
        
        scanner.close();
    }
}