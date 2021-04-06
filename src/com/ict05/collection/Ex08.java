package com.ict05.collection;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		// Map 인터페이스 : Key와 Value를 매핑하는 구조로 이루어짐. Key는 중복될 수 없다.
		//                  key는 중복될 수 없다. (value는 중복되면 덮어쓰기 된다.)
		//                  value는 중복 가능.
		//                  key를 호출하면 value가 나온다. 
		//                  key를 set 컬렉션에 별도로 관리 => keySet()
		
		// 주요메소드
		// add()로 추가, 삽입 안됨.
		// 삽입 : put(K key, V value) : 추가, 삽입
		// - keySet() : key를 set에서 관리
		// - key를 set에서 관리 : keySet(); 
		// - containsKey(Object key) : boolean
		// 인자로 받은 key가 존재하면 true, 아니면 false
		// - containsValue(Object value) : boolean
		// 인자로 받은 value가 존재하면 true, 아니면 false
		// - get(Object key) : 키를 받아서 value를 리턴한다.
		// - remove(Object key) : 키를 받아서 삭제
		// - replace(K key, V value) : 치환하기
		
		// 1. key를 순서있는 숫자로 만들면 for문 사용 가능. (순서있는 숫자가 아니면 for문 못씀.)
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "한국");
		map1.put(2, "미국");
		map1.put(3, "중국");
		map1.put(4, "영국");
		map1.put(5, "태국");
		System.out.println(map1);   // {} 로 나온 이유 : 배열이 아니기 때문, 배열이면 []
		
		map1.put(3, "일본"); // key가 중복(덮어쓰기)
		System.out.println(map1);
		
		map1.put(6, "한국"); // value가 중복(상관없다.)
		System.out.println(map1);
		

		// 하나씩 추출(get(key))
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		System.out.println(map1.get(4));
		System.out.println(map1.get(5));
		System.out.println("---------");
		for (int i = 1; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		
		// 개선된 for 문 사용하려면 => keySet() 사용
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		System.out.println("==========");
		// iterator를 사용하려면 → keySet()을 사용
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			int s1 = (int) it.next();
			System.out.println(map1.get(s1));
		}
		
		// 2. key를 문자로 만들면 출력시 keySet()을 사용해야 된다.
		HashMap<String , String> map2 = new HashMap<String, String>();
		map2.put("이름", " 고길동");
		map2.put("나이", " 34");
		map2.put("주소", " 도봉구");
		map2.put("성별", " 남");
		map2.put("취미", " 잠자기");
		System.out.println(map2);
		
		System.out.println(map2.get("이름"));
		System.out.println(map2.get("나이"));
		System.out.println(map2.get("주소"));
		System.out.println(map2.get("성별"));
		System.out.println(map2.get("취미"));
		
		System.out.println();
		
		// 개선된 for문 
		for (String k : map2.keySet()) {
			System.out.println(map2.get(k));
		}
		System.out.println();
		
		// Iterator
		Iterator<String> it2 = map2.keySet().iterator();
		while (it2.hasNext()) {
			String k = (String) it2.next();
			System.out.println(map2.get(k));
		}
		
	}
}
