package com.ict11.test;

import java.util.Scanner;

public class test1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int [5][5];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("��ȣ : ");
				int no = scan.nextInt();
				System.out.println("���� : ");
				int kor = scan.nextInt();
				System.out.println("���� : ");
				int eng = scan.nextInt();
				System.out.println("���� : ");
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
				System.out.println("�� ȣ\t�� ��\t�� ��\t�� ��\t�� ��");
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
//������ �迭�� ����ؼ� ����,����,���� ������ Ű����� 
		//	�޾Ƽ� ��ȣ,����,���,����,���� ���ϰ� �����ϴ� �ڵ�
			
		// ù��° ������ 1~50, �ι�° ������ 51~100, �ٽ� ù��° ������ 101~150, 
		// �ι�° ������ 151~200�� ����ϴ� �ڵ� (�������̵�)(sinchronized, wait, notify  ���)
			
		// ������ҿ� ���ϸ� �ް�, ���̱� ��ҿ� ���ϸ��� �޾Ƽ� �ϴ� �ڵ�()
/*
public class CopyTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ��ҿ� ���ϸ�");
		String pathname1 = scan.next();
		System.out.print("���̱� ��ҿ� ���ϸ�");
		String pathname2 = scan.next();
		File file1 = new File(pathname1);
		File file2 = new File(pathname2);
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			pathname1 = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"���ϸ�.txt";
			
			
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
		// Ŭ����, �޼ҵ�, �߻�Ŭ������ �������̽�
		// ��Ӱ��迡�� �θ�Ŭ����, �ڽ�Ŭ����
		// � Ŭ�������� ���� �̸��� �޼ҵ尡 ������ �����ϴ� ��
		// Ŭ�������� ���� �̸��� �޼ҵ尡 ������ �����ϴ°�
		// random Ŭ������ Ȱ���ؼ� ���� 1~10 ������ �� ���� ���ϱ�
		// ���״а� Ŀ�ؼ� ����
		// ������ Ŭ������ runnable �������̽��� ������ ����
		// ������ ó���� ����ȭ ó���� ���� ����
		// ����Ʈ ��Ʈ���� ���� ��Ʈ���� ����
				double s1 = 36.66666 
				int s2 = (int)(s1 * 10);
				double s3 = s2 / 10.0;
		*/

