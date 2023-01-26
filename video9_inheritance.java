public class video9_inheritance {
    double l;
    double b;
    void display(String s){
        if(s=="area"){
            System.out.println("Area = "+(l*b));
        }
        else if(s=="parameter"){
            System.out.println("Parameter = "+(2*(l+b)));
        }
        else
            System.out.println("Wrong Input");
    }
    public static void main(String[] args){
        Area ob1= new Area();
        ob1.a();
        Parameter ob2= new Parameter();
        ob2.a();
    }

}
class Area extends video9_inheritance{
    void a(){
        l=10;b=5;
        display("area");
    }

}
class Parameter extends video9_inheritance{
    void a(){
        l=10;b=5;
        display("parameter");
    }
}
