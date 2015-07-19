package org.camelcookbook.transformation.csv;

import javax.jws.WebService;

@WebService
public interface OrderEndpoint {
	public OrderResponse order(OrderRequest request);
}
