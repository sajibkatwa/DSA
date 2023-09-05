package stack.genericstack;

import java.util.Arrays;

public class Stack <T>{
    T[] stackArray;
    int top=-1;
    public Stack(int size){
        stackArray = (T[]) new Object[size];
    }
    public void push(T t){
        if(!isFull())
            stackArray[++top] = t;
        else
            System.out.println("Stack full");
    }
    public T pop(){
        T temp = stackArray[top];
        stackArray[top--] = null;
        return temp;
    }
    public T peek(){
        return stackArray[top];
    }
    public boolean isFull(){
        return top==stackArray.length-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    @Override
    public String toString(){
        return Arrays.toString(stackArray);
    }
}
