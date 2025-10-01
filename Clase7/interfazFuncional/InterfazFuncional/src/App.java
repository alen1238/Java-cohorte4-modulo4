public class App {
    public static void main(String[] args) throws Exception {
        /*Prueba prueba = new Prueba();
        int resultado = prueba.operar(5, 3);
        System.out.println("El resultado de la operación es: " + resultado);*/

        Operacion operacion = (a, b) -> a * b;
        int resultado = operacion.operar(5, 3);
        
    }
}
