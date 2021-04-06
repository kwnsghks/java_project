package com.ict05.collection;

import java.awt.List;
import java.util.LinkedList;

public class Ex07 {

	public static void main(String[] args) {
		// Queue(큐) 인터페이스를 구현한 클래스 : LinkedList
		//           FIFO (Fist In First Out) : 먼저 들어온게 먼저 나감(선입선출)
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// 추가, 삽입 : add, addFirst, addLast, offerFirst, offerLast
		linkedList.add("박찬호");
		linkedList.offer("박세리");
		linkedList.add("김미현");
		
		System.out.println(linkedList);
		linkedList.addFirst("김광현");
		System.out.println(linkedList);
		linkedList.offerFirst("둘리");
		System.out.println(linkedList);
		// linkedList.addLast("2");
		// System.out.println(linkedList);
		// linkedList.offerLast("1");
		// System.out.println(linkedList);
		if(linkedList.contains("박세리"));{
			System.out.println(linkedList.indexOf("박세리") + "번째에 있다.");
			System.out.println(linkedList.get(linkedList.indexOf("박세리")));
			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getLast());
			
		}
		System.out.println(linkedList.size()+" 요소가 존재함");
		// 둘리를 이대호로 변경하자.
		if(linkedList.contains("둘리")) {
			linkedList.set(linkedList.indexOf("둘리"), "이대호");
		}else {
			System.out.println("없다.");
		}
		System.out.println(linkedList);

		// 삭제 : remove, removeFirst, removeLast
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		linkedList.removeLast();
		System.out.println(linkedList);
	
		System.out.println(linkedList.remove(1)+"님이 삭제 되었습니다.");
		System.out.println(linkedList);

		
	}
}
