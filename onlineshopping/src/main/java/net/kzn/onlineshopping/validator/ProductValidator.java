package net.kzn.onlineshopping.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import net.kzn.shoppingbackend.dto.Product;

public class ProductValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Product.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Product product = (Product) target;
		if(product.getFile() == null 
				|| product.getFile().getOriginalFilename().equals("") ) {
			errors.rejectValue("file", null, "select an IMAGE FILE to upload");
			return;
		}
		
		if(! (
		      product.getFile().getContentType().equals("image/jpeg") 
			  || product.getFile().getContentType().equals("image/png")
			  || product.getFile().getContentType().equals("image/gif")
			  )) 
			{
			errors.rejectValue("file", null, "use only IMAGE FILE TYPE");
			return;
		}

	}

}
