package com.ict01.grammar02;
class Ex07{
	public static void main(String[] args){
           // �̸��� ȫ�浿�� ����� ����:90, ����:80, ����:90�̴�.
           // ������ ����� ���ؼ� �̸�, ����, ����� ������� 
           // (��, ����� �Ҽ��� ù°�ڸ����� ���Ѵ�.)
           
           // ���ϴ� ������ �ޱ� : �Է�
           String name = "ȫ�浿" ;
           int kor = 90 ;
           int eng = 80 ;
           int math = 90 ;

           // ���� ������ �̿��ؼ� ���ϴ� ���� ���� : ����
           int sum = kor + eng + math ;
           double avg = sum / 3.0 ;
           double avg2 = (int)(avg*10) /10.0 ; 
          
          // ���ϴ� ���� ���
          System.out.println("�̸� : " + name); 
          System.out.println("���� : " + sum);   
          System.out.println("��� : " + avg2); 
         
        }
}