package Lesson1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderTest {

    public static void main(String[] args) {
        Order order= new Order();

        order.orderId = 202009210001L;
        order.customerId = "dsm001";
        order.orderDate = LocalDateTime.now();
        order.customerName = "이상이";
        order.productId = "PD0921-01";
        order.shippingAddress = "대전시 유성구 가정북로 76";

        System.out.println("주문 번호: " + order.orderId);
        System.out.println("주문자 ID: " + order.customerId);
        System.out.println("주문 날짜: " + order.orderDate.format(DateTimeFormatter.ofPattern("yyyy-hh-dd HH:mm:ss")));
        System.out.println("주문자 이름: " + order.customerName);
        System.out.println("주문 상품 번호: " + order.productId);
        System.out.println("배송 주소: " + order.shippingAddress);
    }
}
