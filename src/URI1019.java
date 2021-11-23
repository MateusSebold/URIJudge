import java.util.Scanner;
public class URI1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int N = entrada.nextInt();
		
		System.out.println(N/3600+":"+(N%3600)/60+":"+(N%3600)%60);
		
		
		
		
	}

}
