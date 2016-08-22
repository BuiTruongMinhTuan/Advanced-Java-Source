/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class Hunman {

    String fullName;
    String birthDay;
    String address;
    String phone;
    BufferedReader input;

    public Hunman() {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    public Hunman(String fullName, String birthDay, String address, String phone) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.address = address;
        this.phone = phone;
    }

    public void inputInfo() throws IOException {

        System.out.println("full Name:");
        fullName = input.readLine();
        System.out.println("birth Day:");
        birthDay = input.readLine();
        System.out.println("address:");
        address = input.readLine();
        System.out.println("phone:");
        phone = input.readLine();
    }

    public void outputInfo() {
        System.out.println("full Name: " + fullName);
        System.out.println("birth Day: " + birthDay);
        System.out.println("address: " + address);
        System.out.println("phone: " + phone);

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
