import java.util.Scanner;

public class URI1010 {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

	int codigo1 =  entrada.nextInt();
	int quantidade1 = entrada.nextInt();
	float pre�o1 = entrada.nextFloat();
	int codigo2 =  entrada.nextInt();
	int quantidade2 = entrada.nextInt();
	float pre�o2 = entrada.nextFloat();
	
	double pagar = ((quantidade1*pre�o1)+(quantidade2*pre�o2));
			
	System.out.printf("VALOR A PAGAR: R$ %.2f\n",pagar);
	
}
}