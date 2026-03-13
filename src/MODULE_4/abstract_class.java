package MODULE_4;
abstract class abstract_class {
    abstract void display();
}
class Circle extends abstract_class{
    void display(){
        System.out.println("This is a Circle");
    }

    public static void main(String[] args) {
        Circle c=new Circle();
        c.display();
    }
}

