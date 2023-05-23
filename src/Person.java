/** Тапшырма-2 Person деген класс тузунуз(fullName, age, email, salary) деген полелери болсун.
 * main ден  setter дин жардамы мн маанилерди бериниз,
 * маанилерин берип жатканда жашы деген полеге терс сан же 0 берсе болбойт,
 * email деген полеге маани берип жатканда '@'  символ болбосо,
 * берилген маанини албаш керек жана salary полеге берилген маани 500 дон аз болсо, объект ал маани дагы албаш керек.
 (маанилердин баарын консолдон бериниз, setter'дин ичине логика жазыныныз)*/
public class Person {
    private String fullName;
    private int age;
    private String email;
    private double salary;
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public String getFullName(){
        return fullName;
    }

    public void setAge(int age){
        if(age>0){
        this.age=age;
    }else{
            System.out.println("Input correct age");
        }
    }
    public int getAge(){
        return age;
    }
    public void setEmail(String email){
        if(!email.contains("@")){
            System.out.println("Input correct email,including -@- ");
        }else{
            this.email=email;
        }
    }
    public String getEmail(){
        return email;
    }
    public void setSalary(double salary){
        if(salary>500){
            this.salary=salary;
        }else{
            System.out.println("Salary can't be less than 500");
        }
    }
    public double getSalary(){
        return salary;
    }
}
