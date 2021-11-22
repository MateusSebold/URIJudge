import java.util.Scanner;
public class URI1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner entrada =  new Scanner(System.in);
		int X = entrada.nextInt();
		float Y = entrada.nextFloat();
		
		double consumo = (X/Y);
		System.out.printf(String.format("%3.f km/l",consumo));
		

	}
}
