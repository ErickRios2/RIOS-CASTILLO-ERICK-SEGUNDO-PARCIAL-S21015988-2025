import java.util.Scanner;

public class Ejercicio15{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] paises = new String[4];
        double[][] temperaturas = new double[4][3];
        double[] promedios = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("--------------------------------");
            System.out.print("Ingrese el nombre del país " + (i + 1) + ": ");
            paises[i] = teclado.next();

            System.out.print("Ingrese temperatura mes 1: ");
            temperaturas[i][0] = teclado.nextDouble();

            System.out.print("Ingrese temperatura mes 2: ");
            temperaturas[i][1] = teclado.nextDouble();

            System.out.print("Ingrese temperatura mes 3: ");
            temperaturas[i][2] = teclado.nextDouble();
        }

        System.out.println("\n--------------------------------");
        System.out.println("DATOS INGRESADOS:");
        for (int i = 0; i < 4; i++) {
            System.out.print("País: " + paises[i] + " | Temps: ");
            System.out.println(temperaturas[i][0] + ", " + temperaturas[i][1] + ", " + temperaturas[i][2]);
        }

        for (int i = 0; i < 4; i++) {
            double suma = temperaturas[i][0] + temperaturas[i][1] + temperaturas[i][2];
            promedios[i] = suma / 3;
        }

        System.out.println("\n--------------------------------");
        System.out.println("PROMEDIOS TRIMESTRALES:");
        for (int i = 0; i < 4; i++) {
            System.out.println("El país " + paises[i] + " tuvo una temperatura media de: " + promedios[i]);
        }

        double mayorMedia = promedios[0];
        String paisMayorMedia = paises[0];

        for (int i = 1; i < 4; i++) {
            if (promedios[i] > mayorMedia) {
                mayorMedia = promedios[i];
                paisMayorMedia = paises[i];
            }
        }

        System.out.println("\n--------------------------------");
        System.out.println("El país con la temperatura media trimestral más alta es: " + paisMayorMedia);
        System.out.println("Con un promedio de: " + mayorMedia);
    }
}