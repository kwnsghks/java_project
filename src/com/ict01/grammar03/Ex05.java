package com.ict01.grammar03;
class Ex05{
	public static void main(String[] args){
	
	// int k1�� 60�̻��̸� �հ� �ƴϸ� ���հ�
	int k1 = 70 ;
        String res1 = (k1 >= 60) ? ("�հ�") : ("���հ�")  ;
        System.out.println("���1 : " + res1 );

	// int k2�� Ȧ������ ¦������ �Ǻ����� 
        int k2 = 46 ;
        String res2 = (k2%2 == 0) ? "¦��" : "Ȧ��" ;  
        System.out.println("���2 ; " + res2);

	// char k3�� �빮������ �빮�ڰ� �ƴ��� �Ǻ�����
	char k3 = 'c';
        String res3 = (k3>='A' && k3<='Z') ? "�빮��" : "�빮�ھƴ�" ;
	System.out.println("���3 : " +  res3);

	// �ٹ��ð��� 8�ð������� �ð��� 8720�̰�
	// 8�ð��� �ʰ��� �ð���ŭ�� 1.5�� �̴�.
	// ���� �ٹ��ð��� 10�ð� �̴�.
	// �󸶸� �޾ƾ� �ϴ°�?
	
	int time = 10 ;
        int dan = 8720 ;
        int pay = (time > 8) ? (8*dan) + (int)((time-8)*dan * 1.5) : time * dan  ;
	System.out.println("���4 : " + pay);
	}
}





