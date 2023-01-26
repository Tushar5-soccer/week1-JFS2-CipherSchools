public class video8_constructor {
    int id;double sal;String name;
    video8_constructor(int i,double sa,String nam){
        id=i;
        sal=sa;
        name=nam;
    }
    public static void main(String[]args){
        video8_constructor ob1= new video8_constructor(1001, 85000.0, "Tushar");
        video8_constructor ob2= new video8_constructor(1002, 55000.0, "Sachin");
        video8_constructor ob3= new video8_constructor(1003, 65000.0, "Suryansh");
        video8_constructor ob4= new video8_constructor(1002, 65000.0, "Pulkit");
        video8_constructor ob5= new video8_constructor(1002, 55000, "Abhijeet");
        System.out.println("Employee ID "+ob1.id+" Name "+ob1.name+" Salary "+ob1.sal);
        System.out.println("Employee ID "+ob2.id+" Name "+ob2.name+" Salary "+ob2.sal);
        System.out.println("Employee ID "+ob3.id+" Name "+ob3.name+" Salary "+ob3.sal);
        System.out.println("Employee ID "+ob4.id+" Name "+ob4.name+" Salary "+ob4.sal);
        System.out.println("Employee ID "+ob5.id+" Name "+ob5.name+" Salary "+ob5.sal);

    }
}
