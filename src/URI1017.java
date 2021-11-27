import java.util.Scanner;
public class URI1017 {
	public static void main(String[] args) {
	Scanner entrada =new Scanner(System.in);
	
	int tempo = entrada.nextInt();
	int km = entrada.nextInt();
	
	int dist = tempo*km;
	double resutado = dist/12;
	
	System.out.print(String.format("%.3f",resutado));
	
	
}
}