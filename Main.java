public class Main {
    public static void main(String[] args) {
        String[] tests = {"Cinebench R23", "Blender Render", "AIDA64 Stress", "Prime95"};
        
        double[][] temperaturas = {
            {40.5, 75.0, 82.3},
            {45.0, 80.2, 89.5},
            {50.0, 88.0, 96.5},
            {55.0, 92.0, 99.1}
        };

        // Para llamar a los métodos, ahora anteponemos el nombre de la clase donde están guardados
        int filaDelMaximo = AnalizadorTermico.buscadorPicos(temperaturas);
        System.out.println("Alerta Termica: El pico maximo se alcanzo en el test " + tests[filaDelMaximo]);

        double[] nuevatemp = new double[3];
        System.out.println("Ingreso manual de la prueba nueva ");
        AnalizadorTermico.ingresoTest(nuevatemp);
        
        System.out.println("Nuevo test guardado correctamente.");
    }
}