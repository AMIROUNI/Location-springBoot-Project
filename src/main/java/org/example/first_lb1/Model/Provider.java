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
@FieldDefaults(level = AccessLevel.PUBLIC)

public class Provider extends  User{


    int matriculle;
    String service ;
    String company;
    @OneToMany(mappedBy = "provider",cascade = CascadeType.REMOVE)
    List<Product> product ;

}
