package com.example.jdbc_demo.repositories;

import com.example.jdbc_demo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    @Autowired
    private DataSource dataSource;

    public List<Product> getAllProducts(){
        String query = "SELECT * FROM products";
        List<Product> products = new ArrayList<>();

        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery()){

            while(rs.next()){
                int productId = rs.getInt("product_id");
                String productName = rs.getString("product_name");
                double unitPrice = rs.getDouble("unit_price");
                int unitsInStock = rs.getInt("units_in_stock");
                Product p = new Product(productId, productName, unitPrice, unitsInStock);
                products.add(p);

            }
        }
        catch(SQLException ex) {
                ex.printStackTrace();
        }

        return products;
    }
}
