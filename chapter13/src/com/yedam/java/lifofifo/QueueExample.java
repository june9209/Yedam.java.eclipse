package com.yedam.java.lifofifo;


import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
	
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두깨"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command){
			case "sendMail":
				System.out.println("ㄹㅇ");
				break;
			case "sendSMS":
				System.out.println("ㅋㅋ");
			 	break;
			case "sendKakaotalk":
				System.out.println("ㅋㅌ");
				break;
			}
		}
	
	}
	
	
}
