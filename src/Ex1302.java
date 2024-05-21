import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex1302 {

	public static void main(String[] args) {
		HashSet<String> cats1 = new HashSet<String>();
		
		cats1.add("샴");
		cats1.add("페르시안");
		cats1.add("러시안 블루");
		
		System.out.println(cats1);
		System.out.println("HashSet iter :  ");
		for (String cat : cats1) {
			System.out.println(cat + " ");
		}
		
		cats1.remove("페르시안");
		
		System.out.println("\nArray 요소 :  ");
		Iterator<String> iter = cats1.iterator(); 
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// 배열 사본 만들기
		String[] array = new String[cats1.size()];
		cats1.toArray(array);
				
		System.out.println("\nArray 요소 :  ");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
		//treeSet
		TreeSet<String> cats2 = new TreeSet<String>();
		
		cats2.add("샴");
		cats2.add("페르시안");
		cats2.add("러시안 블루");
		
		System.out.println("\n\nTreeSet -------------");
		System.out.println(cats2);
		System.out.println(cats2.size());
		System.out.println(cats2.contains("샴"));
		System.out.println(cats2.first());
		System.out.println(cats2.last());
				
	}

}
