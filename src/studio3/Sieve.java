package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("input for n:");
		int n = scan.nextInt();
		int[] prime = new int[n+1];
		for (int i = 2; i<= n;i++) {
			if (prime[i] == 0) {
				System.out.print(i+" ");
				for (int j = 2; j<= n/i; j++) {
					prime[i*j]= 1;
				}
			}
		}
	}

}
