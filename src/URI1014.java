import java.util.Scanner;
public class URI1014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner entrada =  new Scanner(System.in);
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		if (a > b && a > c) {
        	System.out.println(a + " eh o maior");
        } else if (b > c) {
        	System.out.println(b + " eh o maior");
        } else {
        	System.out.println(c + " eh o maior");
        }

	}
}
