import java.util.Scanner;

public class Queue {
    static int f = 0;
    static int r = 0;
    static int c = 10;
    static int q[] = new int[c];
    
    static void enqueue(int d){
        if(c == r){
            System.out.println("Queue is full");
        }
        else{
            q[r] = d;
            r++;
        }
    }
    
    static void dequeue(){
        if(c == f){
            System.out.println("Queue is full");
        }
        else{
            for(int i=0; i<r-1; i++){
                q[i] = q[i+1];
            }
            if(r < c){
                q[r] = 0;
            }
            r--;
        }
    }
    
    static void display(){
        if(f == c){
            System.out.println("Queue is Empty");
        }
        else{
            for(int i = 0; i <= r; i++)
            {
                System.out.println(q[i]+" ");
            }
        }
    }
    
    static void front(){
        if(f == c){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(q[f]);
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("*********Queue operations using array*********\n");  
        System.out.println("\n------------------------------------------------\n");  
        int choice = 0;
        while(choice != 5)  
         {   
        System.out.println("\nChose one from the below options...\n");  
        System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.front\n5.Exit");  
        System.out.println("\n Enter your choice \n");        
        choice = sc.nextInt();  
        switch(choice){
            case 1:
            {
                System.out.println("Enter value to insert:");
                int data = sc.nextInt();
                enqueue(data);
                break;
            }
            case 2:
            {
                dequeue();
                System.out.println("Value deleted from rear");
                break;
            }
            case 3:
            {
                System.out.println("Queue is:");
                display();
                break;
            }
            case 4:
            {
                System.out.println("Value at the front of the queue:");
                front();
                break;
            }
            
        }
        }
    }
}