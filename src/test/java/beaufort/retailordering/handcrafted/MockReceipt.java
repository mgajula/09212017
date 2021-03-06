/**
 * Copyright Beaufort Fairmont, LLC 2017. 
 * 
 * If you want to use this code, you can, simply by referencing 
 * Beaufort Fairmont and D Paul Merrill, http://beaufortfairmont.com
 */
package beaufort.retailordering.handcrafted;

import beaufort.retailordering.Receipt;

public class MockReceipt implements Receipt{

	public String addSkuString;
	public void addSku(String sku) {
		addSkuString = sku;
	}
	
	public String addPriceString;
	public void addPrice(String price) {
		addPriceString = price;
	}
	
	public String addPaymentTypeString;
	public void addPaymentType(String paymentType) {
		addPaymentTypeString = paymentType;
	}
}
