package javahigh05.ex10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>(); //ť�� �������̽��� '�� ť' �ȵ� ���� ��ũ�� ����Ʈ�� �ڽ�Ÿ���̶� �װŷ� ���� ����
		
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�ſ��"));
		messageQueue.offer(new Message("sendKakaotalk", "���ڹ�"));
		messageQueue.offer(new Message("sendFacebook", "������"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			System.out.println(message.getTo()+"�Կ���"+ message.getCommand().substring(4)+"�մϴ�.");
		}
		
		
	}

}
