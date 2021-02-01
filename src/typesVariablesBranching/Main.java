package typesVariablesBranching;

public class Main {
    public static void main(String[] args) {
        String sentence; //Uninitialized
        char letter = 'A';
        int 1number = 50; //Variable cannot start with number

        System.out.println("This is my sentence: " + sentence); //Uninitialized error
        System.out.println("This is my letter: " + letter);
        System.out.println("This is my number: " + 1number); //Syntax error
    }
}
