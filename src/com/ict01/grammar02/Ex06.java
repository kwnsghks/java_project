package com.ict01.grammar02;
class Ex06{
	public static void main(String[] args){

	// ��������� ;  + , - , * , /, %(������)
        // byte < short < char < int < long < float < double
        // �����ڷ����� ū�ڷ����� �����ϸ� ū �ڷ������� ����
        // int + int = int, long + long = long, float + float = float
        // int + long = long, float + double = double, 
        // int + double = double  
        // ����) byte + byte = byte (X),    int(O)
        //       short + short = short (X), int(O)
        //       byte + short = short(x),   int(O)

         // ������ ����
         int k1 = 21755;     // 21750  ���ϱ�
         int s1 = k1 / 10 ;  // 2175
         int s2 = s1 * 10 ;  // 21750

         int s3 = (k1 / 10) * 10 ; // 21750
         int s4 = (21755 / 10 ) * 10 ;
	 System.out.println("s3 = " + s3);
	 System.out.println("s4 = " + s4);

         // �Ҽ��� ù°�ڸ����� ���ϱ� 
         double k2 = 24.6843 ;  // => 24.6    
         int s5 = (int)(k2 * 10) ;  // 246 ;      
         double s6 = s5 / 10.0 ;      //  24.6;

         double s7 = (int)(k2*10) / 10.0 ;
	 double s8 = (int)(24.6843*10) / 10.0 ;
 	 System.out.println("s7 = " + s7);
	 System.out.println("s8 = " + s8);

         // '%' ���� �������� ���Ѵ�.
         // '/' ����� int �̸� ��
         int su1 = 7 ;
         int su2 = 3 ;
         int res1 = 7 / 3 ;
         int res2 = 7 % 3 ;

         // ����� 2�� ���� �������� 1�� ������ Ȧ��
         // ����� 2�� ���� �������� 0�� ������ ¦��
         // ����� k�� ���� �������� 0�̸� k�� ���

  
 
	}
}







