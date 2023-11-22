public class PersonService {
    public String getNameUpperCase(Person person){
        return person.getNameUpperCase();
    }
//    public Person finPersonInDatabase(String name) throws Exception{
//        //if(cand connect to DB) {
//        // code to connect to DB
//        //} else {
//        //throw new Exception("Nu aveti dreptul sa va conectati la DB");
//        //}
//    }
    public int getMonthlySalary(Person person){
        return 12 / person.getSalariuAnual(); //ArithmeticException -> RuntimeException
    }
}
