package task5;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class nine {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int num = input.nextInt();
        System.out.println("The random array is");
        Integer row = 0;
        Integer column = 0;
        Integer row_Max = 0;  //����������м���1
        Integer column_Max = 0; //����������м���1
        int[][] array = new int[num][num];
        Random rand = new Random();    //��ɳ�ʼ��������Max��¼�С��������������м���1
        for (int[] array1 : array) {
            for (int j = 0; j < array[0].length; j++) {
                int randInt = rand.nextInt(2);
                array1[j] = randInt;
                System.out.print(array1[j] + " ");
                if(randInt == 1) row++; //��1�� �����ۼ���
            }
            if(row > row_Max)
                row_Max = row;  //�洢����������м���1
//����
            row = 0;
            System.out.println();
        }
        for(int i = 0;i < array.length;i++) {
            for(int j = 0;j < array[0].length;j++) {
                if(array[j][i] == 1) column++;
            }
         //��1�������ۼ���
        if(column > column_Max)
            column_Max = column;
        column = 0;
        }
        for(int i= 0;i < array.length;i++) {
            for(int j = 0;j < array[0].length;j++) {
                if(array[i][j] == 1) row++;
        if(array[j][i] == 1) column++;
            }
            if(     Objects.equals(row, row_Max))
                list1.add(i);
            if(     Objects.equals(column, column_Max))
                list2.add(i);
            row = 0;
            column = 0;
        }
        System.out.print("The largest row index: ");
        list1.forEach(( a) -> {
            System.out.print(a + " ");
        });
        System.out.print('\n'+"The largest coulmn index: ");
        list2.forEach((b) -> {
            System.out.print(b + " ");
        });
    }
}

