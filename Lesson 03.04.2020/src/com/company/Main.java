package com.company;

public class Main {

    public static void main(String[] args) {
	USDConverter usd = new USDConverter();
	RUBConverter rub = new RUBConverter();
        System.out.println(usd.convert(100));
        System.out.println(rub.convert(35));
    }
}
