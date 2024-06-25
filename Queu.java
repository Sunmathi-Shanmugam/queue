import java.util.*; 
class queue //array implementation
{
   int size;
   int arr[];
   int front;
   int rear;
   queue(int s)
   {
       size=s;
       front=0;
       rear=0;
       arr=new int[s];
   }
   
   boolean isempty()
   {
       return (front==0&&rear==0);
   }
   boolean isfull()
   {
       return rear==size;
   }
   
   void enqueue(int d)
   {
       if(isfull())
       {
           System.out.println("SORRY :(! Queue is full");
       }
       else
       {
           arr[rear]=d;
           rear++;
       }
       return;
   }
   
   int dequeue()
   {
       if(isempty())
       {
           System.out.println("SORRY :(! Queue is empty");
           return Integer.MIN_VALUE;
       }
       else
       {
           int d=arr[front];
           for(int i=0;i<rear-1;i++)
           {
           arr[i]=arr[i+1];
           }
           rear--;
           arr[rear]=0;
           return d;
       }
   }
   
   void display()
   {
       if(isempty())
       {
           System.out.println("SORRY :(! Queue is empty");
       } 
       else
       {
           for(int i=front;i<rear;i++)
           System.out.print(arr[i]+" ");
           System.out.println("\n");
       }
   }
}


public class Queu
{
   public static void main(String args[])
   {
       int v,p,c;
       System.out.println("########################\n# Welcome To The Queue #\n########################");
       queue q1=new queue(6);
       do{
          
           System.out.println("1.Enqueue");
           System.out.println("2.Dequeue");
           System.out.println("3.Display");
            System.out.println("4.Exit");
           System.out.println("Choose The Choice\n\n");
           Scanner sc=new Scanner(System.in);
           c=sc.nextInt();
           switch(c){
               case 1:
                  System.out.print("Enter the value to Enqueue");
                  v=sc.nextInt();
                  q1.enqueue(v);
               break;
               
               case 2:
                   
                  q1.dequeue();
               break;
                case 3:
                   
                  q1.display();
               break;
               case 0:
                   System.out.print("Thankyou :)! ");
                 
               break;
               default:
                 System.out.print("Enter valid choice ");
               
           }
       }while(c!=0);
      
   }
}