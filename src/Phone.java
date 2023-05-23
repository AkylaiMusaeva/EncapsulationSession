/**Тапшырма-3
 * 1. Contact деген класс тузунуз, полелери(contactName, phoneNumber).
 * 2. Phone деген класс тузунуз полелери:  brand, model, price, phonesUserName, contacts[])  (бренд, модель, баасы, телефондун колдонучусунун аты, контакттар[]).
 * 3. Phone класстын ичинде getContactCount(); метод болсун, ал метод телефондун колдонучусунун аты жана ушул телефондун ичинде канча контакт бар экенин санап кайтарып берет.
 * 4. main ден Contact класстын 4 , Phone класстын объекттерин 2 тузуп, маанилер мн толтуруп, тиби Phone болгон массив тузуп телефондорду ошол массивге салыныз.
 * 5. цикл дын жардамы мн массивдин ар бир элементине кайрылып, жанагы Phone класста тузулгон getContactCount(); чакырып алыныз.
 *  (Объектге маанилерди сеттер жардамы мн бериниз)*/
public class Phone {
    private String brand;
    private String model;
    private int price;
    private String phoneUsersName;
    private Contact[]contacts;
    public Phone(String brand,String model,int price,String phoneUsersName,Contact[]contacts){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.phoneUsersName=phoneUsersName;
        this.contacts=contacts;
    }
    public Phone(){

    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setPhoneUsersName(String phoneUsersName){
        this.phoneUsersName=phoneUsersName;
    }
    public String getPhoneUsersName(){
        return phoneUsersName;
    }
    public void setContacts(Contact[]contacts){
        this.contacts=contacts;
    }
    public Contact[] getContacts(){
        return contacts;
    }
    public String getContactCount(){
        System.out.printf(this.phoneUsersName+"-ушул телефондун ичинде %d контакт бар ",contacts.length);
        return null;
    }
}
