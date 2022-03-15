package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	
	void update(Integer obj);
	
	void deleteById(Seller id);
	
	Seller findById(Integer id);
	
	List<Seller> findAll();


}
