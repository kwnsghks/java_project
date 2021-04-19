package com.ict11.test;

import java.util.Scanner;

public class test1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int [5][5];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("번호 : ");
				int no = scan.nextInt();
				System.out.println("국어 : ");
				int kor = scan.nextInt();
				System.out.println("영어 : ");
				int eng = scan.nextInt();
				System.out.println("수학 : ");
				int math = scan.nextInt();
				int sum = kor+eng+math ;
				int avg = sum / 3;
				int hak = 0;
				if(avg>=90) {
					hak = 'A';
				}else if(avg>=80){
					hak = 'B';
				}else if(avg>=70) {
					hak = 'C';
				}else {
					hak = 'F';
				}
			int rank = 1 ;
			int[] person = new int [5];
			person[0] = no;
			person[1] = sum;
			person[2] = avg;
			person[3] = hak;
			person[4] = rank;
			arr[i] = person;
			}
			int[] rank = {1,1,1,1,1};
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(i<=j) {
						rank[i]++;
				}else {
					break;
				}
			}
				System.out.println("번 호\t총 점\t평 균\t학 점\t순 위");
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][0]+"\t");
					System.out.print(arr[i][1]+"\t");
					System.out.print(arr[i][2]+"\t");
					System.out.print(arr[i][3]+"\t");
					System.out.print(arr[i][4]+"\t");
					
				}
			
		}
	}
}

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
*/
//다차원 배열을 사용해서 국어,영어,수학 점수를 키보드로 
		//	받아서 번호,총점,평균,학점,순위 구하고 정렬하는 코딩
			
		// 첫번째 쓰레드 1~50, 두번째 쓰레드 51~100, 다시 첫번째 쓰레드 101~150, 
		// 두번째 쓰레드 151~200을 출력하는 코딩 (오버라이드)(sinchronized, wait, notify  사용)
			
		// 복사장소와 파일명 받고, 붙이기 장소와 파일명을 받아서 하는 코딩()
/*
public class CopyTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("복사 장소와 파일명");
		String pathname1 = scan.next();
		System.out.print("붙이기 장소와 파일명");
		String pathname2 = scan.next();
		File file1 = new File(pathname1);
		File file2 = new File(pathname2);
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			pathname1 = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"파일명.txt";
			
			
		} catch (Exception e) {
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
		}catch(Exception e2) {
		}
		}
		//
		// 클래스, 메소드, 추상클래스와 인터페이스
		// 상속관계에서 부모클래스, 자식클래스
		// 어떤 클래스에서 같은 이름의 메소드가 여러개 존재하는 것
		// 클래스에서 같은 이름의 메소드가 여러개 존재하는것
		// random 클래스를 활용해서 정수 1~10 사이의 난 수를 구하기
		// 제네닉과 커넥션 쓰기
		// 스레드 클래스와 runnable 인터페이스의 차이점 쓰기
		// 스레드 처리시 동기화 처리에 대해 쓰기
		// 바이트 스트림과 문자 스트림의 차이
				double s1 = 36.66666 
				int s2 = (int)(s1 * 10);
				double s3 = s2 / 10.0;
		*/

