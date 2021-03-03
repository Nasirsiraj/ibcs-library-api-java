package titan.io.ibcslibraryapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "member")
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int nid;
    private String birthDate;
    private int age;
    private String email;
    private String password;
    private String address;
    private String book;
    private String issueDate;
    private int fine;
}
