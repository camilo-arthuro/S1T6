package N1EX2;

import N1EX2.Classes.GenericMethods;
import N1EX2.Classes.Person;

public class Exercise2 {
    public static void runProgram(){
        //Variables
        Person person = new Person("Camilo","Delgado",29);
        Person person2 = new Person("Adrian","Kakuja",25);
        String message = "I study java";
        double year = 20.24;

        //Calling the GenericMethods
        GenericMethods.generic(person.getName(), message, year);
        System.out.println();
        GenericMethods.generic(year, message, person2);
    }
}
