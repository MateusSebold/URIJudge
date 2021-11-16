import java.util.Scanner;
public class URI1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double media = ((2 * a) + (3 * b) + (3 * c))/10;
        System.out.println(String.format("MEDIA = %.1f" , media));
	}

}
