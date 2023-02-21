package javahigh05.ex10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>(); //큐는 인터페이스라서 '뉴 큐' 안됨 ㅇㅇ 링크드 리스트가 자식타입이라서 그거로 받음 ㅇㅇ
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "김자바"));
		messageQueue.offer(new Message("sendFacebook", "이지금"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			System.out.println(message.getTo()+"님에게"+ message.getCommand().substring(4)+"합니다.");
		}
		
		
	}

}
