public class ShallowDeep {
    public static void main(String[] args) {
        Address address = new Address("Vijayapura");
        Student s1 = new Student();
        s1.name = "Shreyas";
        s1.roll = 25;
        s1.adr = address;
        Student s2 = new Student(s1);
        System.out.println(s2.name + " " + s2.roll + " " + s2.adr.city);
        System.out.println(".......................................");
        s2.adr.city = "muttagi";
        s2.name = "shivu";
        s2.roll = 1;
        System.out.println(s2.name + " " + s2.roll + " " + s2.adr.city); 
        System.out.println(s1.name + " " + s1.roll + " " + s1.adr.city); 

    }
}
class Address{
    String city;
     Address(String otherAddress){
        System.out.println("Adress constructor called");
        this.city = otherAddress;
     }
}
class Student{
    String name;
    int roll;
    Address adr;

    //normal/default constructor
    Student(){
        System.out.println("Default constructor created...");
    }
    
    //copy constructor
    Student(Student other){
        System.out.println("copy contructor created");
        this.name = other.name;
        this.roll = other.roll;
        this.adr = new Address(other.adr.city);    // deep copy
        // this.adr = other.adr.city;              //shallow copy
    }
}

