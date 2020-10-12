package com.haitao.map;

import java.util.HashMap;
import java.util.Objects;

public class MyTest {

    private static class Person{

        int idCard;

        String name;

        public int getIdCard() {
            return idCard;
        }

        public void setIdCard(int idCard) {
            this.idCard = idCard;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Person(int idCard,String name) {
            this.idCard = idCard;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return this.idCard == person.idCard;
        }
    }

    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<Person, String>();
        Person person = new Person(1234,"乔峰");
        map.put(person,"天龙八部");
        System.out.println("结果："+map.get(new Person(1234,"乔峰")));
    }
}
