import java.util.Scanner;

class Ejercicio10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[10];

		for(int i=0;i < 10;i++){
			System.out.print("Ingresa un numero: ");
			numeros[i] = sc.nextInt();
		}
		
		for(int i=9;i>=0;i--){
			System.out.println("Posicion " +i+": " + numeros[i]);
		}
	
		sc.close();
	}
}