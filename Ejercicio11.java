import java.util.Scanner;

class Ejercicio11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i;
		boolean encontrado = false;
		int posicionEncontrada = -1;
		int numeros[] = new int[8];
		
		for(i=0; i < 8 ;i++){
			System.out.print("Ingresa un numero: ");
			numeros[i]= sc.nextInt();

		}
		System.out.print("Introduzca un numero a buscar: ");
		int num = sc.nextInt();

		for(i=0;i < 8; i++){
			if(numeros[i]==num){
				encontrado = true;
				posicionEncontrada = i;
				break;
			}
		}

		if(encontrado){
			System.out.println("Numero: " +num+ "encontrado en la posicion " +posicionEncontrada);
		}else{
			System.out.println("Numero no encontrado dentro del arreglo");
		}

		sc.close();
	}
}
		
		
		