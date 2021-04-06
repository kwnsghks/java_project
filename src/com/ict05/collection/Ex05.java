package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;

public class Ex05 {
	// List 인터페이스를 구현한 클래스들 : Stack, ArrayList, Vector ;
	// Stack(스택) : LIFO ( Last In First Out) : 마지막에 들어온 데이터가 맨 처음 나감.(후입선출)
	// 주요 메소드
	// add, push, addElement => 추가
	// add(index, E) => 삽입  (끝에 들어간다 : 추가 , 처음이나 중간에 들어간다 : 삽입)
	// pop : 맨위에 존재하는 객체를 반환하고 삭제한다.
	// peek : 맨 위에 존재하는 객체를 반환하고 삭제하진 않음.(무한 루프 조심)
	// search : 검색(오른쪽, 1부터)
	// indexOf : 검색(왼쪽, 0부터) => 배열방식
	// elementAt(index) : 위치값을 받아서 해당 객체를 추출.
	// get(index) : 위치값을 받아서 해당 객체를 추출.
	// firstElement : 맨 처음 요소 추출
	// lastElement : 맨 마지막 요소 추출
	// setElement(Element, index) : 치환
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("둘리") ;
		stack.addElement("공실") ;
		stack.push("마이콜") ;
		System.out.println(stack) ;
		
		stack.add(1, "도우너") ; // 삽입 (중복 아님.)
		stack.add(0,  "또치") ;  // 삽입 (중복 아님.)
		stack.add(1,  "뿌끄") ;  // 삽입 (중복 아님.)
		stack.add(1, "둘리") ; // 중복  (중복 사용가능)
		System.out.println(stack);
		System.out.println("================");

		// 마지막에 들어온 객체 보기 pop(삭제 o), peek(삭제x => for문을 사용하면 무한루프)
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		// search : 검색(오른쪽, 1(끝)부터 카운트)
		// indexOf : 검색(왼쪽, 0부터 카운트) => 배열방식
		// elementAt(index) : 위치값을 받아서 해당 객체를 추출.
		// firstElement : 맨 처음 요소 추출
		// lastElement : 맨 마지막 요소 추출
		// contains, indexOf, search, get, elementAt, firstElement, lastElement
		if (stack.contains("둘리")) {
			System.out.println(stack.indexOf("둘리")+"번째 위치");   // 아래에서 위로 올라감, 왼→오(정순) [배열식]
			System.out.println(stack.search("둘리")+"번째 위치");   // 위에서 아래로 내려옴,오→왼(역순) [stack식]
			// ↓ 해당 위치의 객체 꺼내기
			System.out.println(stack.get(1));
			System.out.println(stack.indexOf("둘리"));
			System.out.println(stack.elementAt(stack.indexOf("둘리")));
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
		}else {
			System.out.println("존재하지 않음");
		}
		
		// size, set(치환), setElementAt(치환)
		System.out.println(stack.size() + "요소가 존재합니다.");
		// index가 3인
		// stack.setElementAt("마이콜",3) ;
		System.out.println(stack) ;
		
		// 하나씩 꺼내기 (개선된 for, iterator (데이터가 그대로 존재) , pop (데이터가 삭제)
		// 개선된 for문
		for (String k : stack) {
			System.out.println(k);
		}
		System.out.println(stack.size()+"요소가 존재함");
		
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String msg = (String) it.next();
			System.out.println(msg);
		}
		System.out.println(stack.size()+"요소가 존재함");
		
		while (! stack.isEmpty()) {
			String k = stack.pop();
			System.out.println(k+"삭제됨, 크기는" + stack.size());
		}
		System.out.println(stack) ;
	}
}



