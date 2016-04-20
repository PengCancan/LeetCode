package Interview;

/**
 * Created by Shadow on 2016/4/13.
 */
public class AliSort {
    int[] hash = new int[100];
    void Print(int num[],int size){
        for(int i = 0;i < size;++i){
            hash[num[i]] = i+1;
        }
        boolean flag = true;
        int pre = 0;
        for(int i = 0;i < 100;i++){
            if(hash[i] != 0){
                if(flag){
                    System.out.print(i);
                    flag = false;
                    pre = i;
                }
                else if(hash[i] > hash[pre]){
                    System.out.println();
                    System.out.print(i);
                    pre = i;
                }
                else{
                    System.out.print("," + i);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AliSort as = new AliSort();
        int[] a = new int[]{11,13,22,15,34,15,15};
        as.Print(a,a.length);
    }
}
