

package org.example.first_lb1.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.first_lb1.Repository.CategoryRepo;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@FieldDefaults (level = AccessLevel.PUBLIC)
public class Category  {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   int id ;
   @OneToMany(mappedBy = "category",cascade = CascadeType.REMOVE)
    List<Subcategory> subcategories;
    String title;
    String description ;
}
