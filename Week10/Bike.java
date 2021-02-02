package Week10;
//this có thể đại diện cho class, hoặc cho constructor 
//nếu gọi lại constructor khác bằng this trong constructor khác thì this phải đc gọi ở dòng đầu tiên
public class Bike {
    int id;
    String name;
    Bike(){
    }

    Bike(int id){
        this();
        this.id = id;
    }

    Bike(int id,String name){
        this(id);
        this.name = name;
    }
    public void display(){
        System.out.println("id "+id);
        System.out.println("name "+name);
    }
    
}
