package backend.project.dao;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import backend.project.entity.ProductoImagenEntity;
import backend.project.model.ProductoImagenDto;
import backend.project.model.ProductoImagenModel;

public class ProductoImagenDao {
	
	@Autowired
	private DataSource dataSource;
	public int guardar (ProductoImagenDto pro) {

		
        Connection con=null;
        try{
            con=dataSource.getConnection();
            PreparedStatement preesta;
            preesta = con.prepareStatement("INSERT INTO producto_imagen(imagen_id,product_product_id) VALUES (?,?)");
            preesta.setInt(1, pro.getImagen_id());
            preesta.setInt(2, pro.getProduct_product_id());
            preesta.executeUpdate();
            preesta.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException sqex) {}
            }
        }
        return pro.getImagen_id();

}

}
