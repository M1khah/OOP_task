package org.example;

public class Piano extends Instrument implements Keyboard, Strings {

    public String manufacturer;

    Piano(float price, String manufacturer) {
        super(price);
        this.manufacturer = manufacturer;
    }

    @Override
    public void sound() {
        System.out.println("Beethoven 17th Sonata, 3rd movement");
    }


    public boolean keyboard() {
        return true;
    }


    public short strings() {
        return 230;
    }
}
