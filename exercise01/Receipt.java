package main.java.org.dii.oop.exercise01;

import java.util.Date;

public class Receipt {
    private static double costPerHour = 20.0;
    private static int latestReceiptNumber = 0;
    private String receiptNumber;
    private String plateNumber;
    private String customerName;
    private Date depositDate;
    private Date receiptDate;
    private int hours;


    private String generateReceiptNumber() {
        latestReceiptNumber++;
        return String.format("R-%04d", 1000 + latestReceiptNumber);
    }

    public Receipt(String plateNumber, String customerName) {
        this.receiptNumber = generateReceiptNumber();
        this.depositDate = new Date();
        this.plateNumber = plateNumber;
        this.customerName = customerName;

    }

    public double getPaymentTotal() {
        return hours * costPerHour;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDepositDate() {
        return depositDate;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }
}
