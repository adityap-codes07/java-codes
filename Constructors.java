class Car{
    string engine;
    int year;
    Car(string eng,int y){
        engine=eng;
        year=y;
    }
}
public class Main(
    public static void main(string [] args){
        Car c = new Car(V8,2023);
        System.out.println("ENGINE:"+c.engine);
        System.out.println("YEAR:"+c.year);
    }
}
