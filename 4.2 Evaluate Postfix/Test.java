
// Java proram to evaluate value of a postfix expression 
import java.util.Scanner;
import java.util.Stack; 
class Main1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		//String[] s1=s.split("");
		Test t=new Test();
		System.out.println(t.evaluatePostfix(s));;
	}
}
  
class Test  
{ 
    static int evaluatePostfix(String exp) 
    { 
    	String[] s1=exp.split(" ");
    	int l=s1.length;
        Stack<Integer> stack=new Stack<>(); 
        for(int i=0;i<l;i++) 
        { 
            char c=exp.charAt(i); 
            if(Character.isDigit(c)) 
            	stack.push(c - '0'); 
            else
            { 
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 
                  
                switch(c) 
                { 
                    case '+': 
                    stack.push(val2+val1); 
                    break; 
                      
                    case '-': 
                    stack.push(val2- val1); 
                    break; 
                      
                    case '/': 
                    stack.push(val2/val1); 
                    break; 
                      
                    case '*': 
                    stack.push(val2*val1); 
                    break; 
              } 
            } 
        } 
        return stack.pop();     
    } 
}