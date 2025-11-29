import java.util.Scanner;

public class Ejercicio16{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[][] articulos = new String[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos del artículo " + (i + 1));
            
            System.out.print("Nombre (Camisa/Zapato/Pantalón): ");
            articulos[i][0] = teclado.nextLine();

            System.out.print("Talla: ");
            articulos[i][1] = teclado.nextLine();

            System.out.print("Color: ");
            articulos[i][2] = teclado.nextLine();
            
            System.out.println("-------------------------------");
        }

        System.out.println("\nTABLA DE ARTÍCULOS REGISTRADOS");
        System.out.println("------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s%n", "NOMBRE", "TALLA", "COLOR");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s %-15s %-15s%n", articulos[i][0], articulos[i][1], articulos[i][2]);
        }
        System.out.println("------------------------------------------------");
    }
}