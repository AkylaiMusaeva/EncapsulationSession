/**Тапшырма-3
 * 1. Contact деген класс тузунуз, полелери(contactName, phoneNumber).
 * 2. Phone деген класс тузунуз полелери:  brand, model, price, phonesUserName, contacts[])  (бренд, модель, баасы, телефондун колдонучусунун аты, контакттар[]).
 * 3. Phone класстын ичинде getContactCount(); метод болсун, ал метод телефондун колдонучусунун аты жана ушул телефондун ичинде канча контакт бар экенин санап кайтарып берет.
 * 4. main ден Contact класстын 4 , Phone класстын объекттерин 2 тузуп, маанилер мн толтуруп, тиби Phone болгон массив тузуп телефондорду ошол массивге салыныз.
 * 5. цикл дын жардамы мн массивдин ар бир элементине кайрылып, жанагы Phone класста тузулгон getContactCount(); чакырып алыныз.
 *  (Объектге маанилерди сеттер жардамы мн бериниз)*/
public class Contact {
    private String contactName;
    private long phoneNumber;

    public Contact(String contactName,long phoneNumber){
        this.contactName=contactName;
        this.phoneNumber=phoneNumber;
    }
    public Contact(){
    }
    public void setContactName(String contactName){
        this.contactName=contactName;
    }
    public String getContactName(){
        return contactName;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }

}
