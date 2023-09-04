package stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(6);
        stack.push(4);
        stack.push(9);
        stack.push(11);
        stack.push(2);
        stack.push(8);
        stack.print();

        System.out.println("Popped "+stack.pop());
        System.out.println("Popped "+stack.pop());
        stack.print();
        System.out.println("Peek "+stack.peek());
        System.out.println("is empty "+stack.isEmpty());

    }
}
