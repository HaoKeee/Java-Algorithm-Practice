public class Ch1_1_13 {
    public static void main(String[] args){
        int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        printBooleanArr(arr);
    }
    //以整数数组为例
    public static void printBooleanArr(int[][] bool){
        for (int i=0; i<bool.length; i++){
            for (int j=0; j<bool[i].length; j++){
                System.out.print(bool[j][i] + " ");

                //  当一行打印完后换行
                if (j==bool[i].length-1){
                    System.out.print("\n");
                }
                    
            }
        }
    }
}