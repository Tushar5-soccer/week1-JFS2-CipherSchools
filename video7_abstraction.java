import java.util.*;

interface cycle1{
    void Time();
}
interface cycle2{

    void Distance();
}

public class video7_abstraction implements cycle1,cycle2{
    static Scanner sc=new Scanner(System.in);
    public static double amt;
    public static double a;
    video7_abstraction(){
        amt=0.0;a=0.0;
    }
    public static void main(String[] args){
        cycle1 ob=new video7_abstraction();
        cycle2 obj=new video7_abstraction();
        System.out.println("Welcome!!!");
        System.out.println("Enter your name");
        String s= sc.nextLine();
        System.out.println("Please tell your preference "+s);
        System.out.println("Press 1 If you want bike on Time Basis");
        System.out.println("Press 2 If you want bike on Distance Basis");
        int d= sc.nextInt();
        switch(d){
            case 1:
                ob.Time();
                System.out.println("Your bill "+s);
                System.out.println("The Amount as per choice");
                System.out.println(a+" x 50 = "+amt);

                break;
            case 2:
                obj.Distance();
                System.out.println("Your bill "+s);
                System.out.println("The Amount as per choice");
                System.out.println(a+" x 2 = "+amt);
                break;
            default:
                System.out.println("Wrong input");
                break;
        }

    }
    @Override
    public void Time() {
        System.out.println("Enter The Time ");
        a=sc.nextInt();
        amt= 50*a;
    }
    @Override
    public void Distance() {
        System.out.println("Enter The Distance ");
        a=sc.nextInt();
        amt=2*a;
    }
}
