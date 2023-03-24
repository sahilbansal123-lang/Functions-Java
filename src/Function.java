import java.util.Scanner;

public class Function {

//        syntax: ReturnType functionName(Type Args1, args2, ....){
//        // Operation
//        }

//        Return type: int float string array
//                Void: A return type of a function which is not returning anything
//        Function name: must be unique that are not previously stored in the java.

    public static void printMyName(String name){
        // declaration
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printMyName(name);   // Function calling
    }


}