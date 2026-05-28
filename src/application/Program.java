package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "Books");
		
		Seller sl = new Seller(1, "mario", "mario@gmail.com", new Date(), 3000.0, dp);
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		System.out.println(sl);
	
	}
}