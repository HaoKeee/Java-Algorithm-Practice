public class Ch1_1_14 {
    public static void main(String[] args){
        System.out.println(lg(10));
    }
    public static int lg(int N){
        int a=0;
        while(N>=2){
            N=N/2;
            a++;
        }
        return a;
    }
}
