package chamankumar.lld.oop.day05.solid01SRPandCRP.assignments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Book {
    private String name;
    private String authorName;
    private int year;
    private int price;
    private String isbn;
}
