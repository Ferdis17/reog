package sept_2022.designpattern.factory;

public class Student implements Person{

    @Override
    public void setNames(String firstName, String lastName) {
        System.out.println("Student names: " + firstName +" "+ lastName);
    }
}
