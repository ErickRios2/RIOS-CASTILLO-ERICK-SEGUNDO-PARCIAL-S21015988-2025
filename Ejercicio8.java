class Ejercicio8{
	public static void main(String args[]){
		double interes=0.09,aumento=0, ahorro=500,ahorroAcumulado=0, interesMes;
		

		for(int m=1;m<13;m++){
			ahorroAcumulado = ahorro*m;
			interesMes = ahorroAcumulado*interes;
			aumento = ahorroAcumulado+interesMes;
			
			System.out.println("Usted ha ahorrado en el mes "+m+" la cantidad de $" +aumento);
		}
		
			
		System.out.println("En un año usted ha ahorrado:");
		System.out.printf("$%.2f%n",aumento);
		
	}
}