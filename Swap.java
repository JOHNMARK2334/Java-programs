import java.util.Scanner; //importing Scanner class that allows user inputs
public class Swap {
    //variable declaration
    private static int x;
    private static int y;
    //variable initialization
    private static Scanner obj=new Scanner(System.in);
    //constructor class
    public Swap(){
        System.out.println("Enter the first value:");
        x=obj.nextInt();
        System.out.println("Enter the second value:");
        y=obj.nextInt();
       

    }
    public static void main(String[] args){
        //class initialization
        Swap s1=new Swap();
        //actual swapping of numbers using a third temporary value
        int temp=0;
        temp=x;
        x=y;
        y=temp;

        System.out.println("The swapped value for the first value is:" +x);
        System.out.println("The swapped value for the second value is:" +y);
    }
    
}
