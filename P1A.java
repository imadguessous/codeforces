import java.util.Scanner;

public class P1A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		Long m = sc.nextLong();
		Long a = sc.nextLong();
		
		Long row = 0L;
		row = n/a;
		if (n%a !=0) {
			row+=1;
		}
		Long result =0L;
		result = row * (m/a);
		if (m%a!=0) {
			result+=row;
		}
		System.out.println(result);
		sc.close();
	}

}
