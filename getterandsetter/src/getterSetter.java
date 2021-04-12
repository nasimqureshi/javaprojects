
class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
       name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}
public class getterSetter {
    public static void main(String[] args) {
      MyEmployee herry = new MyEmployee();
      //herry.id = 45;//herry.name = "Nasim";
        herry.setName("Nasim");
        System.out.println(herry.getName());
        herry.setId(236);
        System.out.println(herry.getId());
    }
}
