

import java.util.Scanner;

class Dequeue
{
	int size;
	Node front,rear;
	class Node
	{
		String data;
		Node next;
		Node(String d,Node link)
		{
			data = d;
			next = link;
		}
	}
	Dequeue()
	{
		size=0;
		front=null;
		rear=null;
	}
	void pushLeft(String s)
	{
		if(front == null)
		{
			front=new Node(s,null);
			rear=front;
		}
		else
		{
			Node n=new Node(s,front);
			front=n;
		}
		size++;
	}
	void pushRight(String s)
	{
		if(rear ==  null)
		{
			rear=new Node(s,null);
			front=rear;
		}
		else
		{
			Node n=new Node(s,null);
			rear.next=n;
			rear=n;
		}
		size++;
	}
	void popLeft()
	{
		if(front != null)
		{
			Node pn=front;
			front=front.next;
			pn.data=null;
			pn.next=null;
			size--;
		}
	}
	void popRight()
	{
		if(rear != null)
		{
			Node temp=null;
			Node pn=rear;
			Node x=front;
			while(x!=rear)
			{
				temp=x;
				x=x.next;
			}
			rear=temp;
			rear.next=null;
			pn.data=null;
			pn.next=null;
			size--;
		}
	}
	int size()
	{
		return size;
	}
	boolean isEmty()
	{
		return front==null;
	}
	String display()
	{
		if (size!=0) 
        {
            String s1= "";
            Node temp=front;
            while (temp!=null) 
            {
                s1+=temp.data + ", ";
                temp=temp.next;
            }
            return "[" +s1.substring(0,s1.length()-2)+ "]";
        }
        return "[]";

    }
}
class Solution
{
	 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Dequeue d=new Dequeue();
        for(int i=0;i<n;i++)
        {
            String input[] = sc.nextLine().split(" ");
            switch (input[0]) 
            {
	            case "pushLeft":
	                d.pushLeft(input[1]);
	                System.out.println(d.display());
	                break;
	            case "pushRight":
	                d.pushRight(input[1]);
	                System.out.println(d.display());
	                break;
	            case "popLeft":
	                if(!d.isEmty()) 
	                {
	                    d.popLeft();
	                    System.out.println(d.display());
	                } 
	                else 
	                {
	                    System.out.println("Deck is empty");
	                }
	                break;
	            case "popRight":
	                if (!d.isEmty())
	                {
	                    d.popRight();
	                    System.out.println(d.display());
	                } 
	                else
	                {
	                    System.out.println("Deck is empty");
	                }
	                break;
	            case "size":
	                System.out.println(d.size());
	                break;
	            case "isEmpty":
	                System.out.println(d.isEmty());
	                break;
	            default:
	                break;

            }
        }
    }
}
