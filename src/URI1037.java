import java.util.Scanner;

public class URI1037 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	float n = entrada.nextFloat();
	
	
	if(n<=25&&n>=0) 
		System.out.println("Intervalo [0,25]");
	
		else if((n>25)&&(n<=50)) 
			System.out.println("Intervalo[25,50]");
	
		else if ((n>50&&n<=75)) 
			System.out.println("Intervalo[50,75]");
	
	
		else if ((n>75)&&(n<=100)) 
			System.out.println("Intervalo[25,50]");
	
			else 
				System.out.println("Fora de intervalo");
	
	entrada.close();
		
	
	
}

}
