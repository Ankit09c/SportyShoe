package com.ecommerce.global;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.model.Product;

public class GlobalData {

	public static List<Product> cart;
	static {
		cart = new ArrayList<>();
	}

}
