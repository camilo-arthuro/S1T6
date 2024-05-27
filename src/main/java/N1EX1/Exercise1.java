package N1EX1;

public class Exercise1 {
    public static void runProgram(){
        NoGenericMethods[] list = new NoGenericMethods[3];
        list[0] = new NoGenericMethods(10,20,30);
        list[1] = new NoGenericMethods(20,30,10);
        list[2] = new NoGenericMethods(30,10,20);

        for (NoGenericMethods object : list){
            System.out.println(object);
        }
    }
}
