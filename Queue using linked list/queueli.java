import java.util.Scanner;

class Node{
    int data;
    Node next;
    
    Node(int d){
        data = d;
        next = null;
    }
    public int getdata(){
        return data;
    }
    public void setdata(int d){
        data = d;
    }
    public Node getnext(){
        return next;
    }
    public void setnext(Node next){
        this.next = next;
    }
}
public class queueli {
    Node front;
    Node rear;
    int size;
    
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{return false;}
    }
    
    public void enqueue(int q){
        Node newNode = new Node(q);
        if(front == null){
            front = newNode;
            rear =  newNode;
            size++;
        }
        else{
            rear.setnext(newNode);
            rear = newNode;
            size++;
        }
    }
    public queueli(){
        front = null;
        rear = null;
        size = 0;
    }
    public Node dequeue(){
        Node del = null;
        if(front != null){
            if(front.next != null){
                del = new Node(front.getdata());
                front = front.getnext();
                size--;
            }
            else{
                del = new Node(front.getdata());
                front = null;
                rear = null;
                size--;            }
        }
        return del;
    }
    public Node peek(){
        Node qq = null;
        if(!isEmpty()){
            qq = new Node(front.getdata());
        }
        return qq;
    }
    public int qsize(){
        return size;
    }
    public static void main(String[] args){
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        queueli wq = new queueli();
        System.out.println("*********Queue operations using Linked List*********");  
        System.out.println("\n------------------------------------------------\n");  
        while(choice != 6)  
         {   
        System.out.println("Chose one from the below options...");  
        System.out.println("\n1.Enqueue\n2.Dequeue\n3.isEmpty\n4.peek\n5.size\n6.Exit");  
        System.out.println("Enter your choice:");        
        choice = sc.nextInt();
        
        switch(choice){
            case 1:
            {
            System.out.println("Enter value:");
            int q = sc.nextInt();
            wq.enqueue(q);
            break;
            }
            case 2:
            {
            Node y = wq.dequeue();
            System.out.println("Dequeue element :"+y.data);
            break;
            }
            case 3:
            {
            boolean ww  = wq.isEmpty();
            if(ww = false)
                System.out.println("Queue is Not Empty");
            }
            else{
                System.out.println("Queue is Empty");
            }
            break;
            }
            case 4:
            {
            Node pp = wq.peek();
            System.out.println("PEEK ELEMENT IS:"+pp.data);
            break;
            }
            case 5:
            {
            int y= wq.qsize();
            System.out.println("SIZE OF QUEUE IS:"+y);
            break;
            }
        };
    }
    }
}
