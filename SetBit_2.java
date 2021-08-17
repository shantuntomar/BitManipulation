import java.util.*;

class SetBit_2 {

	static int setBit(int num , int pos ) {

		return (num | (1<<pos) );

	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number ");
		int num = sc.nextInt();

		System.out.println("enter the position ");
		int pos = sc.nextInt();

		int res = setBit(num, pos);

		System.out.println("==> "+res);
	}
}

// 8 4 2 1 

/** 

num = 6  0 1 1 0 
         0 1 0 0 
		 
		 0 1 1 0 = 6 



**/ 


