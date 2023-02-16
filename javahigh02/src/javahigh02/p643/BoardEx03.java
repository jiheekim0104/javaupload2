package javahigh02.p643;

import java.util.ArrayList;
import java.util.List;



public class BoardEx03 {

	public static void main(String[] args) {
		List<Board> lists = new ArrayList<Board>();
		lists.add(new Board("¿À´Ã ±İ¿äÀÏÀÌ´Ù!!","³»ÀÏÀº ÁÖ¸»ÀÌÀİ¾Æ?", "±èÁöÈñ", "2023-02-10"));
		lists.add(new Board("ºñ¿À³ª?","¿ì»ê¾ø´Âµ¥..", "°õÁã", "2023-02-10"));
		lists.add(new Board("¼ö¿äÀÏ ÇÁ·ÎÁ§Æ®·¡!!","ÇæÄû ¤·¤µ¤· !!", "ÄÚ°õÁã", "2023-02-06"));
		
		for(Board list: lists) {
			System.out.printf("%15s|%10s|%3s|%10s\n",list.getSubject(),list.getContent(),list.getWriter(),list.getJoinDate());
		}
		
		int findIndex=-1;
		for(int i=0;i<lists.size();i++) {
			if(lists.get(i).getSubject().equals("ºñ¿À³ª?")) {
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
