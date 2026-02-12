public class ShallowDeep {
    public static void main(String[] args) {
        Address adr = new Address("Vijayapura");
        Student s1 = new Student();
        s1.name = "Shreyas" ;
        s1.roll = 1;
        s1.adr = adr;
        Student s2 = new Student(s1);
        System.out.println(s1.name + ", " + s1.roll + ", " + s1.adr.city);
        System.out.println(s2.name + ", " + s2.roll + ", " + s2.adr.city);
        s2.name = "Shivu";
        s2.roll = 2;
        s2.adr.city = "Muttagi";
        System.out.println(s1.name + ", " + s1.roll + ", " + s1.adr.city);
        System.out.println(s2.name + ", " + s2.roll + ", " + s2.adr.city);
    }
}

class Address {
    String city;
    public Address(String adr) {
        System.out.println("Address constructor");
        this.city = adr;
    }
}

class Student {
    String name;
    int roll;
    Address adr;

    Student() {
        System.out.println("Defaut student constructor");
    }

    Student(Student other) {
        System.out.println("Copy constructor of Student");
        this.name = other.name;
        this.roll = other.roll;
        // this.adr = other.adr;   //^ Shallow copy
        this.adr = new Address(other.adr.city);  //^ Deep copy
    }
}
