package com.ict01.grammar04;
class Ex04 
{
	public static void main(String[] args) 
	{
	// while�� : for���� ���� �ݺ���
	// ����1)                            ����2)
	//  �ʱ��;                           �ʱ��;
	//  while(���ǽ�){                    while(true){ 
    //    ���ǽ��� ���϶� ������ ����;      ** if (������������) break; (����Ż��)
    //    ���ǽ��� ���϶� ������ ����;         ���ǽ��� ���϶� ������ ����; 
	//    ������;                           ** if (������������) break; (����Ż��)   
	//  }                                    ������;   
	//                                     }     
	//  ** while�� ���� ������ ���ǽ����� �̵��϶� 
       
	   // 0-15 ���� ������� 
	   int i = 0 ;
	   while (i<16)
	   {
		  System.out.print(i+" "); 
		  i++;
	   }
	  System.out.println();

      i = 0 ; 
      while (true)
      {
         if(i >= 16 ) break;
		 System.out.print(i+" ");
		 i++;
      }
     System.out.println();

	   // 0-10���� Ȧ���� ���
	   i = 0 ;
	   while (i<11)
	   {
		   if(i%2==1){
			  System.out.print(i + " ");
		   }
		   i++;
	   }
      System.out.println();
	   // 0-10���� ¦���� ���
       i = 0 ;
	   while (true)
	   {
         if(i>=11) break;
		 if(i%2==0){
			System.out.print(i+" ")	 ;
		 }
		   i++;
	   }
       System.out.println();

	   // 0-50���� 7�� ����� ���
       i = 0 ;
	   while (i<51)
	   {
		   if(i%7==0){
			  System.out.print(i + " ");
		   }
		   i++;
	   }  
	   System.out.println();

	   // 5�� ���
       i = 1;
	   while(i<10){
		System.out.println("5*" + i + "=" + (5*i));
		i++;
	   }

	   // 0 0 0 0
	   // 0 0 0 0 
	   // 0 0 0 0
	   // 0 0 0 0 
	   i = 1 ;
	   while (i<17)
	   {
		   System.out.print("0 ");
		   if(i%4==0){
             System.out.println();
		   }
		   i++;
	   }
       System.out.println();

	   // 0- 10 ���� ������ ���ϱ� (0+1+2+3+4+5+6+7+8+9+10)
       int sum = 0 ;
	   i = 0 ;
	   while (i<11)
	   {
		   sum = sum + i ;
		   i++;
	   }
	   System.out.println("������ : " + sum);

	   // Ȧ���� ¦���� �������� ���� ���Ͻÿ� (0-10)
       int odd = 0 ;
	   int even = 0 ;
	   i = 0 ;
	   while(i<11){
		   if(i%2==0){
              even = even + i;
		   }else{
              odd = odd + i ; 
		   }
		i++;
	   }
	   System.out.println("¦���� �� : " + even);
	   System.out.println("Ȧ���� �� : " + odd);
	}
}
