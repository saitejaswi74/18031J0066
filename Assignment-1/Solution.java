import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
    	
	LinkedList<String> lt=new LinkedList<>();
	lt.add(number);
    Iterator<String> itr=lt.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    }
    AddLargeNumbers.digitsToNumber(lt);
    	return lt;

    }

    public static String digitsToNumber(LinkedList list) {
    	String s="";
    	for(int i=0;i<list.size();i++) {
    		 s=(String) list.removeLast();
    	}
		return s;

    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	LinkedList<Stack> list3=new LinkedList<>();
    	 list3.addAll(list1);
    	 list3.addAll(list2);
    	 return list3;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.next();
        String q = sc.next();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                LinkedList pDigit = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigit = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigit, qDigit);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}

