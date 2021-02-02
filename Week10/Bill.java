package Week10;

public class Bill {
    private String code;
    private String name;
    private int quantity;
    private double unitPrice;
    private double discount;

    public Bill(String code, String name, int quantity, double unitPrice) {
        this.setCode(code);
        this.setName(name);
        this.setQuantity(quantity);
        this.setUnitPrice(unitPrice);

    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Bill(String code, String name, int quantity, double unitPrice, double discount) {
        this.setCode(code);
        this.setName(name);
        this.setQuantity(quantity);
        this.setUnitPrice(unitPrice);
        this.setDiscount(discount);

    }

    public static double caculator(int quantity,double unitPrice){
        return quantity * unitPrice;
    }

    public static double caculator(int quantity,double unitPrice,double discount){
        return quantity * unitPrice*(1-(double)discount/100);
    }
}


