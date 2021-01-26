import java.util.Scanner;

public class Ch1_1_3 {
    public static void main(String args[]){
        int[] arr = new int[3];
        System.out.println("请输入三个整数，每输入一个数回车确认");
        Scanner scan = new Scanner(System.in);
        for(int x=0; x<arr.length; x++){
            arr[x] = scan.nextInt();
        }
        scan.close();
        if (arr[0]==arr[1] && arr[0]==arr[2]){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}