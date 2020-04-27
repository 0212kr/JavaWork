package daily.dailysum;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.math.Quantiles.Scale;

/*
 * 연습 : 자치구단위 서울 생활인구 일별 집계표
 * ■자치구단위 서울 생활인구 일별 집계표
 * 	http://data.seoul.go.kr/dataList/datasetView.do?infId=OA-15379&srvType=S&serviceKind=1&currentPageNo=1
 * 	http://openapi.seoul.go.kr:8088/(인증키)/(요청파일타입)/SPOP_DAILYSUM_JACHI/(요청시작INDEX)/(요청종료INDEX)/(기준일ID)/(시군구코드)
 * 
 * 샘플url
 * 	XML 버젼
 * 	http://openapi.seoul.go.kr:8088/(인증키)/xml/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/20190101
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/20190101/11000
 * 
 * 	JSON 버젼
 * 	http://openapi.seoul.go.kr:8088/(인증키)/json/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/	
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/20190101
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/20190101/11000
 * 
 * ※ 한번에 1000개 까지의 데이터만 볼수 있슴
 * 
 */

/*  입력예]
 *  날짜입력: 20190101
 *  시작Index : 1
 *  끝Index: 5
 *  
 *  [XML]
 *  날짜             구ID        총생활인구수           일최대이동인구수
 *  ----------------------------------------------------------------------
 *  20190101	11000    11121182.98210      4764635.18080 
 *  20190101    11110    274919.65940        177877.95000 
 *  20190101    11140    267096.65940        149729.45840 
 *  20190101    11170    315220.18480        149329.14120 
 *  20190101    11200    351993.77950        153738.94490
 *   
 *  [JSON]
 *  날짜             구ID        총생활인구수           일최대이동인구수
 *  ----------------------------------------------------------------------
 *  20190101	11000    11121182.98210      4764635.18080 
 *  20190101    11110    274919.65940        177877.95000 
 *  20190101    11140    267096.65940        149729.45840 
 *  20190101    11170    315220.18480        149329.14120 
 *  20190101    11200    351993.77950        153738.94490 
 * 
 */

// ★ 주목 ★
// XML 은 Jsoup 를 활용하여 파싱하세요
// JSON 은  jackson 을 활용하여 파싱하세요

//12강 15강 참고
public class DailySumMain {

	public static final String REQ_SERVICE = "CardSubwayStatsNew";
	public static final String API_KEY = "6a6278765130323139374f4b635451";
	
	public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	
		System.out.println("서울시 지하철 호선별 역별 승하차 인원정보");
		String url = buildUrlAddress("xml", 1, 5,"20190101");
		
		//XML 파싱할때는 xml parser 를 사용한다			//get으로 리퀘스트
		Document doc = Jsoup.connect(url).parser(Parser.xmlParser()).get();
		Elements elements = doc.select("row");
		System.out.println("[XML]");
		System.out.println("날짜\t\t    구ID\t\t총생활인구수\t일최대인구수");
		System.out.println("----------------------------------------------------------------------");
		for(Element e : elements) {
			String STDR_DE_ID = e.selectFirst("STDR_DE_ID").text().trim();
			String SIGNGU_CODE_SE = e.selectFirst("SIGNGU_CODE_SE").text().trim();
			String TOT_LVPOP_CO = e.selectFirst("TOT_LVPOP_CO").text().trim();
			String DAIL_MXMM_MVMN_LVPOP_CO = e.selectFirst("DAIL_MXMM_MVMN_LVPOP_CO").text().trim();
			
			System.out.printf("%5s\t%8s\t%6s\t%6s\n",
					STDR_DE_ID,SIGNGU_CODE_SE,TOT_LVPOP_CO,DAIL_MXMM_MVMN_LVPOP_CO);

		}
		
		System.out.println();
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("날자를 입력해주세요 YYYYMMSS");
		String day = sc.nextLine();
		String name = String.format("http://openapi.seoul.go.kr:8088/6a6278765130323139374f4b635451/json/SPOP_DAILYSUM_JACHI/1/5/%s",
				URLEncoder.encode(day,"utf-8"));
		URL url2 = new URL(name);
		
		System.out.println("[JSOP]");
		System.out.println("날짜\t\t    구ID\t\t총생활인구수\t일최대인구수");
		System.out.println("----------------------------------------------------------------------");
		Human human = mapper.readValue(url2, Human.class);
		for(Info e : human.getHumanList()) {
			System.out.printf("%d%d%d%d",e.getId(),e.getSigngu(),e.getTot(),e.getDail());
		}
		
		
	}//END MAIN
	
	
	public static String  buildUrlAddress(String reqType, int startIndex, 
			int endIndex, String date) {
		String url_address = String.format("http://openapi.seoul.go.kr:8088/%s/%s/SPOP_DAILYSUM_JACHI/%d/%d/%s",
				API_KEY, reqType, startIndex, endIndex, date);
		
		return url_address;
		
}// END BUILDURLADDRESS
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	class Human{
		private ArrayList<Info> humanList;
		
		public ArrayList<Info> getHumanList(){return humanList;}
		
		public Human(ArrayList<Info> humanList) {super();this.humanList = humanList;}
		
		public Human() {super();}
		
		public void setHumanList(ArrayList<Info> humanList) {this.humanList = humanList;}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	class Info{
		@JsonProperty("STDR_DE_ID")
		private String id;
		@JsonProperty("SIGNGU_CODE_SE")
		private String signgu;
		@JsonProperty("TOT_LVPOP_CO")
		private String tot;
		@JsonProperty("DAIL_MXMM_MVMN_LVPOP_CO")
		private String dail;
		
		public Info() {
			super();
		}
		
		public Info(String id, String signgu, String tot, String dail) {
			super();
			this.id = id;
			this.signgu = signgu;
			this.tot = tot;
			this.dail = dail;
		}

		public String getId() {return id;}
		public void setId(String id) {this.id = id;}

		public String getSigngu() {return signgu;}
		public void setSigngu(String signgu) {this.signgu = signgu;}

		public String getTot() {return tot;}
		public void setTot(String tot) {this.tot = tot;}

		public String getDail() {return dail;}
		public void setDail(String dail) {this.dail = dail;}
		
	}
	
}//END CLASS
