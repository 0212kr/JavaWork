package Test;

public class Test {

	public static void main(String[] args) {
		
		int dan1 = 2;
		int dan2 = 3;
		int dan3 = 4;
		int num = 1;
		while (dan1 < 6) {
			while(num <= 9) {
				System.out.println(dan1 + " x "+ num + " = "+(dan1*num)+"\t"+dan2 + " x "+ num + " = "+(dan2*num)+"\t"+dan3 + " x "+ num + " = "+(dan3*num));
				num++;				
			}
			System.out.println();
			dan1++;
			dan2++;
			dan3++;
			num = 1;
		}
		int dan4 = 8;
		int dan5 = 9;
		int num1 = 1;
		while(dan4 < 9) {
			while(num1 <= 9) {
				System.out.println(dan4 + " x "+ num1 + " = "+(dan4*num1)+"\t"+dan5 + " x "+ num1 + " = "+(dan5*num1));
				num1++;
			}
		}
			dan4++;
			dan5++;
			num++;
	}

}


//dan3++;
//System.out.println(dan3 + " x "+ num + " = "+(dan3*num));


