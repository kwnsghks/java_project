package com.ict01.grammar04;
import java.util.Scanner;
class Ex10 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		esc:
		while(true){
           System.out.print("�����Է� : ");
		   int k = scan.nextInt();
		   String msg = "";
		   if(k%2==0){
			   msg = "¦��";
		   }else{
			   msg = "Ȧ��";
		   }
		   System.out.println(k + "�� "+msg +" �Դϴ�.");
		   while(true){
				System.out.print("����ұ��?(1.yes, 2.no) >>> ");
				int k2 = scan.nextInt();
				if(k2==1){
					// continue esc;
					 break;
				}else if(k2==2){
                     break esc;
				}else{
                     continue;
				}
		   } // ����
		   System.out.println("���� while�� ��");
		}    // ����
	}
}
