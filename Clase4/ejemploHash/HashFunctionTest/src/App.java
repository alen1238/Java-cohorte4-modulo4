import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        //ejemploHashSet();
        //ejemploLinkedHashSet2();
        ejemploTreeSet();
    }

    public static void ejemploHash(){
        String nombre = "Juan";
        int h = nombre.hashCode();
        System.out.println("El hash code de " + nombre + " es: " + h);
    }

    public static void ejemploHashSet(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Perro");
        hashSet.add("Gato");
        hashSet.add("Caballo");
        hashSet.add("Perro"); // duplicado, no lo guarda, tampoco genera error.

        System.out.println("HashSet: " + hashSet);
    }

    public static void ejemploLinkedHashSet2(){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();//iniialización
        linkedHashSet.add("Perro");
        linkedHashSet.add("Gato");
        linkedHashSet.add("Caballo");
        linkedHashSet.add("Perro"); // duplicado, no lo guarda

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }

    public static void ejemploTreeSet(){
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Perro");
        treeSet.add("Gato");
        treeSet.add("Caballo");
        treeSet.add("Perro"); // duplicado, no lo guarda

        System.out.println("TreeSet: " + treeSet);
    }
}
