package org.example.first_lb1.Repository;

import org.example.first_lb1.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
     List<Category> getByTitle(String title);
}
