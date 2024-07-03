package com.javaex.ex10;

public class Book {

	// 필드
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	// 생성자
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	// 메소드
	public void rent() {
		this.stateCode = 0;
		System.out.println(this.title + "이(가) 대여 됐습니다.");
	}

	public void print() {
		if (this.stateCode == 1) {
			System.out.println(this.bookNo + " 책 제목:" + this.title + ", 작가:" + this.author + ", 대여유무: 재고있음");
		} else {
			System.out.println(this.bookNo + " 책 제목:" + this.title + ", 작가:" + this.author + ", 대여유무: 대여중");
		}
		System.out.println();
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public int getStateCode() {
		return stateCode;
	}

}
