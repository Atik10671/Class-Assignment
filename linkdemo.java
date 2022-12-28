package linkedlist;
import java.util.LinkedList;
import java.util.Iterator;
public class linkdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> lList=new LinkedList<String>();
		lList.add("apple");
		lList.add("kiwi");
		lList.add("papaya");
		lList.add("mango");
		lList.add("watermelon");
		lList.add("grapes");
		
		System.out.println(lList);
		lList.add("watermelon");
		lList.add("grapes");
		lList.add("banana");
		lList.add(8,"orange");
		System.out.println(lList);
		
		System.out.println("traverse linledlist using iterator");
		Iterator itr=lList.iterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
		String removed=lList.removeFirst();
		System.out.println("removed element"+removed);
		System.out.println(lList);
		
		String last=lList.removeLast();
		System.out.println("remove element"+last);
		System.out.println(lList);
		
		lList.remove(1);
		lList.remove("orange");
		System.out.println(lList);
		

	}

}
