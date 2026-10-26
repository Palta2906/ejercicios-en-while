import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        int cantidadDigitos = 0;
        int aux = numero;
        
        // Manejo especial si el número es 0
        if (aux == 0) {
            cantidadDigitos = 1;
        } else {
            // Ciclo while para contar dígitos mediante divisiones sucesivas
            while (aux > 0) {
                aux = aux / 10;
                cantidadDigitos++;
            }
        }
        
        System.out.println("Cantidad de dígitos: " + cantidadDigitos);
        
        scanner.close();
    }
}