package org.example.first_lb1.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults (level = AccessLevel.PUBLIC)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class User {
    @Id
            @GeneratedValue(strategy = GenerationType.TABLE)
    int id ;
    String name ;
    float salary ;
    int phone ;
    String email ;
    String password ;

}
