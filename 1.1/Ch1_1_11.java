public class Ch1_1_11 {
    public static void main(String[] args){
        Boolean[][] bool = {{true, false, true},{false, false, true},{true, true, false}};
        printBooleanArr(bool);
    }
    public static void printBooleanArr(Boolean[][] bool){

        // 打印列序号
        System.out.print("  ");
        for (int i=0; i<bool[0].length; i++) System.out.print(i);
        System.out.print("\n");

        for (int i=0; i<bool.length; i++){
            System.out.print(i);  //打印行序号
            System.out.print(" ");
            for (int j=0; j<bool[i].length; j++){
                if (bool[i][j]){
                    System.out.print("*");
                }  
                else{
                    System.out.print(" ");
                }
                //  当一行打印完后换行
                if (j==bool[i].length-1){
                    System.out.print("\n");
                }
                    
            }
        }
    }
}