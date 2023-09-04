package stack.bracketcheck;

public class Main {
    public static void main(String[] args) {
        BracketOperation bracketOperation = new BracketOperation("[{()}]");
        bracketOperation.validateBrackets();
    }
}
