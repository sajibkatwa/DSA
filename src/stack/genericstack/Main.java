package stack.genericstack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>(5);
        integerStack.push(5);
        integerStack.push(6);
        System.out.println(integerStack);
        System.out.println(integerStack.peek());
        System.out.println(integerStack.pop());
        System.out.println(integerStack);
        integerStack.pop();
        System.out.println(integerStack.isEmpty());

        Stack<String> stringStack = new Stack<>(3);
        stringStack.push("A");
        stringStack.push("S");
        System.out.println(stringStack);
        System.out.println(stringStack.pop());
        System.out.println(stringStack.peek());
        stringStack.push("X");
        stringStack.push("Y");
        System.out.println(stringStack);
        System.out.println(stringStack.isEmpty());
    }
}
