package com.ict01.grammar02;
class Ex04{
	public static void main(String[] args){
          // ���ڵ��� ũ�⿡ ���� ���� ����
          // char < int < long < float < double ;
          //(����) (������ ����)  (�Ǽ�������) 

	  // ����ȯ :  �ڵ�����ȯ�� ��������ȯ
          // �ڵ��� ��ȯ : ���� �ڷ����� ū �ڷ����� ����� �� 
          
          // char�� int �� ������ �� �ִ�.
          char c1 = 'a';
          System.out.println(c1);  // a  

          int s1 = 'a' ;
          System.out.println(s1);  // 97 
          
          // char c1 ������  int  s2 �� ���� 
          int s2 = c1 ;
          System.out.println(s2);  // 97
         
         // int�� long �� ������ �� �ִ�.
          long s3 = 117L ;
          System.out.println(s3);

          long s4 = 117 ;

         // long�� float�� double �� ������ �� �ִ�.
         float s5 = s3 ;
         System.out.println(s5);

        // ������ ��ȯ : ū�ڷ����� �����ڷ������� �����Ҷ� 
         //               ������ �߻��Ѵ�. 
        //               ������ �� ��ȯ�ؼ� ������ ���� ���Ѵ�.
        //               �׷���, �����͸� �ս��� ���ɼ��� �ִ�.
        // ������ ��ȯ ���  : = �� �������� ������ �����ڷ����� �����.
        //                      = (�����ڷ���)(���);

        byte k1 = (byte)(257) ;    
        System.out.println(k1);

        // int �� char�� ���� 
        char k2 = 97 ;
        System.out.println(k2); 

        int k3 = 97 ;
        char k4 = (char)(k3) ;
        System.out.println(k4); 

        // float�� double�� int�� ����
         int k5 = (int)(87.64);
	System.out.println(k5); 
        
       
	}
}







