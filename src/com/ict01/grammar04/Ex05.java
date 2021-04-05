package com.ict01.grammar04;
class Ex05 
{
	public static void main(String[] args) 
	{
		// 중첩 while문 : while문안에 while문 존재
		
		// 구구단1 
		int i = 2;
		while (i<10)
		{
			System.out.println(i+"단");
			int j = 1;
			while (j<10)
			{
				System.out.println(i+"*"+j+"="+(i*j)+" ");
				j++;
			}

			i++;
		} 
      // 구구단2
	  // 구구단3 
      // 1 0 0 0
      // 0 1 0 0
	  // 0 0 1 0
	  // 0 0 0 1


	}
}
