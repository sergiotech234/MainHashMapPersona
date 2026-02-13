import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        // Creación de un HashMap con claves tipo String y valores tipo Integer
        Map<String, Integer> edades = new HashMap<>();
        // Agregar pares clave-valor
        edades.put("Ana", 20);
        edades.put("Luis", 22);
        edades.put("María", 25);
        // Acceso por clave
        System.out.println("Edad de Ana: " + edades.get("Ana"));
        // Eliminar un par clave-valor
        edades.remove("Luis");
        // Recorrer el mapa mostrando claves y valores
        for (String nombre : edades.keySet()) {
            System.out.println(nombre + ": " + edades.get(nombre));
        }
    }
}