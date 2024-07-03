package com.javaex.ex01;

public class Member {

	// 필드
	private String name;
	private String id;
	private int point;

	// 생성자
	public Member(String name, String id, int point) {
		this.name = name;
		this.id = id;
		this.point = point;
	}

	// 메소드
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public void showInfo() {
		System.out.println("회원정보: " + name + "(" + id + "), " + point + "점");
	}
}
