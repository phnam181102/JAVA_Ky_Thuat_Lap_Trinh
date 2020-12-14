package Practices_01;

public class ViDu3_2 {
    private String name; //biến toàn cục
    public ViDu3_2 (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args){
        ViDu3_2 bkitEmployee = new ViDu3_2 ("Huy Nguyen");
        System.out.println("Tên: "+bkitEmployee.getName());
    }
}
