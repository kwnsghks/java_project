package com.ict01.grammar04;
import java.util.Scanner;
class Ex06
{
	public static void main(String[] args) 
	{
		// do ~ while 문 : while문과 같은 반복문
		//                 먼저 실행 후 나중에 비교한다.
		// 형식)
		//  초기식;
		//  do{
        //     실행할 문장;
		//     증감식;
		//   }while(조건식);

		// 0-10 까지 출력
        int i=0;
		do
		{
			System.out.print(i + " ");
			i++;
		}
		while (i<11);
        System.out.println();

		// 반복횟수를 받아서 처리 하자 
        Scanner scan = new Scanner(System.in);
        System.out.print("반복횟수 : ");
		int su  = scan.nextInt();
        i=0 ;
		do
		{
			System.out.println("Hello Java");
			i++;
		}while (i<(su));

      // 반복횟수와 판별숫자를 받아서 횟수만큼 판별숫자가 홀수인지 짝수인지 출력
		System.out.print("반복횟수 : ");
		int count = scan.nextInt();
		i=0;
		String msg = "";
		do
		{
			System.out.print("판별숫자 : ");
			int k = scan.nextInt();
			if(k%2==0){
			  msg = "짝수";
			}else{
              msg = "홀수";
			}
            System.out.println("입력한 수 " + k +"는 "+ msg +" 입니다.");
			i++;
		}
		while (i<su);


	}
}
