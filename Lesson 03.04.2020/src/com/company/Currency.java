package com.company;

import java.util.HashMap;

public abstract class Currency implements Convertable {
    private float value;
    protected String name;
    private static HashMap<String, Float> exchangeTable;

    private static HashMap<String, Float> getExchangeTable() {
        if (exchangeTable != null) {
            return exchangeTable;
        }
        exchangeTable = new HashMap<>();
        exchangeTable.put("USD_BYN", 2.58f);
        exchangeTable.put("BYN_USD", 0.388f);
        r
package com.company;

        public class Main {

            public static void main(String[] args) {
                USDConverter usd = new USDConverter();
                RUBConverter rub = new RUBConverter();
                System.out.println(usd.convert(100));
                System.out.println(rub.convert(35));

                USD cUSD = new USD();
                cUSD.setValue(200.30f);
                BYN cBYN = new BYN();
                cUSD.convertTo(cBYN);
                System.out.println(cBYN);
                cBYN.convertTo(cUSD);
                System.out.println(cUSD);
            }