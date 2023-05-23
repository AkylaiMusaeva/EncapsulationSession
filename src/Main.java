import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**Тапшырма-1*/
//       Music music=new Music();
//       music.setSinger("Asan");
//       music.setGenre(new String[]{"pop","soul","hip/hop","jazz","break"});
//       music.setSalary(10.5);
//        System.out.println(music.getSinger());
//        System.out.println(Arrays.toString(music.getGenre()));
//        System.out.println(music.getSalary());
//
//        Music music1=new Music ();
//        music1.setSinger("\nUson");
//        music1.setGenre(new String []{"opera","classic"});
//        music1.setSalary(20.6);
//        System.out.println(music1.getSinger());
//        System.out.println(Arrays.toString(music1.getGenre()));
//        System.out.println(music1.getSalary());


        /**Тапшырма-2*/
//        Person person=new Person();
//        System.out.println("Input full name: ");
//        String name=scanner.nextLine();
//        person.setFullName(name);
//
//        System.out.println("Input person's age: ");
//        int age=scanner.nextInt();
//        person.setAge(age);
//        System.out.println("Input email: ");
//        Scanner scanner1=new Scanner(System.in);
//        person.setEmail(scanner1.nextLine());
//
//        System.out.println("Input salary: ");
//        person.setSalary(scanner1.nextDouble());

//        System.out.println(person.getFullName());
//        System.out.println(person.getAge());
//        System.out.println(person.getEmail());
//        System.out.println(person.getSalary());

        /**Тапшырма-3*/
//        Contact contact=new Contact("Asan",702790266);
//        Contact contact1=new Contact("Uson",773543669);
//        Contact contact2=new Contact("Asel",774365412);
//        Contact contact3=new Contact("Asyl",552312141);
//
//        Phone phone =new Phone("Apple","IPhone12",1200,"Marat",new Contact[]{contact,contact1});
//        Phone phone1 =new Phone ("Samsung","Galaxy5",1000,"Aijan",new Contact[]{contact2,contact3});
//
//        Phone[]array={phone,phone1};
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i].getContactCount());
//        }

        /**Тапшырма-4*/
        /*Apartment apartment1=new Apartment("EliteHouse",30000,"Bokonbaev 186");
        Apartment apartment2=new Apartment("Ihlas",45000,"Moskovskaya 51");

        Student student1=new Student("Azamat",773543669,apartment1,60000);
        Student student2=new Student("Nuriza",778507189,apartment1,30000);
        Student student3=new Student("Gulmira",556478974,apartment1,120000);

        Student student4=new Student("Aichurok",776542515,apartment2,45000);
        Student student5=new Student("Kanyshai",778030127,apartment2,90000);
        Student student6=new Student("Kumarbek",552488012,apartment2,60000);

        Apartment[]apartments={apartment1,apartment2};
        Student []students={student1,student2,student3,student4,student5,student6};


        System.out.println("Input address: ");
        String address=scanner.nextLine();
        if(address.equals("Bokonbaev 186")){
                System.out.println(apartment1.getTitle()+": "+student1.getFullName()+","+student2.getFullName()+","+student3.getFullName());
            }else if(address.equals("Moskovskaya 51")){
            System.out.println(apartment2.getTitle()+": "+student4.getFullName()+","+student5.getFullName()+","+student6.getFullName());
        }else {
            System.out.println("Wrong address");
        }

        System.out.println("----------------------------------");

            System.out.println(apartment1.payPerMonth(new Student[]{student1,student2,student3}));
            System.out.println(apartment2.payPerMonth(new Student[]{student4,student5,student6}));

        System.out.println("----------------------------------");

        System.out.println(student1.liveIn(apartment1,new Student[]{student1}));
        System.out.println(student2.liveIn(apartment1,new Student[]{student2}));
        System.out.println(student3.liveIn(apartment1,new Student[]{student3}));
        System.out.println(student4.liveIn(apartment2,new Student[]{student4}));
        System.out.println(student5.liveIn(apartment2,new Student[]{student5}));
        System.out.println(student6.liveIn(apartment2,new Student[]{student6}));

        System.out.println("----------------------------------");
        System.out.println("New information");

        System.out.println(student1.changeInfo("Tamara ", 776548785, " Toktogul87 ", 55000));
        System.out.println(student2.changeInfo("Anara ", 776454785, " Kievskaya14 ", 100000));
        System.out.println(student3.changeInfo("Aziz ", 708975698, " Chuy45 ", 100000));
        System.out.println(student4.changeInfo("Umar ", 553546985, " Ahunbaeva26 ", 55000));
        System.out.println(student5.changeInfo("Denis ", 776446655, " Abdrahmanov156 ", 87000));
        System.out.println(student6.changeInfo("Uson ", 776545685, " Toktogul286 ", 200000));
        */

        /**Тапшырма-5*/
         Word word=new Word(new String[]{"dohod","konok","apa"});
         System.out.println(Arrays.toString(word.getPolindrom()));
         System.out.println("------------------------------------");
         System.out.println("Новый массив слов после замены ");
         System.out.println(Arrays.toString(word.newArray(new String[]{"dohod", "konok", "apa"})));
         System.out.println("------------------------------------");
         System.out.println(Arrays.toString(word.getAllArray()));


        System.out.println(word.isPolyndrome(new String[]{"konok","dohod"})? "PALINDROME":"NOT PALINDROME");


    }











}