import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[][] atletas = new String[3][4];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos del atleta " + (i + 1));
            
            System.out.print("Nombre: ");
            atletas[i][0] = teclado.nextLine();

            System.out.print("Apellido: ");
            atletas[i][1] = teclado.nextLine();

            System.out.print("Especialidad (ej. 100m): ");
            atletas[i][2] = teclado.nextLine();

            System.out.print("Tiempo (segundos): ");
            atletas[i][3] = teclado.nextLine();
            
            System.out.println("-------------------------------");
        }

        double mejorTiempo = Double.MAX_VALUE;
        int indiceMejor = -1;

        for (int i = 0; i < 3; i++) {
            double tiempoActual = Double.parseDouble(atletas[i][3]);
            if (tiempoActual < mejorTiempo) {
                mejorTiempo = tiempoActual;
                indiceMejor = i;
            }
        }

        System.out.println("\nTABLA DE RESULTADOS - PRESELECCIÓN");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-10s %-15s%n", "NOMBRE", "APELLIDO", "ESPECIALIDAD", "TIEMPO", "ESTADO");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < 3; i++) {
            String estado = "";
            if (i == indiceMejor) {
                estado = "<< MEJOR TIEMPO";
            }
            System.out.printf("%-15s %-15s %-15s %-10s %-15s%n", atletas[i][0], atletas[i][1], atletas[i][2], atletas[i][3], estado);
        }
        System.out.println("--------------------------------------------------------------------------");
    }
}