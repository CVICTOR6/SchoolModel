package org.example.Model;

public class Staff extends Users{
    private boolean isPresent;


    public Staff(String name, String gender, int age, boolean isPresent) {
        super(name, gender, age);
        this.isPresent = isPresent;
    }

    public Staff() {

    }

//    @Override
//    public String toString() {
//        return "Staff{" +
//                "isPresent=" + isPresent +
//                '}';
//    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "isPresent=" + isPresent +
                "} " + super.toString();
    }
}
