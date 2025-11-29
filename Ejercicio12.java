import java.util.Scanner;
class Ejercicio12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double ventas[] = new double[7];
		int i,mayor=0;;
		double suma=0,mayorVenta=0;
		String dia[] = new String[]{"Lunes", "Martes", "Miercoles","Jueves","Viernes","Sabado","Domingo"};
		
		for(i=0;i<7;i++){
			System.out.print("Ingrese el monto de venta del dia " +dia[i]+ ": $");
			ventas[i] = sc.nextDouble();
			suma = suma+ventas[i];

			if (i == 0 || ventas[i] > mayorVenta) {
               		 mayorVenta = ventas[i]; 
                	 mayor = i;  
			}   
		}

		System.out.println("\tINFORME SEMANAL DE VENTAS");
		System.out.printf("Venta total de la semana: $%.2f%n",suma);
		System.out.println("El día con mayor venta fue: " +dia[mayor]);
		System.out.printf("Monto de la venta mayor: $%.2f%n", mayorVenta); 
		
		sc.close();
	}
}
			