package com.ict01.grammar04;
class Ex08 
{
	public static void main(String[] args) 
	{
	  // break label : ���̺��� ������ ����� Ż���Ѵ�.
	  //               �ܼ� for���϶��� break�� break label�� ���� ȿ���� ����.
      // continue label: ���̺��� ������ ����� ���������� �̵�
	  //            �ܼ� for���϶��� continue�� continue label�� ���� ȿ���� ����. 

	  // ���̺���� ��� : ���ϴ� �ݺ��� ���� �տ� '���̺��:'

      for (int i=1;i<11 ;i++ )
      {
		  if(i==5) break;
		  System.out.print(i + " ");
      }
	  System.out.println();

	  esc1:
	  for (int i=1;i<11 ;i++ )
      {
		  if(i==5) break esc1;
		  System.out.print(i + " ");
      }
	  System.out.println();
      
	  for (int i=1;i<4 ;i++ )
	  {
		  for (int j=1; j<6;j++ )
		  {
			  if(j==3) break;
			  System.out.println("i="+i+", j="+j);
		  }
	  }
	  
	   esc2 :	
	   for (int i=1;i<4 ;i++ )
	  {
		  for (int j=1; j<6;j++ )
		  {
			  if(j==3) break esc2;
			  System.out.println("i="+i+", j="+j);
		  }
	  }
	  System.out.println("==========================");

	  for (int i=1;i<11 ;i++ )
      {
		  if(i==5) continue;
		  System.out.print(i + " ");
      }
	  System.out.println();

	  esc3:
	  for (int i=1;i<11 ;i++ )
      {
		  if(i==5) continue esc3;
		  System.out.print(i + " ");
      } 
     System.out.println();
     System.out.println("==========================");

	 for (int i=1;i<4 ;i++ ){
		  for (int j=1; j<6;j++ ){
			  if(j==3) continue;
			  System.out.println("i="+i+", j="+j);
		  }
	  }
	   System.out.println("==========================");
	   esc4 :	
	   for (int i=1;i<4 ;i++ ){
		  for (int j=1; j<6;j++ ){
			  if(j==3) continue esc4;
			  System.out.println("i="+i+", j="+j);
		  }
	  }
	System.out.println("==========================");
	}
}
