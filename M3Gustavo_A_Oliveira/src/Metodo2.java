import java.util.Stack;

public class Metodo2 {

    public boolean checkBrackets(Stack<Character> s1) {
        Stack<Character> s2 = new Stack<Character>(); 
        int count = 0; 

       
        while (!s1.isEmpty()) {
            char c = s1.pop();
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            } else {
                s2.push(c);
            }
        }

        if (count != 0) {
            return false;
        }

        while (!s2.isEmpty()) {
            char c = s2.pop();
            if (c == ')') {
                count++;
            } else if (c == '(') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }

        if (count != 0) {
            return false;
        }

        return true;
    }

    public int[] interleaveArrays(int[] arr1, int[] arr2) {
        return null;
    }
}

