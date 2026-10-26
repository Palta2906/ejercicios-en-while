import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sumaNotas = 0;
        int i = 1;
        
        // Ciclo while para pedir 5 notas y calcular la suma
        while (i <= 5) {
            System.out.print("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            sumaNotas += nota;
            i++;
        }
        
        // Calcular el promedio dividiendo entre 5[cite: 4]
        double promedio = sumaNotas / 5;
        
        System.out.println("Promedio: " + promedio);
        
        scanner.close();
    }
}