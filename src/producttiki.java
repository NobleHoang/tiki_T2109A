public class producttiki {
    String name;
    int id;

    public producttiki(){
        this.name="Sach giao khoa";
        this.id=1;
    }
    public producttiki(String name,int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name,int id) {
        this.name = name;
        this.id= id;
    }

    @Override
    public String toString() {
        return "producttiki{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
