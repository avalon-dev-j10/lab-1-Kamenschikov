package ru.avalon.java.dev.j10.labs.commons;

/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */

public class Address {
    private String country;     // страна
    private int index;          // индекс, может отсутствовать
    private String area;        // область
    private String district;    // район
    private String city;        // город
    private String street;      // улица
    private String number;      // № дома
    private int caseHouse;      // № корпуса дома, может отсутствовать
    private int apartment;      // № квартиры, может отсутствовать

    public String getCountry() {
        return country;
    }

    public int getIndex() {
        return index;
    }

    public String getArea() {
        return area;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public int getCaseHouse() {
        return caseHouse;
    }

    public int getApartment() {
        return apartment;
    }

    // Конструктор без индекса и № корпуса
    public Address(String country, String area, String district, String city, String street, String number, int apartment) {
        this(country, 0, area, district, city, street, number, 0, apartment);
    }
    
    // Конструктор без № корпуса
    public Address(String country, int index, String area, String district, String city, String street, String number, int apartment) {
        this(country, index, area, district, city, street, number, 0, apartment);
    }
    
    // конструктор без индекса
    public Address(String country, String area, String district, String city, String street, String number, int caseHouse, int apartment) {
        this(country, 0, area, district, city, street, number, caseHouse, apartment);
    }
    
    // конструктор со всеми параметрами
    public Address(String country, int index, String area, String district, String city, String street, String number, int caseHouse, int apartment) {
        this.country = country;
        this.index = index;
        this.area = area;
        this.district = district;
        this.city = city;
        this.street = street;
        this.number = number;
        this.caseHouse = caseHouse;
        this.apartment = apartment;
    }
    
    
    
}