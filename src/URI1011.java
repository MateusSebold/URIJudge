import java.util.Scanner;

public class URI1011 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.14159;
		
		Scanner entrada = new Scanner(System.in);
        double raio = entrada.nextInt();
        
        double volume = (4/3.0) * pi * (raio*raio*raio);
        System.out.printf("VOLUME =  %.3f\n",volume);
}
}