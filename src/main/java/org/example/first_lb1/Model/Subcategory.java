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

public class Subcategory {
    @Id
            @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id ;
    @ManyToOne
     @JoinColumn(name="id_category")
     Category category;
    String title;
    String description ;
    @ManyToOne
            @JoinColumn(name="id_product")
    Product product;
}
