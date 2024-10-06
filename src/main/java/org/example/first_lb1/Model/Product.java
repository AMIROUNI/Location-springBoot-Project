package org.example.first_lb1.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults (level = AccessLevel.PUBLIC)
public class Product {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
String name;
float price ;
String descriptoin ;
@OneToMany(mappedBy = "product",cascade = CascadeType.REMOVE)
List<Subcategory> subcategory;
@ManyToOne
    @JoinColumn(name="id_provider")
    Provider provider;
@ManyToMany(mappedBy = "product",cascade = CascadeType.REMOVE)
    List<Order> order=new ArrayList<Order>();


}
