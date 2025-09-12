import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoErrores {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            
            System.out.println("El cuadrado es: " + calcularCuadrado(numero));
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número válido");
            
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            
        } finally {
            System.out.println("Este bloque siempre se ejecuta");
            scanner.close();
        }
        
        // Ejemplo con throw
        try {
            validarEdad(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static int calcularCuadrado(int numero) {
        return numero * numero;
    }
    
    public static void validarEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        System.out.println("Edad válida: " + edad);
    }
}