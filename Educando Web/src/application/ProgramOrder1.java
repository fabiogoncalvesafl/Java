package application;

import java.util.Date;

import entities.Order1;
import entities.enums.OrderStatus;

public class ProgramOrder1 {

	public static void main(String[] args) {

		Order1 order = new Order1(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

		OrderStatus os1 = OrderStatus.DELIVERED;

		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

		System.out.println(os1);
		System.out.println(os2);
	}

}
