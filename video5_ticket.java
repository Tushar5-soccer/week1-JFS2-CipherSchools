import java.util.*;
public class video5_ticket {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("What is your Speed? ");
        double s= sc.nextDouble();
        System.out.println("Is it your Birthday? ");
        System.out.println("Press 1 for YES. Press 2 for NO.");
        int a=sc.nextInt();
        switch(a){
            case 1:
                s-=5;
                if(s>80)
                    System.out.println("High Ticket");
                else if(s>=60 && s<=80)
                    System.out.println("Mid Ticket ");
                else
                    System.out.println("No Ticket ");
                break;
            case 2:
                if(s>80)
                    System.out.println("High Ticket");
                else if(s>=60 && s<=80)
                    System.out.println("Mid Ticket ");
                else
                    System.out.println("No Ticket ");
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
    }
}
