import java.util.*;

class GetBit {

	static boolean getBit(int num , int pos) {

		// left shift 1 with given position and & operator with given num 
		return ((num & (1<<pos) ) != 0);
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// enter a number
		int n = sc.nextInt();

		// enter a position 
		int pos = sc.nextInt();

		if(getBit( n , pos )) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}

