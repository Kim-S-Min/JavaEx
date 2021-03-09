package com.javaex.collection.hash;


public class ClassRoom {
	private String subject;
	private String roomName;
	
	public ClassRoom(String subject, String roomName) {
		this.subject = subject;
		this.roomName = roomName;
		
		
	}
	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
		
		
	}
}
