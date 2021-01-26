import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ch1_1_21 {
    public static void main(String[] args){
        ArrayList<String> list = getinput();
        printTable(list);
    }
    public static ArrayList<String> getinput(){
        ArrayList<String> list = new ArrayList<>();
        String temp;
        System.out.println("请输入姓名以及两个整数，姓名和不同整数间以空格分隔，每输入一行回车确认");
        System.out.println("单行为空行以结束输入");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()){
            temp=scan.nextLine();
            if (temp.equals("")) break;
            list.add(temp);
        }
        scan.close();
        return list;
    }
    public static void printTable(ArrayList<String> list){
        DecimalFormat df = new DecimalFormat("#.000");
        for (int i=0;i<list.size();i++){
            String[] arr = list.get(i).split("\\s+");
            System.out.print(arr[0] + " ");
            int num1 = Integer.parseInt(arr[1]);
            int num2 = Integer.parseInt(arr[2]);
            System.out.print(num1 + " ");
            System.out.print(num2 + " ");
            System.out.print(df.format((num1 * 1.0)/(num2 * 1.0)) + "\n");
        }
    }

}
