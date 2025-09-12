import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EjemploColecciones {
    
    public static void main(String[] args) {
        // Lista (ArrayList)
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Manzana"); // Se permiten duplicados
        
        System.out.println("Lista de frutas:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }
        
        // Conjunto (HashSet) - No permite duplicados
        Set<String> frutasUnicas = new HashSet<>(frutas);
        System.out.println("\nFrutas únicas:");
        for (String fruta : frutasUnicas) {
            System.out.println("- " + fruta);
        }
        
        // Mapa (HashMap)
        Map<String, Integer> precios = new HashMap<>();
        precios.put("Manzana", 50);
        precios.put("Banana", 30);
        precios.put("Naranja", 40);
        
        System.out.println("\nPrecios de frutas:");
        for (Map.Entry<String, Integer> entry : precios.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
        
        // Manejo de errores con colecciones
        try {
            System.out.println("Precio de Uva: $" + precios.get("Uva"));
            
            // Esto causará NullPointerException si no manejamos el null
            String frutaInexistente = null;
            System.out.println(frutaInexistente.toUpperCase());
            
        } catch (NullPointerException e) {
            System.out.println("Error: La fruta no existe en el mapa");
        }
    }
}