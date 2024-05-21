import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ex1301 {

	public static void main(String[] args) {
		ArrayList<String> cats1 = new ArrayList<String>();
		
		//cats1
		System.out.println("cats1 ------------");
		
		// 추가
		cats1.add("샴");
		cats1.add("null");
		cats1.add(1, "페르시안");
		System.out.println(cats1);
		
		//수정
		cats1.set(2, "러시안 블루");
		System.out.println(cats1);
		
		//검색
		System.out.println(cats1.contains("샴"));
		System.out.println(cats1.indexOf("샴"));
		
		//삭제
		cats1.remove("샴");
		cats1.remove(0);
		
		//출력
		System.out.println(cats1.get(0));
		System.out.println(cats1.size());
		
		//================================
		LinkedList<String> cats2 = new LinkedList<String>();
		
		
		//cats2 ========================
		System.out.println("\ncats2 --------------");
		
		// 추가
		cats2.add("샴");
		cats2.add("null");
		cats2.addLast("페르시안");
		cats2.add(2, "태비");
		System.out.println(cats2);
		
		//수정
		cats2.set(2, "러시안 블루");
		System.out.println(cats2);
		
		//검색
		System.out.println(cats2.contains("샴"));
		System.out.println(cats2.indexOf("샴"));
		
		//삭제
		cats2.remove("샴");
		cats2.remove(0);
		cats2.removeLast();
		
		//출력
		System.out.println(cats2.get(0));
		System.out.println(cats2.size());
		
		//vector================
		Vector<String> cats3 = new Vector<String>();
		
		
		//cats3 ========================
				System.out.println("\ncats3 --------------");
				
				// 추가
				cats3.add("샴");
				cats3.add(null);
				cats3.add(2, "태비");
				System.out.println(cats3);
				
				//수정
				cats3.set(1, "러시안 블루");
				System.out.println(cats3);
				
				//검색
				System.out.println(cats3.contains("샴"));
				System.out.println(cats3.indexOf("샴"));
				
				//삭제
				cats3.remove("샴");
				cats3.remove(0);
				
				//출력
				System.out.println(cats3.get(0));
				System.out.println(cats3.size());

	}

}
