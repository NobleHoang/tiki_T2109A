public class InforProduct extends producttiki{
    int qty;
    String infor;
    String category;
    float price;
    public InforProduct(){
        super();
        this.qty=qty;
        this.infor=infor;
        this.category=category;
        this.price=price;
    }
    public InforProduct(String name,int id,int qty,float price,String infor,String category){
        super(name,id);
        this.price=price;
        this.category=category;
        this.infor=infor;
        this.qty=qty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InforProduct{" +
                "product=" +super.toString()+","+
                "qty=" + qty +
                ", infor='" + infor + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
