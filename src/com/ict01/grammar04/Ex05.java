package com.ict01.grammar04;
class Ex05 
{
	public static void main(String[] args) 
	{
		// ��ø while�� : while���ȿ� while�� ����
		
		// ������1 
		int i = 2;
		while (i<10)
		{
			System.out.println(i+"��");
			int j = 1;
			while (j<10)
			{
				System.out.println(i+"*"+j+"="+(i*j)+" ");
				j++;
			}

			i++;
		} 
      // ������2
	  // ������3 
      // 1 0 0 0
      // 0 1 0 0
	  // 0 0 1 0
	  // 0 0 0 1


	}
}
