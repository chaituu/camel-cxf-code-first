
package com.mycompany.camel.cxf.code.first;

import org.apache.camel.test.junit4.CamelSpringTestSupport;
import org.camelcookbook.transformation.csv.OrderRequest;
import org.camelcookbook.transformation.csv.OrderResponse;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @version $Revision: 85 $
 */
public class OrderTest extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("META-INF/spring/camel-route.xml");
    }

    @Test
    public void testOrderOk() throws Exception {
       	
    	OrderRequest request = new OrderRequest();
    	request.setPartName("vzvxvxv");
    	request.setAmount(112);
    	request.setCustomerName("sunta");
        
    	OrderResponse reply = template.requestBody("cxf:bean:orderEndpoint", request, OrderResponse.class);
       // assertEquals("OK", reply);
    }
}
