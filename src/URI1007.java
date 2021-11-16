import java.util.Scanner;

public class URI1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();
        
        int diferença= (a * b - c * d);
        
        System.out.println("DIFERENCA = "+diferença);
	}

}
