package practice.isogram;

import java.util.Scanner;

/*	Isogram
	 문자열을 입력받으면 isogram 여부를 판단하여 true/false 를 출력하다가, quit 가 입력되면 종료
	isogram 이란?  : 중복된 알파벳이 없는 단어
	
	 isogram 예) Machine, isogram, Alphabet, quit
 */
public class Isogram {

	static boolean is_isogram2(String str) {
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length() -1 ; i++) {
			if(str.substring(i+1).indexOf(str.charAt(i)) != -1) return false;
		}
		
		return true;
	}
	
	
	/*
	 * 1. 전체를 소문자로바꿈 - clear
	 * 2. 각알파벳이 겹치는지 확인 
	 * 3. 확인되면 false 확인안되면 true
	 */
    public static void main(String[] args) 
    {

    	Scanner sc = new Scanner(System.in);

    	String str;										
    	
    	str = sc.next();								
    	str = str.toLowerCase();						

    	String[] str1;									
    	
    	str1 = str.split("");							
    		
    	int i = 1;
    	int x = 0;
    	int p = str1.length;
    	int b = 0;
    	while(true) {									
    		for (int j = 1; j < str1.length; j++, i++) {
    			if (str1[x].equals(str1[i])) {				
    				System.out.println("겹쳤습니다");
    				b++;
    				break;
    			}
			}
    		x++;
    		i = x+1;
    		if (b == 1)break;
    		System.out.println("겹치지않습니다.");
    		if (x == p)break;
    	}
    	
    } // end main()
} // end class
 