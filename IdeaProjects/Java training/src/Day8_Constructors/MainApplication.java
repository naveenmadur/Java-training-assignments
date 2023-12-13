package Day8_Constructors;

class Student{
    int student_id;
    String name;

    Address address; //Aggregation

    public Student(int student_id, String name) {
        this.student_id = student_id;
        this.name = name;
    }

    public Student(int student_id, String name, Address address) {
        this.student_id = student_id;
        this.name = name;
        this.address = address;
    }
}

class Address{
    int flat_no, plot_no, pin_code;
    String area, landmark, city, state;

    public Address(int flat_no, int plot_no,
                   int pin_code, String area,
                   String landmark, String city,
                   String state) {
        this.flat_no = flat_no;
        this.plot_no = plot_no;
        this.pin_code = pin_code;
        this.area = area;
        this.landmark = landmark;
        this.city = city;
        this.state = state;
    }
}

public class MainApplication {
    public static void main(String[] args) {
        Address address = new Address(402,35,413006,
                "Wadgaon sheri","Sakore clinic",
                "Pune","Maharashtra");

        Student student = new Student(101,"ABC");
        Student student1 = new Student(102, "ABC", address);

    }
}
