package chamankumar.lld.oop.day02.accessmodifiers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
//@AllArgsConstructor
public class Student {

    private String name;
    private String email;
    private String batchName;
    private Double psp;
    private StudentStatus status = StudentStatus.ACTIVE;

    public Student(String name, String email, String batchName, Double psp, StudentStatus status) {
        if (psp > 100 || psp < 0) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.email = email;
        this.batchName = batchName;
        this.psp = psp;
        this.status = status;
    }

    //public Student() {}

    public StudentStatus changeStatus(StudentStatus newStatus) {
        if(this.status == StudentStatus.DONE) {
            return StudentStatus.DONE;
        }

        this.status = newStatus;
        return this.status;
    }

}