package Assignments.Loops;
import java.util.*;

public class Alphabet_case_check { //Whether the first alphabet is uppercase or lowercase
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch>= 'a' && ch<= 'z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
        in.close();
    }
}
