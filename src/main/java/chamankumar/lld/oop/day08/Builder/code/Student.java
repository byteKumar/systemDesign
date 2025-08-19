package chamankumar.lld.oop.day08.Builder.code;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Student {

    public String fname;
    public String lname;
    public String email;
    public String phone;
    public String address;
    public int age;

    // private constructor
    private Student() {}

    public static StudentBuilder builder() { // why static
        return new StudentBuilder();
    }

    // static inner class
    public static class StudentBuilder {

        //using a single instance of the outer class to avoid duplicate fiels
        private final Student student;

        //initalise the builder with the new student instance
        public StudentBuilder() {
            this.student = new Student();
        }

        public String getFname() {
            return this.fname; // why not this
        }

        public StudentBuilder setFname(String fname) {
            student.fname = fname;
            return this; // this one
        }

        public String getLname() {
            return student.lname;
        }

        public StudentBuilder setLname(String lname) {
            student.lname = lname;
            return this;
        }

        public String getEmail() {
            return student.email;
        }

        public StudentBuilder setEmail(String email) {
            student.email = email;
            return this;
        }

        public String getPhone() {
            return student.phone;
        }

        public StudentBuilder setPhone(String phone) {
            student.phone = phone;
            return this;
        }

        public String getAddress() {
            return student.address;
        }

        public StudentBuilder setAddress(String address) {
            student.address = address;
            return this;
        }

        public Integer getAge() {
            return student.age;
        }

        public StudentBuilder setAge(Integer age) {
            student.age = age;
            return this;
        }

        public Student build() {
            if (!isValid()){
                throw new IllegalArgumentException("Object is not valid");
            }
            return student;
        }

        public boolean isValid() {
            return student.fname != null && student.lname != null;
        }
    }
}
