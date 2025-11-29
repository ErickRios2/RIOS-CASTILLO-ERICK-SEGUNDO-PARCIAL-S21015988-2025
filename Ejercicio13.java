import java.util.Scanner;

class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAlumnos[][] = new int[3][4];
        int j, i;
        System.out.println("IDIOMAS" + "\t\t Niveles");
        System.out.println("1.INGLES" + "\t 1.BASICO");
        System.out.println("2.FRANCES" + "\t 2.MEDIO");
        System.out.println("3.ALEMAN" + "\t 3.PERFECCIONAMIENTO");
        System.out.println("4.RUSO");

        System.out.println("\nNÚMERO DE ALUMNOS EN LA ACADEMIA");
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                
                System.out.print("Ingrese alumnos - Nivel " + (i + 1) + ", Idioma " + (j + 1) + ": ");
                numAlumnos[i][j] = sc.nextInt();
            }
        }

       
        System.out.println("\nResumen de Alumnos:");
        System.out.println("\t\tIngles\tFrances\tAleman\tRuso");
        System.out.println("Basico\t\t" + numAlumnos[0][0] + "\t" + numAlumnos[0][1] + "\t" + numAlumnos[0][2] + "\t" + numAlumnos[0][3]);
        System.out.println("Medio\t\t" + numAlumnos[1][0] + "\t" + numAlumnos[1][1] + "\t" + numAlumnos[1][2] + "\t" + numAlumnos[1][3]);
        System.out.println("Perfeccion.\t" + numAlumnos[2][0] + "\t" + numAlumnos[2][1] + "\t" + numAlumnos[2][2] + "\t" + numAlumnos[2][3]);

        sc.close();
    }
}