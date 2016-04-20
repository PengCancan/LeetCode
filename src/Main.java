import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().isHappy(7));
    }

    public boolean isHappy(int num){

        HashSet<Integer> hs = new HashSet<>();
        while(true){
            int m = num / 10;
            int n = num % 10;
            int sum = 0;
            while (m > 0) {
                sum += n * n;
                n = m % 10;
                m = m / 10;
            }
            sum = sum + n * n;
            num = sum;
            if(sum == 1){
                return true;
            }else if(hs.contains(sum)){
                return false;
            }else{
                hs.add(sum);
            }
        }
    }
}
