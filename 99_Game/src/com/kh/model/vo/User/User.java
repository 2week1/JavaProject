package com.kh.model.vo.User;

public class User {

	private String nickName;
	private int score;
	public User(String string) {
		// TODO Auto-generated constructor stub
	}
	public User(String nickName, int score) {
		super();
		this.nickName = nickName;
		this.score = score;
	}
	@Override
	public String toString() {
		return "User [nickName=" + nickName + ", score=" + score + "]";
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	

}
