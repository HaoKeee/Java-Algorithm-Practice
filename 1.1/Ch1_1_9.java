public class Ch1_1_9 {
    public static void main(String[] args){
        int N=999;
        toBinaryString(N);
    }
    public static String toBinaryString(int N){
        String s="";
        for (int n=N; n>0; n/=2) s=(n%2)+s;
        System.out.println(s);
        return s;
    }
}