import java.util.Scanner;
public class URI1052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int num = entrada.nextInt();
		String mes = "a";
		
		if(num==1)
			mes="January";
		
			 if(num==2)
				mes="February";
		
			 if(num==3)
				mes="March";
			
			 if(num==4)
				mes="April";
		
			 if(num==5)
				mes="May";
		
			 if(num==6)
				mes="June";
		
			 if(num==7)
				mes="July";
		
			 if(num==8)
				mes="August";
		
			 if(num==9)
				mes="Setember";
		
			 if(num==10)
				mes="Octuber";
			
			if(num==11)
				mes="November";
		
			if(num==12)
				mes="December";
		
		System.out.println(mes);
	}

}
