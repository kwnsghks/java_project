package com.ict03.class01;

public class Ex01 {
	// 클래스
	// 정의 : 객체(오브젝트, 인스턴스화)를 만들기 위한 모든 정보를 가지고 
	//        있는 것(설계도면, 거푸집등으로 표현한다.)
	//        파일 형태로 되어 있으면 
	//        ** 클래스를 객체로 만들어야만 사용 가능하다.
	
	// 클래스가 가지고 있는 것들 : 데이터(상태값, 속성, 정보), 기능(동작), 생성자 
	// - 데이터(상태값,속성) = 변수와 상수  => 멤버필드
	// - 기능(동작,작동) = 메소드           => 멤버메소드
	// - 생성자 = 클래스를 객체로 만들때 호출된다. 
	//   생성자는 클래스이름과 같다. 클래스이름이 저장이름이다.
	//   생성자 클래스이름()
	//   생성자의 목적은멤버필드(데이터)의 초기화
	
	// 클래스의 구조 : 헤더, 멤버필드, 멤버메소드, 생성자
	// 1. 헤더 : [접근제한자] [클래스종류] class 클래스이름
	//   - 접근제한자 : 외부에서 접근할 수 있는 권한을 말한다.
	//                  클래스, 멤버필드, 멤버메소드, 생성자 모두 맨 앞에 표시할 수 있다.(생략가능)
	//     1) public    : 누구나 다 접근 가능
	//     2) protected : 같은 패키지와 상속관계에서는 접근 가능
	//     3) 생략      : 같은 패키지에서는 접근 가능
	//     4) private   : 외부에서는 무조건 접근 불가
	//                    내부멤버(필드,메소드)끼리만 접근 가능
	//  - 클래스 종류 : 일반적인 클래스들은 이 부분을 생략
	//                  특정 클래스는 해당 예약어를 사용 (final, abstract)
	//  - class : 클래스임을 나타내는 예약어
	//  - 클래스이름 : 클래스이름 = 저장이름 = 생성자
	//                 첫글자 대문자 나머지 소문자, 
	//                 두단어 이상일때 단어들의 첫글자는 대문자
	//                 특수문자 사용불가, 숫자는 중간이나 끝에 사용가능
	//                 예) JavaTest01,  Button01Test
	
	// 2. 멤버필드(변수와 상수) : 상태값, 데이터, 속성, 특징
	//  - 변수 : 언제든지 변할 수 있는 데이터를 저장하는 공간
	//           첫글자 소문자, 두 단어 이상일때 단어들의 첫글자는 대문자
	//           특수문자 사용불가, 숫자는 중간이나 끝에 사용가능
	//           예) javaTest01, button01Test; 
	//  - 상수 : 한 번 지정하면 변경할 수 없는 데이터를 저장하는 공간
	//           모든 글자가 대문자, 단어와 단어 사이에 _(어더스코어)를 사용할 수 있다.
	//           예) JAVA_TEST_01, BUTTON_01_TEST
	
	// 3. 멤버메소드 : 동작, 기능, 작동하는 것
	//                 메소드이름 뒤에 무족건'()'가 존재한다.
	//                 ** 해당 메소드를 호출하면 해당 메소드가 실행된다.
	//                 ** 실행이 끝난 메소드는 자기를 호출한 곳으로 되돌아 간다.
	//                    main() 는 JVM이호출한다.(main()가 끝나면 JVM으로 되돌아 간다.)
	//                    JVM으로 되돌아 가면 프로그램은 종료 된다.
	//   - 메소드 구성 : [접근제한자] [메소드종류] 반환형 메소드이름([인자=매개변수]){ 실행내용; }
	//     1) 접근제한자 : 클래스 접근제한자와 같다.
	//                     public > protected > 생략 > private
	//     2) 메소드종류 : instance 메소드와 static 메소드로 나눠진다.
	//                     instance 메소드가 일반메소드로 이 부분을 생략한다.
	//                     static 메소드는 반드시 static 예약어를 사용해서 표시해준다.
	//  ** 3) 반환형 : 메소드는 자기를 호출한 곳으로 되돌아 간다. 
	//                 이 때 실행한 결과를 가지고 갈 때의 자료형을 반환형이라고 한다.
	//                 만약에 실행한 결과를 가지고 가지 않때는 반환형에 void라고 쓴다.
	//                 예) public static void main(String[] args){}
	//                 누구나 다 접근할수 있고, static 메소드이며, 
	//                 되돌아갈때 무언가를 가지고 가지않는다.
	//     4) 인자 = 매개변수 : 메소드가 동작을 할때 필요한 정보를 외부에서 받아서 
	//                          사용할 때 인자가 필요한다.
	//        오버로딩 : 같은 클래스 안에서 메소드이름은 같고, 
	//                   인자의 갯수나 인자의 자료형이 다른 메소드를 말한다.
	//
	//     5) getter() / setter()
	//        getter() : 호출하는 입장에서 메소드를 이용해서 멤버 필드의 데이터을 얻어낼 수 있다.
	//        setter() : 호출하는 입장에서 메소드를 이용해서 멤버 필드의 데이터를 설정할 수 있다.
	
	// 4. 생성자 : 클래스를 객체로 만들때 한번 호출되는 것
	//     - 목적 : 멤버필드(변수와 상수)의 초기값을 지정하는 것이 목적이다.
	//     - 형식 : 클래스이름과 생성자는 같다.(클래스이름())
	//              반환형이 없는 메소드와 같다.
	//     - 클래스를 객체를 만드는 방법
	//       Scanner     scan     =   new             Scanner(System.in);
	//       클래스    참조변수   =   객체 생성하자      생성자 ;
	//       참조변수를 이용해서 객체가 가지고 있는 멤버필드나 멤버메소드를 사용할 수 있다.
	//       객체를 만들기 위해서는 생성자를 호출해야 하지만 
	//       반드시 해당 클래스가 가지고 있는 생성자만 호출이 가능하다.
	//     - 모든 클래스는 반드시 생성자를 가지고 있다.(인터페이스는 제외)
	//       생성자가 보이지 않는 클래스는 기본생성자로 객체를 생성하게 된다.
	//       기본생성자란 인자가 없는 생성자를 말한다.(예) '클래스이름()' 
	//     - 만들어진 객체 안에 존재하는 멤버필드나 멤버메소드를 사용하는 방법
	//       참조변수.멤버필드,   참조변수.멤버메소드
	//       예) Scanner scan = new Scanner(System.in);
	//          이때 scan는 참조변수이다. 
	//          scan.next(),  scan.nextInt();
	//     - 생성자도 오버로딩이 가능하다.
	//       즉 하나의 클래스 안에 여러 개의 생성자가 존재할 수 있다.
	
	//  멤버메소드와 멤버 필드는 크게 두 가지 종류가 있다.
	//  instance 메소드, instance 필드,  static 메소드 , static 필드 
	//  ** 클래스에는 일반적으로 static를 사용할 수 없다.(내부클래스는 예외)
	//  - instance : 일반적인 메소드나 필드를 말한다.
	//              ** 객체가 생성될때 같이 생성되는 메소드나 필드를 말한다.
	//    호출방법 : 객체를 만들때 참조변수를 사용하는 데 
	//               참조변수.메소드, 참조변수.필드
	
	//  - static : static이 붙어있는 메소드나 필드를 말한다.
	//              ** 객체 생성과 상관없이 미리 만들어진 메소드나 필드를 말한다.
	//    호출방법 : 클래스이름.메소드, 클래스이름.필드
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
