package com.ict01.grammar04;
class Ex02 
{
	public static void main(String[] args) 
	{
		// for�� : ������ ��Ģ�� ���� ���๮�� �ݺ� ó���ϴ� ��
		// ���� :  for(�ʱ��; ���ǽ�; ������){
        //            ���ǽ��� ���϶� ������ ����;
		//            ���ǽ��� ���϶� ������ ����;
		//          }

		// for���� ������ ������ �ʱ������ �̵�
		// �ʱ�Ŀ����� ���ǽ����� �̵�
		// ���ǽ��� ���̸� for ���� ���� 
		// ���ǽ��� �����̸� for���� ������ ����������.
		// for�� ���� �� for���� ���� ������ ������ ���������� ����.
        // �������� ������ ���ǽ����� �̵�
		
		// �ȳ��ϼ���, ���� ����ϱ� 
		for (int i=1; i<11 ; i++)
		{
           System.out.println("�ȳ��ϼ��� - " + i);
		}

		// 0-15 ���� ������� 
		for (int i=0; i<16 ; i++ )
		{
			System.out.print(i+"  ");
		}
		System.out.println();

		// 0-10���� ¦���� ���
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
        
		// 0-10���� Ȧ���� �������
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

	    // 0-50���� 7�� ����� ������� 
		for (int i=0; i<51; i++ )
		{
			if(i%7==0){
				System.out.print(i+"  ");
			}
		}
		System.out.println();

		// 5�� ���
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

		// 0- 10 ���� ������ ���ϱ� (0+1+2+3+4+5+6+7+8+9+10)
		int sum = 0; // �������� ����ϴ� ����
		for (int i=0; i<11 ;i++ )
		{
			System.out.println(sum + "+" + i);
			sum = sum + i ; // i�� ������
		}
		System.out.println("�� : " + sum);

		// Ȧ���� ������(0-10)
		int odd = 0 ;
		for (int i=0; i<11;i++ )
		{
			if(i%2==1){
				odd = odd + i ;
			}
		}
		System.out.println("Ȧ���� �� : " + odd);

		// ¦���� ������(0-10)
		int even = 0 ;
		for (int i=0; i<11; i++ )
		{
			if(i%2==0){
				even = even + i;
			}
		}
		System.out.println("¦���� �� : " + even);

       // Ȧ���� ¦���� �������� ���� ���Ͻÿ� (0-10)
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
       System.out.println("¦���� �� : " + even);
       System.out.println("Ȧ���� �� : " + odd);

		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1)
        int total = 1;
		for (int i=7; i > 0 ; i-- )
		{
			total = total * i ;
		}
		System.out.println("7! = " + total);
	}
}
