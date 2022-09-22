package sept_2022.designpattern.factory;

public class Staff implements Person{
    @Override
    public void setNames(String firstName, String lastName) {
        System.out.println("Staff names: " + firstName +" "+ lastName);
    }
}
