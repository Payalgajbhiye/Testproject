package Ips;
import java.util.Stack;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Dishwah {
	protected int arr[];
    protected int top, size, len;
	   
	   
	   public Dishwah(int n) {
		   size = n;
	        len = 0;
	        arr = new int[size];
	        top = -1;
	   }
	   public boolean isEmpty()
	    {
	        return top == -1;
	    }
	    
	    public boolean isFull()
	    {
	        return top == size -1 ;        
	    }
	    
	    public int getSize()
	    {
	        return len ;
	    }
	    public int peek()
	    {
	        if( isEmpty() )
	            throw new NoSuchElementException("Underflow Exception");
	        return arr[top];
	    }
	   
	    public void push(int i)
	    {
	        if(top + 1 >= size)
	            throw new IndexOutOfBoundsException("Overflow Exception");
	        if(top + 1 < size )
	            arr[++top] = i;
	        len++ ;
	    }
	    public int pop()
	    {
	        if( isEmpty() )
	            throw new NoSuchElementException("Underflow Exception");
	        len-- ;
	        return arr[top--]; 
	    }    
	    /*  Function to display the status of the stack */
	    public void display()
	    {
	        System.out.print("\nStack = ");
	        if (len == 0)
	        {
	            System.out.print("Empty\n");
	            return ;
	        }
	        for (int i = top; i >= 0; i--)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }    
	
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);        
        System.out.println("Current status of washed plates on pile\n");
        System.out.println("Enter total number of plates ");
        int n = scan.nextInt();
        Dishwah plates = new Dishwah(n);
        char ch;
        do{
            System.out.println("\nStack Operations");
            System.out.println("1. enter the total plates wash by Bob");
            System.out.println("2. taken plates from Customers");
            System.out.println("3. current state of of pile");
            System.out.println("4. check  if pile is empty");
            System.out.println("5. check pile is full");
            System.out.println("6. total count of plates on pile");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter total number of plates");
                try 
                {
                   plates.push( scan.nextInt() );
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }                         
                break;                         
            case 2 : 
                try
                {
                    System.out.println("taken plates = " + plates.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 :         
                try
                {
                    System.out.println("current state of of pile = " + plates.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = " + plates.isEmpty());
                break;                
            case 5 :
                System.out.println("check pile is full = " + plates.isFull());
                break;                 
            case 6 : 
                System.out.println("Size = " + plates.getSize());
                break;                         
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            /* display stack */
            plates.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');   
	}
}
    


		
        
		
	     
	 
	



	


