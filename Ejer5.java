import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		int nn=0, p=1;
		while(n>0)
		{
			int d=n%10;
			n=n/10;
			if(d%2!=0)
			{
				nn=d*p+nn;
				p=p*10;
			}
		}
		System.out.println(nn);
	}
}
