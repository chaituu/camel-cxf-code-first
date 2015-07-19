package org.camelcookbook.transformation.csv;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class OrderWebService implements Processor{
	
	/*public OrderResponse processOrderWebservice(@Body OrderRequest request,Exchange exchange)
	{
		System.out.println(exchange.getIn().getBody(OrderRequest.class)+"...processOrderWebservice:"+request.getCustomerName());
		
		
		OrderResponse response = new OrderResponse();
		response.setSuccess(false);
		response.setErrorCode("111");
		response.setErrorDescription("xxx");
	//	exchange.getOut().setHeader("seda:generateCSV","true");
	//	exchange.getOut().setBody(response);
		return response;
	}*/

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("OrderWebService........");
		OrderRequest order= exchange.getIn().getBody(OrderRequest.class);
		OrderResponse response = new OrderResponse();
		response.setSuccess(false);
		response.setErrorCode(order.getPartName());
		response.setErrorDescription(order.getCustomerName());
	//	exchange.getOut().setHeader("pollingResult", "seda:generateCSV");
		exchange.getOut().setBody(response);
	}
	
	

}
