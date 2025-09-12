public class Calculadora {
    
    // Sobrecarga del método sumar
    public int sumar(int a, int b) {
        return a + b;
    }
    
    // Sobrecarga con 3 parámetros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    // Sobrecarga con parámetros de tipo double
    public double sumar(double a, double b) {
        return a + b;
    }
    
    // Sobrecarga con array de números
    public int sumar(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }
}

// Uso de la clase Calculadora
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("Suma de 2 enteros: " + calc.sumar(5, 3));
        System.out.println("Suma de 3 enteros: " + calc.sumar(5, 3, 2));
        System.out.println("Suma de 2 doubles: " + calc.sumar(5.5, 3.2));
        
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Suma de array: " + calc.sumar(numeros));
    }
}