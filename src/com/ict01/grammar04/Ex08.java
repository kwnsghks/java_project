package com.ict01.grammar04;
class Ex08 
{
	public static void main(String[] args) 
	{
	  // break label : 레이블이 지정한 블록을 탈출한다.
	  //               단순 for문일때는 break와 break label이 같은 효과를 낸다.
      // continue label: 레이블이 지정한 블록의 증감식으로 이동
	  //            단순 for문일때는 continue와 continue label이 같은 효과를 낸다. 

	  // 레이블만드는 방법 : 원하는 반복문 위나 앞에 '레이블명:'

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
