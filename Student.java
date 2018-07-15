
class Student {
    int id;
    String name;
    double gpa;
    
    void getInfo() {
        System.out.println("ID : " +this.id);
        System.out.println("Name : " +this.name);
        System.out.println("Result : " +this.gpa);
    }
}

class MyClass {
    public static void main(String []args) {
        Student rahim=new Student();
        Student karim=new Student();
        
        rahim.id=1;
        rahim.name="Rahim Uddin";
        rahim.gpa=3.32;
        
        karim.id=2;
        karim.name="Abdul Karim";
        karim.gpa=4.32;
        
        rahim.getInfo();
        karim.getInfo();
    }
}
