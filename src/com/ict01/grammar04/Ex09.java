package com.ict01.grammar04;
import java.util.Scanner;
class Ex09 
{
	public static void main(String[] args) 
	{
     // 1-10���� ¦���� ��� (continue ����ؼ�)
	 for (int i=1; i<11 ; i++ )
	 {
		 if(i%2==1) continue;
		 System.out.println(i);
	 }


	// ���ѷ������� ���ڸ� �޾Ƽ� ¦��,Ȧ�� �Ǻ�
      Scanner scan = new Scanner(System.in);

	  while(true){
		System.out.print("�����Է� : ");
        int k = scan.nextInt();
		String msg = "";
		if(k%2==0){
			msg = "¦��";
		}else{
			msg = "Ȧ��";
		}
       System.out.println(k +"�� " + msg +" �Դϴ�.");
       System.out.print("����ұ��?(1.yes, 2.no) >>> ");
       int k2 = scan.nextInt();
	   if(k2 == 2) break;
	  }

     


	}
}
