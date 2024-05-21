package N1EX1;

public class Exercise1 {
    public static void runProgram(){
        NoGenericMethods[] list = new NoGenericMethods[3];
        list[0] = new NoGenericMethods(1,1.0,"First");
        list[1] = new NoGenericMethods(2.0,"Second",2);
        list[2] = new NoGenericMethods("Third",3,3.0);

        for (NoGenericMethods object : list){
            System.out.println(object);
        }
    }
}
