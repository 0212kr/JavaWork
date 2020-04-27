package practice.gugu2;

public class Gugu2 {

public static void main(String[] args) {
		
	//======
	
	int dan =2;
	  
	   for (dan = 2; dan <= 9; dan += 3) {	//	단을 3개씩 넘깁니다.
		   System.out.println();
	    for(int i=1; i<=9; i++){			//	넘버값
	     for(int j =0; j<3; j++){			//	3회 출력
	      String str = (dan+j) + "*" + i + "=" + (dan+j)*i;	//	출력할때
	      System.out.print(dan+j<10 ? str + "\t" : "");
	      }
	     System.out.println();
	    }
	   }
			
			
	}

}
