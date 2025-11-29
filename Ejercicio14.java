import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] n = new String[4];
        double[][] s = new double[4][3];
        
        double[] total_empleado = new double[4];

        double suma_total_de_todos = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingresa el nombre del empleado " + (i + 1) + ": ");
            n[i] = teclado.next(); 

            System.out.print("Sueldo mes 1: ");
            s[i][0] = teclado.nextDouble();

            System.out.print("Sueldo mes 2: ");
            s[i][1] = teclado.nextDouble();

            System.out.print("Sueldo mes 3: ");
            s[i][2] = teclado.nextDouble();

            total_empleado[i] = s[i][0] + s[i][1] + s[i][2];
        }

   
        System.out.println("CALCULANDO RESULTADOS...");

        for (int i = 0; i < 4; i++) {
            suma_total_de_todos = suma_total_de_todos + total_empleado[i];
            System.out.println("El empleado " + n[i] + " ganó en total: " + total_empleado[i]);
        }
        
       
        System.out.println("Total pagado en sueldos a TODOS: " + suma_total_de_todos);

        double mayor = 0;
        String nombreDelMayor = "";

        for (int i = 0; i < 4; i++) {
            if (total_empleado[i] > mayor) {
                mayor = total_empleado[i];
                nombreDelMayor = n[i];
            }
        }

        System.out.println("El empleado que más cobró fue: " + nombreDelMayor);
        System.out.println("Con un monto de: " + mayor);
    }
}