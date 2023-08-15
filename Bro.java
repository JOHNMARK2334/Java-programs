public class Bro{
    private static int x=123; //inititalization

    public static void main(String[] args){
        boolean k=false;
        String x="John";
        String y="Mark";
        String temp=null;
        temp=x;
         x=y;
         y=temp;
        System.out.println("My name is:" +x);
        System.out.println(k);
        System.out.println("X:" +x);
        System.out.println("Y:" +y);
    }


}