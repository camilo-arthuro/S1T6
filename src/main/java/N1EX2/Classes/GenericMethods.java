package N1EX2.Classes;

public class GenericMethods <T, U , V>{

    public static <T, U, V> void generic(T argument1, U argument2, V argument3){
        System.out.println(argument1 + " I print the T argument");
        System.out.println(argument2 + " I print the U argument");
        System.out.println(argument3 + " I print the V argument");
    }
}
