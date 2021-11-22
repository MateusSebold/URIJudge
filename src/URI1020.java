import java.util.Scanner;
public class URI1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int idadeD = entrada.nextInt();
		int anos = idadeD/365;
		int mes = (idadeD%365)/30;
		int dias = (mes%30);
		System.out.println(anos+" ano(s)");
		System.out.println(mes+" mes(es)");
		System.out.println(mes+" dia(s)");
		
		
		
	}

}
