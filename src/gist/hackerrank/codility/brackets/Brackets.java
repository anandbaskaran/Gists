package gist.hackerrank.codility.brackets;
import java.util.Stack;

class Brackets {
    int solution(String s){
        Stack<Character> brackets = new Stack<>();
        try {
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case '(':
                    case '{':
                    case '[':
                        brackets.add(s.charAt(i));
                        break;
                    case ')':
                        if (brackets.peek().equals('(')) {
                            brackets.pop();
                        } else {
                            brackets.add(s.charAt(i));
                        }
                        break;
                    case '}':
                        if (brackets.peek().equals('{')) {
                            brackets.pop();
                        } else {
                            brackets.add(s.charAt(i));
                        }
                        break;
                    case ']':
                        if (brackets.peek().equals('[')) {
                            brackets.pop();
                        } else {
                            brackets.add(s.charAt(i));
                        }
                        break;
                    default:
                        System.out.println("INVALID");
                }
            }

            if (brackets.isEmpty()) {
                return 1;
            }
            return 0;
        } catch (Exception e){
            return 0;
        }

    }
}
