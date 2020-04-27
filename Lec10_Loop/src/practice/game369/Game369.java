package practice.game369;

public class Game369 {
	public static void main(String[] args) {
		
		// 10나누기 -> 1자리 나머지수 제거완료
		// 그럼 10의자리수는 어떻게?..
		
//		for (int i = 1; i < max; i+= 10)  {	//10의자리수변경
//			for (int j = 0; j < 10; j++) {	//1의자리수변경
//				num = i+j;
//				count = num / 10;
//				if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
//				
//					System.out.printf("*\t");
//					
//				}else if (count % 10 == 3 || count % 10 == 6 || count % 10 == 9){
//					System.out.printf("*\t");
//				}else if(count > 0){
//					System.out.print(num+"\t");
//				}
//			}
//			System.out.println();
//		}
//		
//		for (int i = 1; i < max; i++) {
//			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
//				System.out.println("*");
//			}else if(count % 10 == 3 || count % 10 == 6 || count % 10 == 9){
//				System.out.println("*");
//			}else if(count > 0){
//				count = count/10;
//				continue;				
//			}else {
//				System.out.println(i);
//			}
//			
//		}
		// 1번 for 에서 % 10 = 3,6,9 를 체크
		// 2번 for 에서 10의자리수 이상을 /10 해서 가져옴
		int max = 1000;
		int num = 1;
		int count = 0;
		
		for (num = 1; num < max; num++) {
			count = num;
		while(true) {	// 1의자리수 검사 하고 10의자리수를 한자리 줄인다.
		// 카운트값을 나눴을때 나머지값이 3,6,9일 경우 "*" 아닐경우 "카운트값 / 10을하고 카운트값을 저장
		if (count % 10 == 3 || count % 10 == 6 || count % 10 == 9) {
			System.out.print("*\t");
		} else	if(count > 10) {
			
			count = count/10;
			continue;
		}else {
			System.out.print(num+"\t");			
			}
		break;
		}//end while
		}
				
	}
}






//