/**Тапшырма-1
 * Бир өзүнүз каалаган класс түзүнүз анын поляларын толтуруп.
 *Mаанилерин сеттер менен  берип, маанисин геттер менен алыныз*/
public class Music {
    private String singer;
    private String [] genre;
    private double salary;
    public void setSinger(String singer){
        this.singer=singer;
    }
    public String getSinger(){
        return singer;
    }

    public void setGenre(String []genre){
        this.genre=genre;
    }
    public String []getGenre(){
        return genre;
    }
     public void setSalary (double salary){
        this.salary=salary;
     }
     public double getSalary (){
        return salary;
     }
}
