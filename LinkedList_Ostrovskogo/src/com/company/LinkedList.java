<<<<<<< HEAD
package com.company;

public class LinkedList {
    private Unit head; //первый элемент списка
    private Unit tail; //последний элемент списка


    public LinkedList() {
        head = null;
    }
    private boolean isEmpty() {
        return head == null;
    }

    //Добавление узла в конец списка
    public void add(int data) {
        Unit temp = new Unit(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    // возвращает элемент по указанному индексу
    public int get(int index) throws MyException {
        Unit temp = head;
        int c = 0;
        if (index <= 0) {
            throw new MyException();
        }
        while (temp != null) {
            c++;
            if (index == c) {
                return temp.data;
            } else {
                temp = temp.next;
            }
        }
        if (index > c) {
            throw new MyException();
        }
        return c;
    }

    // выводит в консоль список
    public void print() {
        Unit temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    //считает и возвращает длинну списка
    int leng() {
        int res = 0;
        Unit t = head;
        while (t != null) {
            t = t.next;
            res++;
        }
        return res++;
    }

    // удаляет элемент по указанному индексу
    public void remove(int index) throws MyException {
        Unit temp = head;
        int c = 0;
        if (index <= 0) {
            throw new MyException();
        }
        if (index == 1 & temp != null) {
            head = temp.next;
        }
        while (temp.next != null) {
            c++;
            if (c == index - 1) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            if (index > c) {
                throw new MyException();

            }
        }
    }
}
=======
package com.company;

public class LinkedList {
    private Unit head; //первый элемент списка
    private Unit tail; //последний элемент списка


    public LinkedList() {
        head = null;
    }
    private boolean isEmpty() {
        return head == null;
    }

    //Добавление узла в конец списка
    public void add(int data) {
        Unit temp = new Unit(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    // возвращает элемент по указанному индексу
    public int get(int index) throws MyException {
        Unit temp = head;
        int c = 0;
        if (index <= 0) {
            throw new MyException();
        }
        while (temp != null) {
            c++;
            if (index == c) {
                return temp.data;
            } else {
                temp = temp.next;
            }
        }
        if (index > c) {
            throw new MyException();
        }
        return c;
    }

    // выводит в консоль список
    public void print() {
        Unit temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    //считает и возвращает длинну списка
    int leng() {
        int res = 0;
        Unit t = head;
        while (t != null) {
            t = t.next;
            res++;
        }
        return res++;
    }

    // удаляет элемент по указанному индексу
    public void remove(int index) throws MyException {
        Unit temp = head;
        int c = 0;
        if (index <= 0) {
            throw new MyException();
        }
        if (index == 1 & temp != null) {
            head = temp.next;
        }
        while (temp.next != null) {
            c++;
            if (c == index - 1) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            if (index > c) {
                throw new MyException();

            }
        }
    }
}
>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
