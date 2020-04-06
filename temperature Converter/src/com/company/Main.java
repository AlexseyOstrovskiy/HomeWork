package com.company;

public class Main {

    public static void main(String[] args) {
	float Celsium =  15.6f;
	KelvinConverter kelvinConverter = new KelvinConverter();

        System.out.println(kelvinConverter.temp(Celsium));
    }
}
