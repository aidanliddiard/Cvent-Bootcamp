package com.example.jdbc_demo;

import com.example.jdbc_demo.models.Category;
import com.example.jdbc_demo.models.Product;
import com.example.jdbc_demo.repositories.CategoryRepository;
import com.example.jdbc_demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JdbcDemoApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(JdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Category> categoryList = categoryRepository.getAllCategories();
		List<Product> productList = productRepository.getAllProducts();

		categoryList.forEach(System.out::println);
		productList.forEach(System.out::println);
	}


}
