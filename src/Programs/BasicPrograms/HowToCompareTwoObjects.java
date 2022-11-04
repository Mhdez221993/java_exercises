package Programs.BasicPrograms;

public class HowToCompareTwoObjects {
    public static void main(String[] args) {
        Employee emp1 = new Employee(918, "Maria");
        Employee emp2 = new Employee(918, "Maria");

        int a = emp1.hashCode();
        int b = emp2.hashCode();

        System.out.println("Hashcode of emp1 = "+ a);
        System.out.println("Hashcode of emp2 = "+ b);
        System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));
    }
}
