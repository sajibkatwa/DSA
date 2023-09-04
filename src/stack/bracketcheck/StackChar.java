package stack.bracketcheck;

import array.DisplayArray;

public class StackChar {
    private int maxSize;
    private char[] stackArray;
    private int top = -1;
    public StackChar(int maxSize){
        this.stackArray = new char[maxSize];
        this.maxSize = maxSize;
    }
    public void push(char c){
        if(!isFull())
            this.stackArray[++this.top] = c;
        else
            System.out.println("Stack full, can't push "+c);
    }
    public char pop(){
        char temp = stackArray[this.top];
        stackArray[this.top--] = 0;
        return temp;
    }
    public char peek(){
        return this.stackArray[this.top];
    }
    public boolean isEmpty(){
        return this.top == -1;
    }
    public boolean isFull(){
        return this.top == this.maxSize-1;
    }
    public void print(){
        DisplayArray.printReverse(this.stackArray);
    }
}
