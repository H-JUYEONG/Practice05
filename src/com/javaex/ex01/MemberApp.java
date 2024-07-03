package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member actor = new Member("정우성", "jws", 50000);

		Member mc = new Member("유재석", "yjs", 30000);

		Member singer = new Member("이효리", "lhr", 40000);
		
		actor.showInfo();
		mc.showInfo();
		singer.showInfo();

	}

}
