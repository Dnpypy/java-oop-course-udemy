package academy.devonline.java.section001_classes;

public class NullConst {

    public static void main(String[] args) {
        MyClass o1 = new MyClass();
        MyClass o2;
        MyClass o3 = null;

        System.out.println(o1);
        System.out.println(o3);
        //System.out.println(o2);
        if (o3 == null) {
            System.out.println("is null");
        }
        if (o1 != null) {
            System.out.println("not null");
        }
    }
}
