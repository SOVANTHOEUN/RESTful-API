package org.hrd.spring.service;

import java.util.List;

import org.hrd.spring.entities.Category;

/**
 * 
 * @author Tola Created Date: 2017/07/03
 *
 */
public interface CategoryService {
	
	Category findByUUID(String uuid);
	
	List<Category> findAll();

	boolean update(Category category);

	boolean delete(String uuid);

	boolean updateStatusByUUID(String status, String uuid);

	boolean save(Category category);

}
