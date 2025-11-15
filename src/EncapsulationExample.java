public class EncapsulationExample {
    public static void main(String[] args) {
        E obj = new E();
        obj.setName("Aditya");
        obj.setAge(19);
        System.out.println("Name : "+obj.getName());
        System.out.println("Age : "+obj.getAge());
    }
}
class E{
    private String name;
    private int age;
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age!=0) {
            this.age = age;
        }else{
            System.out.println("Invalid Age!");
        }
    }
    public int getAge(){
        return age;
    }
}
