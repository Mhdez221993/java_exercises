package Programs.BasicPrograms;

/*
Java provides five ways to create an object.

    Using new Keyword

    Using clone() method

    Using newInstance() method of the Class class

    Using newInstance() method of the Constructor class

    Using Deserialization
 */

public class HowToCreateObject implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String str = "New Object Created";

    public static void main(String[] args) {
        HowToCreateObject ob1 = new HowToCreateObject();

        try {
            HowToCreateObject ob2 = (HowToCreateObject) ob1.clone();
            System.out.println(ob2.str);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
