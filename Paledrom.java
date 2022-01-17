public class Paledrom {
    public static void main(String[] args) {
        String s1="123321";
        StringBuffer s2;
        s2 = new StringBuffer(s1);
        s2.reverse();
        System.out.println(s1+" "+s2);
        if(s1.equals(s2.toString())){
            System.out.println("It is a palindrome....");
        }else{
            System.out.printf("It is not a palindrome....");
        }
    }
}
