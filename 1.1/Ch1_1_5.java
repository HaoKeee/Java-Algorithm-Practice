public class Ch1_1_5 {
    public static void main(String[] args){
        double x=0.123,y=0.5678912;
        if(check(x) && check(y)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static boolean check(double x){
        if(x>0.0 && x<1.0){
            return true;
        }else{
            return false;
        }
    }
}