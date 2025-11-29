import java.util.Scanner;

class Ejercicio7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num,multiplicacion;
		
		
		System.out.print("Ingresa el numero que deseas multiplicar del 1 al 10: ");
		num = sc.nextInt();

		System.out.println("Tabla de Multiplicar (1-10)");
		
		for(int i=1;i<11;i++){
			multiplicacion = num * i;
			System.out.println(num+ "x" +i+"= " +multiplicacion);
			}
		sc.close();
	}
}