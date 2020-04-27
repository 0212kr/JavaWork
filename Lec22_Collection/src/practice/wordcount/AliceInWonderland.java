package practice.wordcount;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.print.attribute.standard.MediaSize.Other;

/* 1] 문서(문자열) 안의 단어의 빈도수를 계수해서 출력하기
 * 	- 대소문자 구분하지 않기 :   The 와 the 는 같은 단어 //
 *  - 2글자 이상만 계수하기
 *  - 구두점/기호 ",.\"\'`!?;:-()" 잘라내기
 *  - 공백 짤라내기
 * ex)
 * 	an : 234
 * 	the : 314
 * ...
 * 
 * hint]
 * 	split("\\s+")  --> String[]   
 * 	--> StringTokenizer  (혹은 정규표현식)
 *  	  --> HashMap<String, Integer>   <단어, 빈도수>  사용
 * ───────────────────────────────────────────────────────────    
 * 2] 빈도수 내림차순으로 정렬하여 출력하기
 * 	ex)
 *	1 the:113개
 *	2 she:95개
 *	3 to:85개
 *	...   
 *
 * hint]
 * 	Comparable<> 이나 Comparator<> 적용
 */

// TODO : 필요한 객체들 작성
// hint> 빈도수 담을 객체, Comparator<> ..

public class AliceInWonderland {

	public static void main(String[] args) {		
		System.out.println("실습: 단어 발생 빈도");
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		String words3;
		
//		Pattern pat;
//		String regex;
//		Matcher matcher;
//		regex = "(?!)[a-z] {2}";
//		pat = Pattern.compile(regex);
		
		// C의 문자를 공백기준으로 나눔 
		String [] words = C.ALICE30.trim().toLowerCase().split("\\s+");
		// 스트링배열의 words를 스트링타입wordsCh로 변경
		String wordsCh = Arrays.toString(words);
		// wordsCh의 담긴값에 특수문자를 제거한후 토큰값으로 저장
		StringTokenizer token1 = new StringTokenizer(wordsCh, ",.\\\"\\'`!?;:-()[]");
		// 저장된 토큰값에서 공백이있다면 제거하고 wordls 에 저장
		HashMap<String, Integer> hmap1 = new HashMap<String, Integer>();
		
		//?? <문자, 개수> 에서 비교식으로 개수만비교해서 출력(대입연산)
		
		
		while(token1.hasMoreTokens()) {
			
			String token2 = token1.nextToken().replaceAll(" ","");
			if (token2.length() > 1) {
				if (hmap1.get(token2) == null) {
					hmap1.put(token2, 1);										
				}else {
					hmap1.put(token2, hmap1.get(token2)+1);
				}
				
				}
			}
		int sum = 0;
		ArrayList<ganda> izegman = new ArrayList<ganda>();
		for (Map.Entry<String, Integer> m : hmap1.entrySet()) {
			izegman.add(new ganda(m.getKey(),m.getValue()));
		}
			Collections.sort(izegman);
			for(ganda a : izegman) {
				System.out.println(a.ntt+" "+a.dead);
			sum += a.dead;
			}
			System.out.println(sum);
////		while
//		
////		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(hmap1);
////		Iterator<String> mimi = tm.keySet().iterator();
////		while(mimi.hasNext()) {
////			System.out.println(mimi.next());
////		}
//
//		ArrayList<Integer> end = new ArrayList<Integer>();
//		end.addAll(hmap1.values());
//		Collections.sort(end);
////		System.out.println(end);
//		
//	//===
////		for(Map.Entry<String, Integer> m : hmap1.entrySet()) {}		
//		int i = 0;
//	for(Map.Entry<String, Integer> e : hmap1.entrySet()) {
//		System.out.println(i+ " " +e.getKey()+" "+end.get(i)+"개");
//		i++;
//	}		
//	//===	
		
	
	
		
		// 발생빈도 작성	
		
		
		
		
		// 결과 출력


		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class

class ganda implements Comparable<ganda>{
	String ntt;
	int dead;
	
	public ganda() {}
	public ganda(String ntt, int dead) {
		this.ntt = ntt;
		this.dead = dead;
		
	}
	@Override
	public int compareTo(ganda o) {
		if (this.dead > o.dead) return -1;
		if (this.dead < o.dead) return +1;
		return 0;
	}
	
	
	
	
}
