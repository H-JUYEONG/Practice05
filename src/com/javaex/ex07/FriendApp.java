package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		Friend a = new Friend();
		Friend b = new Friend();
		Friend c = new Friend();

		friendArray[0] = a;
		friendArray[1] = b;
		friendArray[2] = c;

		// for문 시작
		// 친구정보 3명 입력 로직 --> 반복문 사용
		for (int i = 0; i < 3; i++) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			friendArray[i].setName(name);
			
			System.out.print("핸드폰: ");
			String hp = sc.nextLine();
			friendArray[i].setHp(hp);
			
			System.out.print("학교: ");
			String school = sc.nextLine();
			friendArray[i].setSchool(school);
			
			System.out.println("--------------------------");
		}

		// for문 끝

		// 친구정보 출력
		for (int i = 0; i < friendArray.length; i++) {
			// 친구정보 출력 메소드 호출
			friendArray[i].showInfo();
		}

		sc.close();
	}

}
