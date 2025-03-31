package org.prog.poly;

public class UserSerive {

    public void createOrder(String email) {
        createOrder("no phone present", email);
    }

    public void createOrder(String email, String phone) {
        createOrder(email, phone, "no address present");
    }

    public void createOrder(String email, String phone, String address) {
        System.out.println("Create order with email" + email + "phone" + phone + "address" + address);
    }

    public void smth(int i, String s) {

    }


    public void smth(String s, int i) {

    }
}
