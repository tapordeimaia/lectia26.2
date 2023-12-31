import java.util.List;

public class Person {
    private int age;
    List<String> skills; //null
    String name; //null.toUpperCase() -> NullPointerException
    Integer salariuAnual = 0;
    public void setAge(int age){
        if(age<0){
            throw new PersonSetAgeException("Nu poti seta varsta negativa.");
        }
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public boolean hasName(String name){
        return this.name.equals(name);
    }
    public String getNameUpperCase() {
        if(this.name==null){
            throw new RuntimeException("Numele nu este setat");
        }
        return this.name.toUpperCase();
    }
    public boolean hasSkill(String skillName){
        return skills.contains(skillName);
    }
    public int getSalariuAnual(){
        return salariuAnual;
    }
}
