package org.example;

public class One_fifty_thali {
    int thali_no;
    int price;
    String dish1;
    String dish2;
    String dish3;
    String dish4;
    String dish5;

    public One_fifty_thali(int price,String dish1,String dish2, String dish3, String dish4, String dish5) {
        this.price = price;
        this.dish1 = dish1;
        this.dish2 = dish2;
        this.dish3 = dish3;
        this.dish4 = dish4;
        this.dish5 = dish5;
    }

    public One_fifty_thali() {
    }

    public String getDish1() {
        return dish1;
    }

    public void setDish1(String dish1) {
        this.dish1 = dish1;
    }

    public String getDish2() {
        return dish2;
    }

    public void setDish2(String dish2) {
        this.dish2 = dish2;
    }

    public String getDish3() {
        return dish3;
    }

    public void setDish3(String dish3) {
        this.dish3 = dish3;
    }

    public String getDish4() {
        return dish4;
    }

    public void setDish4(String dish4) {
        this.dish4 = dish4;
    }

    public String getDish5() {
        return dish5;
    }

    public void setDish5(String dish5) {
        this.dish5 = dish5;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getThali_no() {
        return thali_no;
    }

    public void setThali_no(int thali_no) {
        this.thali_no = thali_no;
    }

    @Override
    public String toString() {
        return "One_fifty_thali{" +
                "thali_no=" + thali_no +
                ", price=" + price +
                ", dish1='" + dish1 + '\'' +
                ", dish2='" + dish2 + '\'' +
                ", dish3='" + dish3 + '\'' +
                ", dish4='" + dish4 + '\'' +
                ", dish5='" + dish5 + '\'' +
                '}';
    }
}
