import java.util.Scanner;

/** Тапшырма-4
 * 1) Эки класс тузунуз
 * Apartment (title, price, address)
 * Квартира( название, цена, адрес)
 * Student ( fullName, phoneNumber, address, bankAccount)
 * Студент (ФИО, номер телефона, адрес, банковский счет)
 * 2) Apartment классына 2 обьект, Student классына
 6 обьект
 тузуп, алардын полелерин толтурунуз.
 * (бир квартиранын жана 3 студенттин адрестери окшош болсун, экинчи квартиранын жана  калган 3 студенттердин адрестери окшош болсун)
 * 3)Студентерди озунчо массивге, квартираларды озунчо массивге салыныз.
 * 4)Консольдон квартиранын адресин берсениз, ошол квартираны жана анда жашаган студенттерди консольго чыгарып берсин,
 * ошол квартираны жана анда жашаган студенттерди консольго чыгара турганара турган  метод тузунуз
 * 5)Квартира классынын ичинде бир payPerMonth(Student[] students); деген методу болсун, ал метод ар бир студенке канча сомдон квартплата беруусун чыгарсын.
 * 6)Студент классынын ичинде бир liveIn(Apartment apartment, Student[] students); деген метод болсун,
 * ал метод студенттин капчыгына жараша ал квартирада канча ай жашай алуусун чыгарсын.
 * 7)Студент классында дагы бир changeInfo(); деген метод болсун ал метод студенттин данныйларын озгортуп берсин*/
public class Student {
    private String fullName;
    private long phoneNumber;
    private String address;
    private int bankAccount;
    private Apartment apartment;

    public Student(String fullName, long phoneNumber, Apartment address, int bankAccount) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        apartment = address;
        this.bankAccount = bankAccount;
    }

    public Student() {

    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public int liveIn(Apartment apartment, Student[] students) {
        int payment = this.bankAccount / apartment.getPrice();
        for (int i = 0; i < students.length; i++) {
            System.out.printf(students[i].getFullName() + " can pay for %d month(s)", payment);
        }
        return 0;
    }
        public String changeInfo(String newFullName, long newPhoneNumber, String newAddress, int newBankAccount){
            this.fullName=newFullName;
            this.phoneNumber=newPhoneNumber;
            this.address=newAddress;
            this.bankAccount=newBankAccount;
            return newFullName+newPhoneNumber+newAddress+newBankAccount;
        }

}