package javahigh02.p643;

import java.util.ArrayList;
import java.util.List;



public class BoardEx03 {

	public static void main(String[] args) {
		List<Board> lists = new ArrayList<Board>();
		lists.add(new Board("���� �ݿ����̴�!!","������ �ָ����ݾ�?", "������", "2023-02-10"));
		lists.add(new Board("�����?","�����µ�..", "����", "2023-02-10"));
		lists.add(new Board("������ ������Ʈ��!!","���� ������ !!", "�ڰ���", "2023-02-06"));
		
		for(Board list: lists) {
			System.out.printf("%15s|%10s|%3s|%10s\n",list.getSubject(),list.getContent(),list.getWriter(),list.getJoinDate());
		}
		
		int findIndex=-1;
		for(int i=0;i<lists.size();i++) {
			if(lists.get(i).getSubject().equals("�����?")) {
				findIndex = i;
			}
		}
		System.out.println(lists.get(findIndex).getWriter()+lists.get(findIndex).getJoinDate());
	
		
		for(int i=0;i<lists.size();i++) {
			if(lists.get(i).getJoinDate().equals("2023-02-10")) {
				System.out.println(lists.get(i).getSubject()+lists.get(i).getContent());
			}
		}
		
		
		
		
		
		
		}
		
		

	}
