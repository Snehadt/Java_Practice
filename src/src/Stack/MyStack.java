package src.Stack;

import java.util.ArrayList;

public class MyStack {

    static ArrayList arr = new ArrayList() ;;
    /*int capacity;
    int top;

    MyStack(int cap){
        top = -1;
        capacity = cap;
        arr = new ArrayList() ;

    }*/

     static void pushStack(int data) {
      /*  if(top == capacity -1)
            throw new ArrayIndexOutOfBoundsException();
        top++;
        arr[top] = data;*/
arr.add(data);

    }

    static int pop(){
      /*  if(top == -1)
            throw new ArrayIndexOutOfBoundsException();
        int res = arr[top];
        top --;
        return res;*/

       int res = (int) arr.get(arr.size() -1);
       arr.remove(arr.size() -1);
       return res;
    }

    static int size(){
       // return top +1;

        return arr.size();
    }

    static boolean isEmpty(){
           // return top == -1;
        return arr.isEmpty();
    }

    static int peek() throws Exception {
       /* if(top == -1)
            throw new Exception();
        return arr[top];*/

       return (int) arr.get(size()-1);
    }
    public static void main(String[] args) throws Exception {

     //   MyStack st = new MyStack(5);
       pushStack(5);
        pushStack(10);
        pushStack(15);
        System.out.println(size());
        pop();
        pop();
        System.out.println(peek());
        System.out.println(isEmpty());
        pop();
        System.out.println(isEmpty());
    }


}
