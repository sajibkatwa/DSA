package stack;

import array.DisplayArray;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top = -1;
    public Stack(int maxSize){
        this.stackArray = new int[maxSize];
        this.maxSize = maxSize;
    }
    public void push(int n){
        if(!isFull())
            this.stackArray[++this.top] = n;
        else
            System.out.println("Stack full, can't push "+n);
    }
    public int pop(){
        int temp = stackArray[this.top];
        stackArray[this.top--] = 0;
        return temp;
    }
    public int peek(){
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
