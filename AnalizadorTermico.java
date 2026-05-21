import java.util.Scanner;

public class AnalizadorTermico {

    // Método para buscar el pico máximo (Lógica de negocio)
    public static int buscadorPicos(double[][] matriz) {
        double tempMax = matriz[0][0];
        int fila = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (tempMax < matriz[i][j]) {
                    tempMax = matriz[i][j];
                    fila = i;
                }
            }
        }
        return fila;
    }

    // Método para ingresar los datos (Lógica de interfaz/validación)
    public static void ingresoTest(double[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 temperaturas (Minima, promedio, maxima):");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un elemento para la posicion " + i + ":");
            double temp = sc.nextDouble();

            if (i == 0) {
                array[i] = temp;
            } else {
                while (temp <= array[i-1]) {
                    System.out.println("Error: El elemento ingresado no es valido, vuelva a ingresar otro valor:");
                    temp = sc.nextDouble();
                }
                array[i] = temp;
            }
        }
    }
}