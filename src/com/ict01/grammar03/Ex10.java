package com.ict01.grammar03;
class Ex10{
	public static void main(String[] args){
          // if ~ else ~ : ���ǽ��� ���϶��� �����϶� ���� ������ ó���Ѵ�.
          // ���� :  if(���ǽ�){
          //            ���ǽ��� ���϶� ������ ����;
          //            ���ǽ��� ���϶� ������ ����;
	  //         } else {
          //            ���ǽ��� �����϶� ������ ����;   
          //            ���ǽ��� �����϶� ������ ����;   
	  //         }
          //    ��, ������ ������ �� ���̸� ���� �����ϴ�.
	
 	// int k1�� 60�̻��̸� �հ� �ƴϸ� ���հ�
	int k1 = 76;
	String str = "";
	if(k1 >=60){
            str = "�հ�";
	}else{
	    str = "���հ�";		
	}	
        System.out.println("���1 : " + str);

	// int k2�� Ȧ������ ¦������ �Ǻ�����
	int k2 = 14;
	String str2 = "";
	if(k2 %2 == 0){
           str2 = "¦��";
	}else{
           str2 = "Ȧ��";
	}
	System.out.println("���2 : " + str2);

	// char k3�� �빮������ �빮�ڰ� �ƴ��� �Ǻ�����
	char k3 ='E';
	String str3 = "";
        if(k3>='A' && k3<='Z'){
	   str3 = "�빮��";	
	} else {
	   str3 = "�빮�� �ƴ�";
	}	
	System.out.println("���3 : " + str3);

	// k4�� 1 �Ǵ� 3�̸� ���� �ƴϸ� ����
	int k4 = 3 ;
	String str4 = "";
	if(k4==1 || k4==3){
	  str4 = "����";	
	}else{
	  str4 = "����";
	}
	System.out.println("���4 : " + str4);

	// �ٹ��ð��� 8�ð������� �ð��� 8720�̰�
	// 8�ð��� �ʰ��� �ð���ŭ�� 1.5�� �̴�.
	// ���� �ٹ��ð��� 10�ð� �̴�.
	// �󸶸� �޾ƾ� �ϴ°�?
	int time = 10 ;
	int dan = 8720;
	int pay = 0 ;
	if( time > 8) {
	  pay = (8*dan) + (int)((time-8)*dan*1.5) ;
	}else{
	  pay = time * dan;
	}
	System.out.println("����� �� �ݾ� : " + pay);
	}
}





