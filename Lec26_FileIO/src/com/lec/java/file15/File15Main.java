package com.lec.java.file15;

import java.io.File;

public class File15Main {

	public static void main(String[] args) {
		System.out.println("디렉토리 정보 확인");
		System.out.println();
		// current working directory : 현재작업경로
		String curWorkingDir = System.getProperty("user.dir");
		System.out.println("현재 작업 폴더: "+curWorkingDir);
		
		System.out.println();
		// 현재 작업 디렉토리의 파일 리스트 출력
		// File 클래스: 파일(txt, doc, ...) 객체 또는 디렉토리(폴더) 객체
		File curDir = new File(curWorkingDir);	// 현재 작업 디렉토리 객체
		File[] list = curDir.listFiles();	//listFiles() : 디렉토리 안에 있는 '파일' 과 '디렉토리' 를 file 배열로 리턴
		
		System.out.println(list.length);
//		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i].getName());
//		}
		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				// isDirectory(): File 객체가 디렉토리이면 true 리턴
				// isFile(): File 객체가 파일이면 true 리턴

				System.out.print("DIR\t");
			}else {
				System.out.print("FILE\t");
			}
			System.err.print(list[i].getName()+"\t");
			System.out.println(list[i].length()); // lenght() 파일의 크기 Byte
												// 디렉토리 인경우는 상관없다
		}
		System.out.println();
		// 디렉토리의 내용 출력, enhanced for 문 이용
//		File tempDir = new File("temp");	// '상대경로' 이용한 File 객체 생성
		
		//'절대경로(absolute path)' 를 이용한 File 객체 생성
		String TempDirPath = System.getProperty("user.dir")
		+ File.separator			// 윈도우(\), LINUX, Mac (/)
		+"temp";

		System.out.println("절대경로 : "+TempDirPath);
		
		File temfDir = new File(TempDirPath);
		
		File [] list2 = temfDir.listFiles();
		
//		for (int i = 0; i < list2.length; i++) {
//			if (list2[i].isDirectory()) {
//				System.out.print("DIR\t");
//			}else {
//				System.out.print("FILE\t");
//			}
//			System.out.print(" "+list2[i].getName()+"\t");
//			System.out.println(+list2[i].length());
//		}
		
		//====
		
		for ( File list3 : list2 ) {
			System.out.println(list3.getName());
			System.out.println(list3.length());
		}
	
		System.out.println();
		// 파일 하나에 대한 정보
		String path = "dummy.txt";
		File f = new File(path);	// 새로운 File 객체 생성!
						// File 객체를 생성(new) 했다고 해서
						// 물리적인 파일이 생성되진 않음
		
		System.out.println("파일이름 : "+f.getName());	// 상대 경로명
		System.out.println("절대경로 : "+f.getAbsolutePath());
		System.out.println("있냐? "+f.exists());	// 물리적으로 존재하는지 여부 (boolen타입)
		
		
		
		
		
		System.out.println("\n프로그램 종료");
		
	} // end main()

} // end File11Main

















