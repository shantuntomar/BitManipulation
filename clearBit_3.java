import java.util.*;

class clearBit_3 {

	static int clearBit(int num , int pos) {

		int mask = ~(1 << pos);
		return (num & mask);
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number ");
		int num = sc.nextInt();
		
		System.out.println("enter a position ");
		int pos = sc.nextInt();

		int res = clearBit(num , pos);

		System.out.println("==>"+res);


	}
}
