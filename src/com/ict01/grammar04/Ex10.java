package com.ict01.grammar04;
import java.util.Scanner;
class Ex10 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		esc:
		while(true){
           System.out.print("숫자입력 : ");
		   int k = scan.nextInt();
		   String msg = "";
		   if(k%2==0){
			   msg = "짝수";
		   }else{
			   msg = "홀수";
		   }
		   System.out.println(k + "는 "+msg +" 입니다.");
		   while(true){
				System.out.print("계속할까요?(1.yes, 2.no) >>> ");
				int k2 = scan.nextInt();
				if(k2==1){
					// continue esc;
					 break;
				}else if(k2==2){
                     break esc;
				}else{
                     continue;
				}
		   } // 안쪽
		   System.out.println("안쪽 while문 끝");
		}    // 밖쪽
	}
}
