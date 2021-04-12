
class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
       int id = 45;
        String name = "Nasim";
    }

    public String getName(){return name;}
    public void setName(String n){this.name = n;}
    public void setId(int i){this.id = i;}
    public int getId(){return id;}
}

public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee nasim = new MyMainEmployee();
        nasim.setName("Nasim");
        nasim.setId(34);
        System.out.println(nasim.getId());
        System.out.println(nasim.getName());
    }
}
