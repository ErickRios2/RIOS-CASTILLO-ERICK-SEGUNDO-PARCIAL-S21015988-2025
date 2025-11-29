import java.util.Scanner;
class Ejercicio9{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double calificaciones[] = new double[6];
		double suma=0;
		for(int i=0; i<=5;i++){
			System.out.print("Ingrese la calificacion del estudiante: ");
			calificaciones[i] = sc.nextDouble();
			suma= suma + calificaciones[i];

		}
		
		double promedio = suma/5;
		System.out.println("Calificacion del estudiante 1 es: "+calificaciones[0]);
		System.out.println("Calificacion del estudiante 2 es: "+calificaciones[1]);
		System.out.println("Calificacion del estudiante 3 es: "+calificaciones[2]);
		System.out.println("Calificacion del estudiante 4 es: "+calificaciones[3]);
		System.out.println("Calificacion del estudiante 5 es: "+calificaciones[4]);
		System.out.println("Calificacion del estudiante 6 es: "+calificaciones[5]);
		System.out.printf("El promedio del grupo es de: %.2f%n",promedio);
		
		sc.close();
	}
}