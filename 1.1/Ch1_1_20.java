public class Ch1_1_20 {
    public static void main(String[] args){
        System.out.println(lnNj(10));
        System.out.println(Math.log(1*2*3*4*5*6*7*8*9*10));
    }
    public static double factorial(int N){
        if (0==N || 1==N){
            return 1;
        }else{
            return N * factorial(N-1);
        }
    }
    public static double lnNj(int N){
        return Math.log(factorial(N));
    }
}
