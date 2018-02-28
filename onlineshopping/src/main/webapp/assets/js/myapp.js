$(function() {
	//solving  active menu problem
	switch(menu)	{
		
		case 'About Us' :
			$('#about').addClass('active');
			break;
		case 'Contact Us' :
			$('#contact').addClass('active');
			break;
		case 'All Products' :
			$('#listProducts').addClass('active');
			break;
		default:
			if(menu == "Home") break;			
			$('#listProducts').addClass('active');
			$('#a_'+menu).addClass('active');	
			break;
	}
	
	//code for jquery dataTable	
	//create a dataset
	var products = [
	                	['1', 'abc'],
	                	['2', 'cyz'],
	                	['3', 'afs'],
	                	['4', 'asf'],
	                	['5', 'aasfdbc'],
	                	['6', 'fg'],
	                	['7', 'sf'],
	                	['8', 'sf']    	
	          	                
	                ];
	//get that table	
	var $table = $('#productListTable');
	
	//execute the below code only where  we have this table
	if($table.length) {
		
		//console.log('Inside the table!')
		$table.DataTable( {
			lengthMenu: [ [3, 5, 10, -1], ['3 Records', '5 Records','10 Records','ALL Records'] ],
			pageLength: 5,
			data:products
		});
		
	}
	
});

