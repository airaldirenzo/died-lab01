package problema01;
import static java.lang.Math.*;

public class OperacionesNumeros {

	public static void main(String[] args){
		
	float n1=160f, n2=3.65f,n3;
		 
		n3 = n1+n2;
		System.out.println("n1 + n2 ="+n3);
		n3 = n1-n2;
		System.out.println("n1 - n2 ="+n3);
		n3 = n1*n2;
		System.out.println("n1 * n2 ="+n3);
		n3 = n1/n2;
		System.out.println("n1 / n2 ="+n3);
		n3 = n1 % n2;
		System.out.println("n1 % n2 ="+n3);
		
		
		if (n1>n2) 
			System.out.println(n1+" es mayor");
				else if (n1 < n2)
					System.out.println(n2+" es mayor");
					else System.out.println("son iguales");
		 
		System.out.println(pow(n3,2));
		
	}

	
}

