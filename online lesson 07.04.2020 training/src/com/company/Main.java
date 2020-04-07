package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	String  s = "jhkjhkjhjhuh";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char  c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1 );
            }
        }
        System.out.println(map);
    //
        char c = 'A';
        System.out.println((int)c);
        for(char i = 'A'; i <='z'; i++){
            System.out.print(i);
        }

        int len = 'z' - 'a' + 1;
        char f = 'F';
        char i = (char)(f + 3);
        System.out.println();
        System.out.println(i);

        for(char j = 'А'; j < 'я'; j++ ){
            System.out.println(j);
        }


        //
        int [] [] m = new int[3][5];//3- количество строк 5- количество столбцов
        m[0][0] = 12;
        m [2][4] = -1;


        //тернарный оператор
        String res = m[0][0] > m[2][4] ? "yes" : "no";
        System.out.println(res);






    }
}
