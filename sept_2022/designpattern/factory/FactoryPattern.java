package sept_2022.designpattern.factory;

public class FactoryPattern {

    public Person getPerson(String personType) {
        if (personType.equals("Student")) {
            return new Student();
        } else if (personType.equals("Staff")) {
            return new Staff();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        FactoryPattern personFactory = new FactoryPattern();
        Person student = personFactory.getPerson("Student");
        System.out.println("====== student ======");
        student.setNames("Ferdis", "Fernando");
        System.out.println("====== staff ======");
        Person staff = personFactory.getPerson("Staff");
        staff.setNames("Kaka", "Kakali");
    }

}
