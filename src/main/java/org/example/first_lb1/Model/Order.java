package org.example.first_lb1.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults (level = AccessLevel.PUBLIC)
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue
    int id ;
    String ref;
    float price ;
    Date date;
  @ManyToOne
          @JoinColumn(name = "id_customer")
    Customer customer;
  @ManyToMany
    @JoinTable(
            name="order_product",
            joinColumns = @JoinColumn(name="id_order"),
            inverseJoinColumns = @JoinColumn(name="id_product")
    )
    List<Product> product=new ArrayList<Product>();
}
