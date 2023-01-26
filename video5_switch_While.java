import java.util.*;

public class video5_switch_While {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Choose 1 for Forward counting");
        System.out.println("Choose 2 for Backward counting");
        int a=sc.nextInt();
        System.out.println("Enter upto which you want to counting");
        int b=sc.nextInt();
        int i=1;
        switch(a){
            case 1:
                while(i<=b){
                    System.out.print(i+" ");
                    i++;
                }
                break;
            case 2:
                i=b;
                while(i>=1){
                    System.out.print(i+" ");
                    i--;
                }
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }

    }


}
