package org.springframework.services;import org.springframework.User;import org.springframework.services.BankService;import java.util.Scanner;public class TopUp implements BankService {    @Override    public void makeService(User user) {        System.out.println("TOP UP");        Scanner sc = new Scanner(System.in);        System.out.println("Please add the amount: ");        double a = sc.nextDouble();        user.setBalance(user.getBalance() + a);    }}