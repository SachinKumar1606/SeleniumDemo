public class Pattren13 {
    public static void main(String[] args) {
        int n=5;
        int num=5;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(num);
                num++;
            }
            num=5;
            num=num-i;
            System.out.println();
        }
    }
}
