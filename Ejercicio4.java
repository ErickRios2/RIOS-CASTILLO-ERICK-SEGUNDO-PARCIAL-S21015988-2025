import java.util.Scanner;

class Ejercicio4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double saldo=5000.00, monto;
		char continuar='s';
		String usuario;

		System.out.println("\tCAJERO AUTOMATICO");
		System.out.println("\tBienvenido");
			while(continuar=='s'||continuar=='S'){
			System.out.println("Tu saldo disponible es de: $"+saldo);
			System.out.print("Ingrese la cantidad de dinero que desea retirar: $");
			monto = sc.nextDouble();
				if(monto<5000.00){
					saldo= saldo - monto;
					System.out.printf("Cantidad Retirada: $%.2f%n",monto);
					System.out.printf("Saldo disponible: $%.2f%n",saldo);
				}else{
					System.out.println("Saldo insifuciente");
				}				
			System.out.print("Desea continuar con el proceso de retiro? (s/n): ");
			continuar = sc.next().charAt(0);
			}
		System.out.println("Operaciones realizadas");
	}

}