import java.util.Scanner;

public class main{
    public static void main(String[] args) {
       // double r=9;//radius of circle
        //area of circle
        Scanner sc =new Scanner(System.in);//to take input from user 
        System.out.println("enter the radius:");
        double r=sc.nextInt();
        
        System.out.println(3.14*r*r);

        //volume of shpere 4/3*pi*r*
        System.out.println(1.33*3.14*r*r );
    }

}