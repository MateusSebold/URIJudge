import java.util.Scanner;
public class URI1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.14159;
		
		Scanner entrada = new Scanner(System.in);
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();
		
		double triangulo = (a*c)/2;
		double circulo = (c*c)*pi;	
		double trapezio = (a+b)/2*c;
		double quadrado = b*b;
		double retangulo = (a*b);
		
		System.out.printf("TRIANGULO: %.3f\\n",triangulo);
		System.out.printf("CIRCULO: %.3f\\n",circulo);
		System.out.printf("TRAPEZIO: %.3f\\n",trapezio);
		System.out.printf("QUADRADO: %.3f\\n",quadrado);
		System.out.printf("RETANGULO: %.3f\\n",retangulo);
	}

}
