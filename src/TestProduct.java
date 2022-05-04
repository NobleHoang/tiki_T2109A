public class TestProduct {
    public static void main(String[] args) {
        InforProduct inforProduct = new InforProduct();
        System.out.println(inforProduct);
        producttiki tiki = new producttiki();
        System.out.println(tiki);
        InforProduct inforProduct1=new InforProduct("Sach giao khoa",1,3,999,"Lop 12","Xuat ban nam 2022");
        System.out.println(inforProduct1);
        InforProduct inforProduct2=new InforProduct("Sach giao khoa",1,5,990,"Lop 11","Xuat ban nam 2021");
        System.out.println(inforProduct2);
        tiki.setName("Truyen tranh",2);
        System.out.println(tiki);
        InforProduct inforProduct3=new InforProduct("Truyen tranh",2,10,99,"Doremon","Xuat ban nam 1999");
        System.out.println(inforProduct3);
    }
}
