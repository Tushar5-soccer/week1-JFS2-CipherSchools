import java.util.*;
public class video5_randomNum {
    static Scanner sc= new Scanner(System.in);
    static Random rd= new Random();
     public static void main(String[] args){

         int num= rd.nextInt(50);
         boolean b=true;
         for(int i=3;i>=1;i--) {
             System.out.println("Guess a Number Between 1-50 ");
             System.out.println("You have "+i+" chances.");
             int g = sc.nextInt();
             if (g > num) {
                 System.out.println("Oh No!! Your choice is High");
             } else if (g < num) {
                 System.out.println("Oh No!! Your choice is Low.");
             } else {
                 System.out.println("Hurrayy!! You Guessed it Right.");
                 b = false;
                 break;
             }
         }
         if(b)
             System.out.println("GAME OVER!!");

     }
}
