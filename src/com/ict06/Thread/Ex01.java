package com.ict06.Thread;

public class Ex01 {
	public static void main(String[] args) {
		// Thread �깮�꽦�옄
		// - Thread() : 湲곕낯�깮�꽦�옄
		// - Thread(Runnable target) : Runnable �씤�꽣�럹�씠�뒪瑜� �씤�옄濡� 諛쏆븘�꽌 泥섎━
		//                            �씡紐� �궡遺��겢�옒�뒪瑜� �궗�슜�븷 �닔 �엳�떎.
		// - Thread(Runnable target, String name) : �씠 �븣 name�� �뒪�젅�뱶 �씠由꾩쓣 吏��젙�븷 �닔 �엳�떎.
		// - Thread(String name) : �씠 �븣 name�� �뒪�젅�뱶 �씠由꾩쓣 吏��젙�븷 �닔 �엳�떎.
		
		// 二쇱슂 硫붿냼�뱶
		// - join() : �쁽�옱 �뒪�젅�뱶�뒗 join() 硫붿냼�뱶瑜� �샇異쒗븳 �뒪�젅�뱶媛� �걹�궇 �븣源뚯� 
		//            ��湲곗긽�깭濡� 鍮좎졇�엳�떎媛� join()瑜� �샇異쒗븳 �뒪�젅�뱶媛� �걹�굹�빞 �떎�떆 �떎�뻾�븳�떎.
		//            利�, join()瑜� �샇異쒗븳 �뒪�젅�뱶媛� �걹�궇 �븣源뚯� �떎�뻾�븷 �닔 �뾾�떎.
		// - start() : start()瑜� �떎�뻾�븯硫� run()瑜� �샇異쒗븳�떎.(留뚯빟�뿉 start()媛� �엳�쑝硫� start()濡� 媛꾨떎.)
		// - run()   : start()媛� �샇異쒗빐�꽌 run()媛� �떎�뻾�릺硫� �씠 �븣 �뒪�젅�뱶 泥섎━瑜� �뻽�떎怨� �븳�떎.
		// start -> start濡� �떎�뻾�떆�궓 寃껋쓣 �뒪�젅�뱶泥섎━x, 洹몃깷 硫붿냼�뱶 �떎�뻾.
		// - sleep(long millis) : 1000�씠 1珥덈�� �쓽誘명븯怨�, �옞�떆 ��湲곗긽�깭濡� 鍮좎졇�엳�뒗 �긽�깭瑜� 留먰븿.
		// - yield() : �떎�뻾以묒씤 �뒪�젅�뱶 以� �슦�꽑�닚�쐞媛� 媛숈� �떎瑜� �뒪�젅�뱶�뿉寃� �젣�뼱沅뚯쓣 �꽆湲대떎.
		// - getName() : �뒪�젅�뱶 �씠由� 援ы븯湲�
		// - setName(String Name) : �뒪�젅�뱶 �씠由� 吏��젙 �꽕�젙(Thread String name�씠 �씠誘� �엳�떎硫� �븘�슂 �뾾�쓬.)
		// - currentThread() : �쁽�옱 �닔�뻾�릺�뒗 �뒪�젅�뱶 媛앹껜瑜� 由ы꽩�븳�떎.(static)
		
		// �븵�뿉�꽌 留뚮뱺 紐⑤뱺 泥섎━�뒗 main �뒪�젅�뱶媛� �샎�옄�꽌 �떎 泥섎━�뻽�떎.
		// �씠�윭�븳 寃껋쓣 �떛湲� �뒪�젅�뱶�씪怨� �븳�떎.
		// �뒪�젅�뱶瑜� �씪泥섎━�븯�뒗 �씪袁쇱씠�씪怨� �깮媛곹븯湲�.
		
		// �겢�옒�뒪�씠由�.�옖�뜡, �겢�옒�뒪�씠由�.�뒪�젅�뱶  ==> static�씠 �옄�룞�쑝濡� �샇異쒕맖.
		// JVM�씠 main 硫붿냼�뱶瑜� �샇異쒗븯硫� 臾댁“嫄� main�뒪�젅�뱶媛� �씪泥섎━瑜� �븳�떎.
		System.out.println(Thread.currentThread());
		
		Ex02 test = new Ex02();
		System.out.println("1"+Thread.currentThread());
		test.add(5, 8);
		System.out.println("4"+Thread.currentThread());
		
		int result = test.sub(8, 5);
		System.out.println("7"+Thread.currentThread());
		System.out.println(result);
		System.out.println();
	}
}
