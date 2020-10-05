package Lesson2;

import java.security.MessageDigest;
import java.text.MessageFormat;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    float bonusRatio;

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerGrade = "SILVER";
        this.bonusPoint = 0;
        this.bonusRatio = 0.01f;
    }

    public String showCustomerInfo() {
        Object[] arguments = {this.customerID, this.customerName, this.customerGrade};
        return MessageFormat.format("고객 아이디 : {0}\n고객 명 : {1}\n고객 등급 : {2}", arguments);
    }
}
