class Circle{
    int radius;
    double area;
    Circle(){
        radius=7;
        area = 3.14* radius *radius;
        System.out.println("THE AREA OF THE CIRCLE IS:"+area);
    }
}
class Cylinder extends Circle{
    int height;
    double a;
    Cylinder(){
        height=15;
        a = 3.14*radius*radius*height;
    }
    void display(){
        System.out.println("THE ARE OF THE CYLINDER IS :"+a);
    }
}
public class cons1{
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.display();
    }
}