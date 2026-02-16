package Collections;
import java.util.*;

public class main {
	
	static void printList(LinkedList<String> l) { 
		 Iterator<String> iterator = l.iterator(); 
		 while (iterator.hasNext()) { 
			 String e = iterator.next(); 
			 String separator;
			 if (iterator.hasNext())
				 separator = "->"; 
			 else
				 separator = "\n"; 
			 System.out.print(e+separator);
		 }
	 }

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		myList.add("터미네이터");
		
		Collections.sort(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "터미네이터") + 1; 
		System.out.println("터미네이터는 " + index + "번째 요소입니다.");
		
		Collections.reverse(myList);
		printList(myList);
		
		index = Collections.binarySearch(myList, "터미네이터") + 1; 
		System.out.println("터미네이터는 " + index + "번째 요소입니다.");
		
		
		
	}

}
