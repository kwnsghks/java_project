package com.ict01.grammar03;
class Ex09{
	public static void main(String[] args){
	// �ܼ� if�� : ���ǽ��� ���϶��� �����Ѵ�.
        //             �����϶��� if�� ����
        // ���� : if(���ǽ�){
        //         ���ǽ��� ���϶� ������ ���� ;
        //         ���ǽ��� ���϶� ������ ���� ;
        //        }
        //    ��, ������ ������ �� ���̸� { }(���) ���� ����
        
        int k1 = 90 ;
        String res = "���հ�" ;
        if(k1 >= 80){
            res ="�հ�";
        } 
        System.out.println("��� : " + res);
	
        // �� �� �� ū���� ����Ͻÿ� 
        int k2 = 10 ;
        int k3 = 15 ;
        int res2 = k3;
        if(k2 > k3) {
	    res2 = k2 ;	
        } 
	System.out.println("�� �� �� ū���� " +  res2 + " �̴�.");
	}
}