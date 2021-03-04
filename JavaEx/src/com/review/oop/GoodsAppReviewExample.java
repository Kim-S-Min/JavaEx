package com.review.oop;


public class GoodsAppReviewExample {

	public static void main(String[] args) {
		GoodsReviewExample notebook = new GoodsReviewExample();
		notebook.name = "lg gram";
		notebook.price = 1500000;
		
		GoodsReviewExample smartphone = new GoodsReviewExample();
		smartphone.name = "iphone 12";
		smartphone.price = 1100000;
		
		System.out.printf("%s,%d원%n",
				notebook.name, notebook.price);
		System.out.printf("%s, %d원%n",
				smartphone.name, smartphone.price);
	}

}
