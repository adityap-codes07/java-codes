class Rectangle{
    int length,breath;
    Rectangle(){
        length=breath=10;
    }
    Rectangle(int l,int b){
        length=l;
        breath=b;
    }
}
class Cuboid extends Rectangle{
    int height;
    Cuboid(){
        height=10;
    }
    Cuboid(int h){
        height=h;
    }
    void volume(){
        int vol=length*breath*height;
        System.out.println("VOLUME:"+vol);
    }
}
class Main{
    public static void main(String[] args) {
        Cuboid obj = new Cuboid();
        obj.volume();
        Cuboid obj1 = new Cuboid(5);
        obj1.volume();
    }
}