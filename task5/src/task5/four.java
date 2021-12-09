package task5;


import java.util.ArrayList;
import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;
        do{
            value = sc.nextInt();
            if(!list.contains(value)&&value!=0){
                list.add(value);
            }
        }while(value!=0);
        System.out.println("The max Integer is : "+max(list));
    }
    public static Integer max(ArrayList<Integer> list){
        if(list.size()==0){
            return null;
        }
        int i=list.get(0);
        for (Integer integer : list) {
            i=i>integer?i:integer;
        }
        return i;
    }
}

