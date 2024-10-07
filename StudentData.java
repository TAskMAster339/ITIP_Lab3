import java.util.HashMap;
public class StudentData {
    HashMap<String, Student> data = new HashMap<>();

    public void add(String book, Student student) {
        data.put(book, student);
    }
    public Student get(String book) {
        return data.get(book);
    }
    public void remove(String book) {
        data.remove(book);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StudentData\n");
        for (var key : data.keySet()){
            sb.append("Key: " + key + " | Value: " + data.get(key) + '\n');
        }
        return sb.toString();
    }
}
class Student{

    private String name;
    private String surname;
    private int age;
    private double averageMark;

    public Student(String name, String surname, int age, double averageMark){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageMark = averageMark;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getAverageMark(){
        return averageMark;
    }
    public void setAverageMark(double averageMark){
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Студент " + getName() + " " + getSurname() + ", " + getAge() + " лет, средняя оценка - " + getAverageMark();
    }
}