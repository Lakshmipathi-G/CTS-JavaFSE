/*import java.util.Scanner;
public class solve
{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num = sc.nextInt();
if ((num & 1)==0){
System.out.println(num+"is a even" );
}
else
System.out.println(num+"is a odd" );
}
}

interface engine
{
    void start();
}

interface  wheels
{
    void rotate();
}

public class solve implements engine,wheels{
    public void start(){
        System.out.println("car engine starts");
    }
    public void rotate()
    {       
        System.out.println("car engine starts");
    }
    public static void main(String [] args){
        solve Engine = new engine();
        solve Wheels = new wheels();
    }
}

import java.util.ArrayList;

public class solve{

    public static void main (String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        for(i=1;i<=10;i++){
        list.add(i);
        }
        for(i=0;i<list.size();i++)
        {
            if(list.get(i)>7)
            {
                list.remove(i);
                i--;
            }
        }
        System.out.println("remaining"+list);
    }
} 
*/

import java.util.LinkedList;

class Node {
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
public class solve {  
    Node head;
    void addNode(int data){

    }
}

public class Main{
    public static void main(String[]args){
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        System.out.println("LinkedList");
        list.displayNodes();
        
    }
}