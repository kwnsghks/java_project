package com.ict01.grammar03;
class Ex01{
	public static void main(String[] args){
	// �������� : &&(AND, ����),  ||(OR, ����), ! (NOT, ������)
        //   ���Ǵ� �ڿ� : boolean��, �񱳿���, ������
        //   �����  boolean�� => ���ǽĿ� ���ȴ�.
        
        // && (AND, ����, ������)
        // - �־��� ������ ��� true �϶��� ����� true
        // - �־��� ���ǵ� �߿�  false�� ������ ����  ��� false
        // - false�� ������ ���Ŀ� �ִ� ���� ���� �ʴ´�.
         	
    	int s1 = 10 ;
	int s2 = 7 ;

      	boolean result = true && true ;
        System.out.println(result);
   
        result = (s1 >= 7) && (s2 >= 5);
	System.out.println(result);

        result = false && true;
	System.out.println(result);

        result = (s1 <= 7) && (s2 >= 5);
	System.out.println(result);
	
	// false ������ ���� �������� �ʴ´�.
        result = ((s1 = s1 + 2) > s2 ) && (s1 == (s2 = s2 + 5));       
        System.out.println("��� : " + result); 
        System.out.println("s1 : " + s1); 
        System.out.println("s2 : " + s2); 
		
        result = ((s1 = s1 + 2) < s2 ) && (s1 == (s2 = s2 + 5));       
        System.out.println("��� : " + result); 
        System.out.println("s1 : " + s1); 
        System.out.println("s2 : " + s2); 

        // && �� ������ ��� ���� ������ �� �ִ�.
        //  a >= 10  && a <= 20   ;  a�� 10���� 20������ ������ �ǹ��Ѵ�.
        s1 = 24 ;
        result = (s1 >=20) && (s1 <=30);
        System.out.println("��� : " + result);

        // char c1 �� �ҹ��� �̳�?
        char c1 = 'k' ;  // D => 68
	// result = (c1 >=97) && (c1 <=122); // �ҹ��ڹ���

	result = (c1 >= 'a') && (c1 <= 'z');
 	System.out.println("��� : " + result);

	}
}






