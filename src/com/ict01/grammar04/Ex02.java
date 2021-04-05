package com.ict01.grammar04;
class Ex02 
{
	public static void main(String[] args) 
	{
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리하는 문
		// 형식 :  for(초기식; 조건식; 증감식){
        //            조건식이 참일때 실행할 문장;
		//            조건식이 참일때 실행할 문장;
		//          }

		// for문을 만나면 무조건 초기식으로 이동
		// 초기식에서는 조건식으로 이동
		// 조건식이 참이면 for 문을 실행 
		// 조건식이 거짓이면 for문을 밖으로 빠져나간다.
		// for문 실행 중 for문의 끝을 만나면 무조건 증감식으로 간다.
        // 증감식이 끝나면 조건식으로 이동
		
		// 안녕하세요, 열번 출력하기 
		for (int i=1; i<11 ; i++)
		{
           System.out.println("안녕하세요 - " + i);
		}

		// 0-15 까지 출력하자 
		for (int i=0; i<16 ; i++ )
		{
			System.out.print(i+"  ");
		}
		System.out.println();

		// 0-10까지 짝수만 출력
		for (int i=0; i<11; i=i+2)
		{
			System.out.print(i+"  ");
		}
		System.out.println();

		for (int i=0; i<11; i++ )
		{
			if(i%2==0){
				System.out.print(i+"  ");
			}
		}
		System.out.println();
        
		// 0-10까지 홀수만 출력하자
		for (int i=1; i<11; i=i+2)
		{
			System.out.print(i+"  ");
		}
		System.out.println();

		for (int i=0; i<11; i++ )
		{
			if(i%2==1){
				System.out.print(i+"  ");
			}
		}
		System.out.println();

	    // 0-50까지 7의 배수만 출력하자 
		for (int i=0; i<51; i++ )
		{
			if(i%7==0){
				System.out.print(i+"  ");
			}
		}
		System.out.println();

		// 5단 출력
		for (int i=1; i<10 ; i++ )
		{
			System.out.println(" 5 * " + i +" = " + (5*i));
		}

		// 0 0 0 0
		// 0 0 0 0 
		// 0 0 0 0
		// 0 0 0 0 

		for (int i=1; i <17 ; i++ )
		{
			System.out.print("0 ");
			if(i%4==0){
				System.out.println();
			}
			
		}

		for (int i=1; i<5; i++ )
		{
			System.out.println("0 0 0 0");
		}

		// 0- 10 까지 누적합 구하기 (0+1+2+3+4+5+6+7+8+9+10)
		int sum = 0; // 이전값을 기억하는 변수
		for (int i=0; i<11 ;i++ )
		{
			System.out.println(sum + "+" + i);
			sum = sum + i ; // i의 누적합
		}
		System.out.println("합 : " + sum);

		// 홀수의 누적합(0-10)
		int odd = 0 ;
		for (int i=0; i<11;i++ )
		{
			if(i%2==1){
				odd = odd + i ;
			}
		}
		System.out.println("홀수의 합 : " + odd);

		// 짝수의 누적합(0-10)
		int even = 0 ;
		for (int i=0; i<11; i++ )
		{
			if(i%2==0){
				even = even + i;
			}
		}
		System.out.println("짝수의 합 : " + even);

       // 홀수와 짝수의 누적합을 각각 구하시오 (0-10)
 	    even = 0 ;
		odd = 0 ;
		for (int i=0; i<11; i++)
		{
			if (i%2==0){
				even = even + i;
			}else{
			    odd = odd + i ;
			}
		}
       System.out.println("짝수의 합 : " + even);
       System.out.println("홀수의 합 : " + odd);

		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1)
        int total = 1;
		for (int i=7; i > 0 ; i-- )
		{
			total = total * i ;
		}
		System.out.println("7! = " + total);
	}
}
