<<<<<<< HEAD
package com.company;

public abstract class  CoffeMaAbstract implements CoffeMashina {
   int vollWater;
   int vollCoffe;
   String type;
   int fullVollWater;
   int fullVollCoffe;
   int coffeAmericano = 15;
   int coffeEspresso = 7;
   int coffeWEspresso = 15;
   int waterAmericano = 70;
   int waterEspresso = 35;
   int waterWEspresso = 120;



   public void checkWaterCoffe(){
       System.out.println("Сейчас в баке для воды " + vollWater + " млл воды.");
       System.out.println("В баке для кофе " + vollCoffe + " гр кофе.");
   }

   public void makeAmericano(){
       if( vollWater > waterAmericano & vollCoffe> coffeAmericano ) {
           vollWater-=waterAmericano;
           vollCoffe-=coffeAmericano;
           System.out.println("Ваш Americano готов.");
       }
       else if ( vollWater < waterAmericano ) {
           System.out.println("Для приготовления напитка недостаточно воды.");
           System.out.println("Пополните бак с водой.");
       }
       else if ( vollCoffe < coffeAmericano ){
           System.out.println("Для приготовления напитка недостаточно кофе.");
           System.out.println("Пополните бак с кофе.");
       }
       else {
           System.out.println("Для приготовления напитка недостаточно ингридиентов.");
           System.out.println("Пополните бак с водой и бак с кофе.");
       }
   }

    public void makeEspresso(){
        if( vollWater > waterEspresso & vollCoffe> coffeEspresso ) {
            vollWater-=waterEspresso;
            vollCoffe-=coffeEspresso;
            System.out.println("Ваш Espresso готов.");
        }
        else if ( vollWater < waterEspresso ) {
            System.out.println("Для приготовления напитка недостаточно воды.");
            System.out.println("Пополните бак с водой.");
        }
        else if ( vollCoffe < coffeEspresso ){
            System.out.println("Для приготовления напитка недостаточно кофе.");
            System.out.println("Пополните бак с кофе.");
        }
        else {
            System.out.println("Для приготовления напитка недостаточно ингридиентов.");
            System.out.println("Пополните бак с водой и бак с кофе.");
        }
    }

    public void makeWEspresso(){
        if( vollWater > waterWEspresso & vollCoffe> coffeWEspresso ) {
            vollWater-=waterWEspresso;
            vollCoffe-=coffeWEspresso;
            System.out.println("Ваш двойной Espresso готов.");
        }
        else if ( vollWater < waterWEspresso ) {
            System.out.println("Для приготовления напитка недостаточно воды.");
            System.out.println("Пополните бак с водой.");
        }
        else if ( vollCoffe < coffeWEspresso ){
            System.out.println("Для приготовления напитка недостаточно кофе.");
            System.out.println("Пополните бак с кофе.");
        }
        else {
            System.out.println("Для приготовления напитка недостаточно ингридиентов.");
            System.out.println("Пополните бак с водой и бак с кофе.");
        }
    }

    public void replenishWater(){

       if ( vollWater < fullVollWater){
           vollWater = fullVollWater;
           System.out.println("Бак с водой наполнен.");
       }
      else{ System.out.println("Бак с водой уже/ещё полный.");}
    }

    public void replenishCoffe(){
        if ( vollCoffe < fullVollCoffe){
            vollCoffe = fullVollCoffe;
            System.out.println("Бак с коффе наполнен.");
        }
        else { System.out.println("Бак с кофе уже/ещё полный.");}
    }

    public void information(){
       System.out.println("Кофе машина:  " + type);
           }

           public void deactivate(){
       System.out.println("Выключение. Досвидания.");
           }
}
=======
package com.company;

public abstract class  CoffeMaAbstract implements CoffeMashina {
   int vollWater;
   int vollCoffe;
   String type;
   int fullVollWater;
   int fullVollCoffe;
   int coffeAmericano = 15;
   int coffeEspresso = 7;
   int coffeWEspresso = 15;
   int waterAmericano = 70;
   int waterEspresso = 35;
   int waterWEspresso = 120;



   public void checkWaterCoffe(){
       System.out.println("Сейчас в баке для воды " + vollWater + " млл воды.");
       System.out.println("В баке для кофе " + vollCoffe + " гр кофе.");
   }

   public void makeAmericano(){
       if( vollWater > waterAmericano & vollCoffe> coffeAmericano ) {
           vollWater-=waterAmericano;
           vollCoffe-=coffeAmericano;
           System.out.println("Ваш Americano готов.");
       }
       else if ( vollWater < waterAmericano ) {
           System.out.println("Для приготовления напитка недостаточно воды.");
           System.out.println("Пополните бак с водой.");
       }
       else if ( vollCoffe < coffeAmericano ){
           System.out.println("Для приготовления напитка недостаточно кофе.");
           System.out.println("Пополните бак с кофе.");
       }
       else {
           System.out.println("Для приготовления напитка недостаточно ингридиентов.");
           System.out.println("Пополните бак с водой и бак с кофе.");
       }
   }

    public void makeEspresso(){
        if( vollWater > waterEspresso & vollCoffe> coffeEspresso ) {
            vollWater-=waterEspresso;
            vollCoffe-=coffeEspresso;
            System.out.println("Ваш Espresso готов.");
        }
        else if ( vollWater < waterEspresso ) {
            System.out.println("Для приготовления напитка недостаточно воды.");
            System.out.println("Пополните бак с водой.");
        }
        else if ( vollCoffe < coffeEspresso ){
            System.out.println("Для приготовления напитка недостаточно кофе.");
            System.out.println("Пополните бак с кофе.");
        }
        else {
            System.out.println("Для приготовления напитка недостаточно ингридиентов.");
            System.out.println("Пополните бак с водой и бак с кофе.");
        }
    }

    public void makeWEspresso(){
        if( vollWater > waterWEspresso & vollCoffe> coffeWEspresso ) {
            vollWater-=waterWEspresso;
            vollCoffe-=coffeWEspresso;
            System.out.println("Ваш двойной Espresso готов.");
        }
        else if ( vollWater < waterWEspresso ) {
            System.out.println("Для приготовления напитка недостаточно воды.");
            System.out.println("Пополните бак с водой.");
        }
        else if ( vollCoffe < coffeWEspresso ){
            System.out.println("Для приготовления напитка недостаточно кофе.");
            System.out.println("Пополните бак с кофе.");
        }
        else {
            System.out.println("Для приготовления напитка недостаточно ингридиентов.");
            System.out.println("Пополните бак с водой и бак с кофе.");
        }
    }

    public void replenishWater(){

       if ( vollWater < fullVollWater){
           vollWater = fullVollWater;
           System.out.println("Бак с водой наполнен.");
       }
      else{ System.out.println("Бак с водой уже/ещё полный.");}
    }

    public void replenishCoffe(){
        if ( vollCoffe < fullVollCoffe){
            vollCoffe = fullVollCoffe;
            System.out.println("Бак с коффе наполнен.");
        }
        else { System.out.println("Бак с кофе уже/ещё полный.");}
    }

    public void information(){
       System.out.println("Кофе машина:  " + type);
           }

           public void deactivate(){
       System.out.println("Выключение. Досвидания.");
           }
}
>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
