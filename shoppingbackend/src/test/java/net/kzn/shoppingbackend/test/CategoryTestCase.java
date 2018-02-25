package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	
	
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	
/*	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Laptop");
		category.setDescription("This is some description for laptop!");
		category.setImageURL("CAT_105.png");
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
	}*/
	
/*	@Test
	public void testGetCategory () {
		category = categoryDAO.get(1);
		assertEquals("Successfully fetched a category from the table!","Laptop",category.getName());
	}*/
	
/*	@Test
	public void testUpdateCategory () {
		category = categoryDAO.get(2);
		category.setActive(true);
		category.setName("Tele");
		assertEquals("Successfully updated a category in the table!",true,categoryDAO.update(category));
	}*/
	
	@Test
	public void testDeleteCategory () {
		category = categoryDAO.get(2);
		assertEquals("Successfully delete a category in the table!",true,categoryDAO.delete(category));
	}
	
	
	
}