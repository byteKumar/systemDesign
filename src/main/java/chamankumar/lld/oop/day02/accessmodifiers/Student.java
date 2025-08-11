package chamankumar.lld.oop.day02.accessmodifiers;

import lombok.Getter;

@Getter
public class Student {
    private Long id;
    private String name;
    private String email;
    private String batchName;
    private Double psp;
    private String non_camel_case;
    private StudentStatus status = StudentStatus.ACTIVE;


    public StudentStatus changeStatus(StudentStatus newStatus) {
        if(this.status == StudentStatus.DONE) {
            return StudentStatus.DONE;
        }

        this.status = newStatus;
        return this.status;
    }

}