package com.ict05.collection;

public class Ex01 {
	// ���״а� �÷��� (�ڷᱸ��)
	// ���״� : �÷����� � ��ü��� �̷���������� ǥ���ϴ� ��ü Ÿ���� ���Ѵ�.
	// �÷��� : ��ü���� ��Ƽ� �����ϴ� �������̽��� ������ ��
	// API    :  <T> => ��ü Ÿ��,  <E> => ���(�÷��� �ȿ� �����ϴ� ��ü �ϳ��� ���Ѵ�.)
	//           Map ���Ŀ����� <K, V> => Key(Ű), Value(��)
	//           Key�� Value�� 1:1 ����, Key�� ȣ���ϸ� Value�� ���´�.
	// ���� :  �÷���<���״�>
	// �ֻ��� �÷����� Collection<E>, Map<K,V>
	// Collection<E>�� ��ӹ��� �������̽� : Set<E>, List<E>, Queue<E>
	
	// Collection�� �ֿ� �޼ҵ� 
	// add(E e) : boolean => �ش� �÷��ǿ� ��ü �߰�, �����ϸ� true, �����ϸ� false
	// addAll(Collection<? extends E> c) : boolean
	//      => Ư���÷��ǿ� �ִ� ��� ��ҵ��� �ٸ� �÷��ǿ� �߰�            
	// clear() : void  => ��� ��� ����
	// contains(Object o) : boolean => �ش� �÷��ǿ� ���ڷ� ���� ��ü�� �����ϸ� true, �ƴϸ� false
	// containsAll(Collection<?> c) : boolean
	//       => �� �÷��ǿ� ������ �÷����� ��� ��Ұ� ���Ե� ��� true
	// equals(Object o) : boolean => ������ ��ü���� �÷����� ������ ��
	// isEmpty() : boolean => �ش� �÷����� ��������� true
	// iterator() : Iterator<E>
	//    => �÷��Ǿȿ� �����ϴ� ��ҵ��� ������� �����ϱ� ���� Iterator ��ü�� ��ȯ
	//    => �÷��Ǿȿ� �����ϴ� ��ҵ��� �ϳ��� ������ �۾��Ҷ� ����Ѵ�.
	// remove(Object o) : boolean => ���ڷ� ���� ��ü�� �����Ҷ� ���, �����ϸ� true
	// size() : int => �÷��Ǿȿ� �����ϴ� ��ҵ��� �� (for���� ��밡��)
	// toArray() : Object[] => �÷����� �迭�� �����.
}