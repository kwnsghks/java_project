package com.ict01.grammar04;
import java.util.Scanner;
class Ex06
{
	public static void main(String[] args) 
	{
		// do ~ while �� : while���� ���� �ݺ���
		//                 ���� ���� �� ���߿� ���Ѵ�.
		// ����)
		//  �ʱ��;
		//  do{
        //     ������ ����;
		//     ������;
		//   }while(���ǽ�);

		// 0-10 ���� ���
        int i=0;
		do
		{
			System.out.print(i + " ");
			i++;
		}
		while (i<11);
        System.out.println();

		// �ݺ�Ƚ���� �޾Ƽ� ó�� ���� 
        Scanner scan = new Scanner(System.in);
        System.out.print("�ݺ�Ƚ�� : ");
		int su  = scan.nextInt();
        i=0 ;
		do
		{
			System.out.println("Hello Java");
			i++;
		}while (i<(su));

      // �ݺ�Ƚ���� �Ǻ����ڸ� �޾Ƽ� Ƚ����ŭ �Ǻ����ڰ� Ȧ������ ¦������ ���
		System.out.print("�ݺ�Ƚ�� : ");
		int count = scan.nextInt();
		i=0;
		String msg = "";
		do
		{
			System.out.print("�Ǻ����� : ");
			int k = scan.nextInt();
			if(k%2==0){
			  msg = "¦��";
			}else{
              msg = "Ȧ��";
			}
            System.out.println("�Է��� �� " + k +"�� "+ msg +" �Դϴ�.");
			i++;
		}
		while (i<su);


	}
}
