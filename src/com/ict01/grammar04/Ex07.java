package com.ict01.grammar04;
class Ex07 
{
	public static void main(String[] args) 
	{
		// break �� : ���� �ݺ����� Ż�� �� �� ��� 
		// continue �� : continue�� ������ ���๮�� �����ϰ� ���� ȸ���� �ݺ�����
		for (int i=1;i<11 ;i++ )
		{
			if( i == 4 ) break;
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i=1;i<11 ;i++ )
		{
			if( i == 4 ) continue ;
			System.out.print(i + " ");
		}
		System.out.println();

		int k = 11 ;
		while (k<21)
		{
			if(k==17) break;
			System.out.print(k + " ");
			k++;
		}
		System.out.println();
		
		// 17 �� ���� �ݺ��ȴ�.
		k = 11 ;
		while (k<21)
		{
			// if(k==17) continue;
			System.out.print(k + " ");
			k++;
		}
		System.out.println();

		// ��ø for������ break ��� ; j = 3�϶� break;
		for (int i=1;i<4 ;i++ )
		{
			for (int j=1;j<6 ;j++ )
			{
				if(j==3) break;
				System.out.println("i="+i +", j="+j);
			}
		}
		System.out.println("==================");
		// ��ø for������ break ��� ;  i= 2�϶� break;
		for (int i=1;i<4 ;i++ )
		{
			for (int j=1;j<6 ;j++ )
			{
				if(i==2) break;
				System.out.println("i="+i +", j="+j);
			}
		}
        System.out.println("==================");

		// ��ø for������ break ��� ; j = 3�϶� continue;
		for (int i=1;i<4 ;i++ )
		{
			for (int j=1;j<6 ;j++ )
			{
				if(j==3) continue;
				System.out.println("i="+i +", j="+j);
			}
		}
		System.out.println("==================");
		// ��ø for������ break ��� ;  i= 2�϶� continue;
		for (int i=1;i<4 ;i++ )
		{
			for (int j=1;j<6 ;j++ )
			{
				if(i==2) continue;
				System.out.println("i="+i +", j="+j);
			}
		}
	}
}
