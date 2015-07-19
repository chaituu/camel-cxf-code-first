package org.camelcookbook.transformation.csv;

import org.apache.camel.Body;
import org.camelcookbook.transformation.csv.model.OrderCSV;

public class CSVGenerator {
	
	public OrderCSV transFormToOrderCSV(@Body OrderResponse response)
	{
		System.out.println("transFormToOrderCSV......");
		OrderCSV csv = new OrderCSV();
		csv.setSuccess(false+"");
		csv.setErrorCode(response.getErrorCode());
		csv.setErrorDescription(response.getErrorDescription());
	
		return csv;
	}
	
	

}
