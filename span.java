import java.util.*;

//       public static int add(int a,int b){
//           return a+b;
//       }

//       //to generate function to add
//      public static void main(String[] args){

         
//       Scanner sc= new Scanner(System.in);
//        System.out.print("enter a:");
//        int a=sc.nextInt();

//        System.out.print("enter b:");
//        int b=sc.nextInt();

//        int sum=add(a,b);
//        System.out.println(sum);

//      }

// }







//     to count he frequncy of number ,,,,,,,,,,,,,



// public class main {

//     public static int frequencyCount(int n, int d) {
//         int count = 0;
//         while (n > 0) {
//             int rem = n % 10;
//             if (rem == d)
//                 count++;
//             n = n / 10;
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number: ");
//         int n = sc.nextInt();

//         System.out.print("Enter digit to count: ");
//         int d = sc.nextInt();

//         int count = frequencyCount(n, d);
//         System.out.println("Frequency: " + count);

//         sc.close();
//     }
// }

//conversion 
// This program converts a decimal number to binary.,,,,,,,,,,,

// public class main {
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter a decimal number: ");
    //     int n = sc.nextInt();

//         String binary = "";

//         while (n > 0) {
//             int remainder = n % 2;
//             binary = remainder + binary;
//             n = n / 2;
//         }
//         System.out.println("The binary representation is: " + binary);
//     }
// }

//to convert from decimal to octal<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
// public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a decimal number: ");
//         int n = sc.nextInt();

//         String octal = "";

//         while (n > 0) {
//             int remainder = n % 8;
//             octal = remainder + octal;
//             n = n / 8;
//         }
//         System.out.println("The binary representation is: " + octal);
//     }
// }



//to create array
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.print("enter size of array:");
//     int  n= sc.nextInt();
    
//     System.out.println("enter arrya");
 
//       int arr[]=new int[n];
//     for(int i=0; i<n; i++){
//         arr[i]=sc.nextInt();
//     }
//     for(int i=0; i<n; i++){
//         System.out.print(arr[i]+"-> ");
//     }
// }
// }




//max-min element in the array
public class span {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int max = arr[0];
//         int min = arr[0];
//         for (int i = 1; i < n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         int span = max - min;
//         System.out.println("The span of the array is: " + span);
//     }
// }




//to find thpe position of array or indx or array


public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.print("enter the size of array:");
//      int n=sc.nextInt();


//        System.out.print("enter array element:");
//      int arr[]=new int[n];
//      for(int i=0; i<n; i++){
//         arr[i]=sc.nextInt();
//      }
//      for(int i=0; i<n; i++){
//         System.out.println("the index of"+arr[i]+"number is:"+i);
//      }
// }
// }



///to rotate elemnt in array
  Scanner sc=new Scanner(System.in);
     System.out.print("enter the size of array:");
     int n=sc.nextInt();


       System.out.print("enter array element:");
     int arr[]=new int[n];
     for(int i=0; i<n; i++){
    //     arr[i]=sc.nextInt();
    //  }
     System.out.println(arr);
    //  for(int i=0; i<n; i--){
    //     System.out.println("the index of"+arr[i]+"number is:"+i);
    //  }
}
}}