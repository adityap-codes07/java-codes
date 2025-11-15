class Eectangle{
    private int length;
    private int breath;
    public void setLength(int x){
        length = x;
    }
    public int getLength(){
        return length;
    }
    public void setBreath(int y){
        breath = y;
    }
    public int getBreath(){
        return breath;
    }
    void areaRectangle(){
        int area = length *breath;
        System.out.println("AREA:"+area);
    }
    void perimeter(){
        int per = 2*(length+breath);
        System.out.println("Perimeter:"+per);
    }
}
class setGet{
    public static void main(String[] args) {
        Eectangle obj = new Eectangle();
        obj.setLength(10);
        obj.setBreath(20);
        int len = obj.getLength();
        System.out.println("Length:"+len);
        int bre = obj.getBreath();
        System.out.println("Breath:"+bre);
        obj.areaRectangle();
        obj.perimeter();
    }
}