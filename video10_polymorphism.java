public class video10_polymorphism {
    double area(double r){
        return 3.412*r*r;
    }
    double area(double l, double b ) {
        return l * b;
    }
    public static void main(String[] args){
        video10_polymorphism ob= new video10_polymorphism();
        System.out.println("Circle Area= "+ob.area(5));
        System.out.println("Rectangle Area= "+ob.area(5,10));
    }
}
