import java.util.Arrays;
import java.util.Scanner;

/** Тапшырма-4
 * 1) Эки класс тузунуз
 * Apartment (title, price, address)
 * Квартира( название, цена, адрес)
 * Student ( fullName, phoneNumber, address, bankAccount)
 * Студент (ФИО, номер телефона,  адрес, банковский счет)
 * 2) Apartment классына 2 обьект, Student классына
 6 обьект
 тузуп, алардын полелерин толтурунуз.
 * (бир квартиранын жана 3 студенттин адрестери окшош болсун, экинчи квартиранын жана  калган 3 студенттердин адрестери окшош болсун)
 * 3)Студентерди озунчо массивге, квартираларды озунчо массивге салыныз.
 * 4)Консольдон квартиранын адресин берсениз, ошол квартираны жана анда жашаган студенттерди консольго чыгарып берсин,
 * ошол квартираны жана анда жашаган студенттерди консольго чыгара турган  метод тузунуз
 * 5)Квартира классынын ичинде бир payPerMonth(Student[] students); деген методу болсун,
 * ал метод ар бир студенке канча сомдон квартплата беруусун чыгарсын.
 * 6)Студент классынын ичинде бир liveIn(Apartment apartment, Student[] students); деген метод болсун,
 * ал метод студенттин капчыгына жараша ал квартирада канча ай жашай алуусун чыгарсын.
 * 7)Студент классында дагы бир changeInfo(); деген метод болсун ал метод студенттин данныйларын озгортуп берсин*/
public class Apartment {
    Scanner scanner = new Scanner(System.in);
    private String title;
    private int price;
    private String address;
    private Student[] students;

    public Apartment(String title, int price, String address) {
        this.title = title;
        this.price = price;
        this.address = address;
    }

    public Apartment() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public String payPerMonth(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getFullName() + " pays per month -> " + this.price);
        }
        return null;
    }

}
