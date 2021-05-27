package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CheckoutController {

	@PostMapping("/payNow")

	public String payNow() {

		// model.addAttribute("total",
		// GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());

		return "orderSuccess";
	}

}
