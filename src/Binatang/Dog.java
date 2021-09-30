/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binatang;

/**
 *
 * @author Chris
 */
public class Dog extends Animal {

    public Dog(String name, String food, int age, int alive, String gender) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.alive = alive;
        this.gender = gender;
    }

    @Override
    public String printSound() {
        return "Gukk";
    }

    @Override
    public String printData() {
        return "Nama : " + this.name + ", Umur : " + this.age + ", Makanan : " + this.food + ", Age : " + this.age + ", Gender : " + this.gender + ", Hidup : " + isAlive();
    }
}
