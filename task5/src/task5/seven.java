package task5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class seven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        while(true){
            int num = input.nextInt();
            if(num == 0) break;
            else list.add(num);
        }
        System.out.print(" Integers is: ");
        shuffle(list);
        list.forEach((jkl) -> {
            System.out.print(jkl + " ");
        });
    }
    public static void shuffle(ArrayList<Integer> list) {
        Integer xiabiao;
        int temp;
        Random rand = new Random();
        for(int i = 0;i<list.size();i++) {
            xiabiao = rand.nextInt(list.size());
            temp = list.get(i);
            list.set(i, list.get(xiabiao));
            list.set(xiabiao, temp);
        }
    }
}

