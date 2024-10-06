package org.example.first_lb1.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults (level = AccessLevel.PUBLIC)

public class Customer extends User {


    String adress ;
    String city;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.REMOVE)
    List<Order> order ;
}

