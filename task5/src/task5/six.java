package task5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
public class six {
    public static void main(String[] args) {
        ArrayList<Object> obj = new ArrayList<>();
        obj.add(new Date());
        obj.add("this is a string");
        for(Object tmp : obj){
            System.out.println(tmp.toString());
        }
    }
}
