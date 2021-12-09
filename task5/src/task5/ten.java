package task5;


import java.util.Scanner;
import java.util.ArrayList;
public class ten {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integers : ");
        int value;
        for(int i=0;i<5;i++){
            value =in.nextInt();
            stack.add(value);
        }
        System.out.println(stack.toString() + "\n" + "µ¹ÐòÎª£º "+
                stack.pop() + " " + stack.pop()+ " "+stack.pop()+ " "+stack.pop()+" "+  stack.pop());
    }
}
    class MyStack extends ArrayList{
        @Override
        public boolean isEmpty(){
            return super.isEmpty();
        }
        public int getSize(){
            return super.size();
        }
        public Object peek(){
            return super.get(super.size()-1);
        }
        public Object pop(){
            Object o = super.get(super.size()-1);
            super.remove(super.size()-1);
            return o;
        }
        public void push(Object o){
            super.add(o);
        }
        @Override
        public String toString(){
            return "stack: " + super.toString();
        }
    }
