public class Ch1_1_15 {
    public static void main(String[] args){
        int[] result,a={2,3,4,3,2,3,4,1,5,5,3,3,2,4,1};
        result = histogram(a, 5);
        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
    public static int[] histogram(int[] a, int M){
        int[] result = new int[M];
        for (int i=0;i<M;i++){
            int count=0;
            for (int j=0;j<a.length;j++){
                if (a[j]==i){ //根据最后的限制条件知第i个元素的计数从0开始
                    count++;
                }
            }
            result[i]=count;
        }
        return result;
    }
}
