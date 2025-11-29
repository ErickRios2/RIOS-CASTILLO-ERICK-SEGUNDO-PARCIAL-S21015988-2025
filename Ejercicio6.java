import java.util.Scanner;

class Ejercicio6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double Calificacion[] = new double[5];
		int aprobados=0;
		int reprobados=0;
		double suma=0;

		for(int i=0;i<5;i++){
			System.out.print("Ingresa la calificación del alumno "+ (i+1) + ": ");
			Calificacion[i] = sc.nextDouble();

			suma = suma + Calificacion[i];
			
			if(Calificacion[i] >= 6.0) {
				aprobados++;	
			}else{
				reprobados++;
			}
		}

		double promedio = suma/5;

		System.out.println("Resultados del grupo");
		System.out.println("No.Total de aprobados: "+aprobados);
		System.out.println("No.Total de reprobados: "+reprobados);
		System.out.printf("Promedio del grupo: %.2f%n",promedio );	

		sc.close();
	}
}