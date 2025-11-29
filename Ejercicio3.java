import java.util.Scanner;

class Ejercicio3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double adeudo=1000.00;
		int opcion;
		char Continuar='s';
		
		System.out.println("\tMENÚ PRINCIPAL");
		

		while(Continuar=='s'||Continuar=='S'){
		System.out.println("Escoga una de las 4 opciones");
		System.out.println("1.Consulta"); 
		System.out.println("2.Pago del Mes"); 
		System.out.println("3.Pago de Adeudo"); 
		System.out.println("4.Salir"); 
		opcion = sc.nextInt();

			switch(opcion){
				case 1:
					System.out.println("\t[CONSULTA]");
					System.out.println("Usted tiene un adeuedo de: $"+adeudo);
					System.out.print("Desea continuar con otro servicio? (s/n): ");
					Continuar= sc.next().charAt(0);
					break;			
				
				case 2: 
					System.out.println("\t[PAGO DEL MES]");
					System.out.println("El monto a cubrir es de: $"+adeudo);
					System.out.print("Desea continuar con otro servicio? (s/n): ");
					Continuar= sc.next().charAt(0);
					break;
				case 3: 
					System.out.println("\t[PAGO DE ADEUDO]");
					System.out.println("El monto para liquidar su adeudo es de: $"+adeudo);
					System.out.println("Desea continuar con otro servicio? (s/n): ");
					Continuar = sc.next().charAt(0);
					break;
				case 4:
					System.out.println("Operaciones realizadas");
					Continuar = 'n';
					break;
				default:
					System.out.println("¡ERROR! Opción no valida. Por favor ingrese una opcion del 1 al 4");
			}
		}
		System.out.println("\nGracias por usar el sistema. ¡Adiós!");
	}
}