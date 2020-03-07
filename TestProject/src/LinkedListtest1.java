import java.util.LinkedList;


public class LinkedListtest1 {
	
	public static void main(String[] args){
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("s");
		list1.add("u");
		list1.add("r");
		list1.add("e");
		list1.add("k");
		list1.add("h");
		list1.add("a");
		System.out.println("Linked list:"+list1);
		list1.remove("k");
		System.out.println("Linked list:"+list1);
		list1.removeFirst();
		System.out.println("Linked list:"+list1);
		list1.removeLast();
		System.out.println("Linked list:"+list1);
		list1.set(2, "test");
		System.out.println("Linked list:"+list1);
		Object ele=list1.get(2);
		System.out.println("Linked list:"+ele);
	}

}
