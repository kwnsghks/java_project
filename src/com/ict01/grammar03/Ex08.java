package com.ict01.grammar03;
import java.util.Scanner;
class Ex08{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	// ���ڸ� �޾Ƽ� Ȧ��, ¦���� ��������
        System.out.print("���� �Է� : " );
        int su1 = scan.nextInt();
        String res = (su1%2==0) ? "¦��" : "Ȧ��" ;
        System.out.println("����� " +  res + "�Դϴ�.");

	// ����,����,������ �޾Ƽ� 
        // ������ ����� 60�̻��̰�, 
        // ���� ������ 40�� �̻��϶� �հ� �ƴϸ� ���հ�
        System.out.print("�������� : ");	
        int kor = scan.nextInt();
      	
        System.out.print("�������� : "); 
	int eng = scan.nextInt();
	
        System.out.print("�������� : "); 
	int math = scan.nextInt();

        int sum = kor + eng + math ;
        double avg =  (int)(sum/3.0 *10) / 10.0;
        String res2 = (avg>=60 && kor >=40 && eng >=40 && math >= 40) 
			? "�հ�" : "���հ�";
        System.out.println("����� "+ res2 + "�Դϴ�.");

        // �˹ٽð��� �Է� �޾Ƽ� 
        // 8�ð������� �ð��� 8720�̰�
	// 8�ð��� �ʰ��� �ð���ŭ�� 1.5�� �̴�.
        // ���� �ݾ��� ��� ���� 
	System.out.print("�˹ٽð� : "); 
	int time = scan.nextInt();
        int dan = 8720;
        int pay = (time > 8) ?(8*dan)+(int)((time-8)*dan *1.5) : dan * time ;
	System.out.println("����� �ݾ��� " + pay + "�Դϴ�");	

	}
}




