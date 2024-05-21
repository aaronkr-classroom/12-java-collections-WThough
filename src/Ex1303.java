import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Iterator;
public class Ex1303 {

	public static void main(String[] args) {
		HashMap<Integer, String> str = new HashMap<Integer, String>();
		
		str.put(1, "A");
		str.put(3, "B");
		str.put(10, "C");
		str.put(500, "0");
		System.out.println(str);
		
		//키
		System.out.print("\nKeys: ");
		for(Integer key : str.keySet()) {
			System.out.print(key + ", ");
		}
		
		//값
				System.out.print("\nValues: ");
				for(Integer value : str.keySet()) {
					System.out.print(value + ", ");
				}
	
		//키=값 쌍
				System.out.print("\nKeys=\nValues: ");
				for(Entry<Integer, String> entry : str.entrySet()) {
					System.out.print(entry + ", ");

	}
				
				//TreeMap ===============
				TreeMap<String, String> animals = new TreeMap<String, String>();
				
				System.out.println("\n\nTreeMap ==============");
				
				animals.put("cat", "페르시안");
				animals.put("dog", "테리어");
				animals.put("fish", "고등어");
				animals.put("zoo", "기린");
				System.out.println(animals);
				
				animals.replace("zoo", "고릴라");
				System.out.println(animals);
				
				animals.remove("dog");
				System.out.println(animals);
				
				System.out.println(animals.size());
				System.out.println(animals.get("zoo"));
				
				System.out.print("(Key, Value) = ");
				Iterator<String> Keys = animals.keySet().iterator();
				
				while(Keys.hasNext()) {
					String key = Keys.next();
					System.out.print(" (" + key + ", " + animals.get(key) + ") ");
				}
				

	}
}
