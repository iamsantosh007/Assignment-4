public class Palindrome {
    public static void main(String[] args) {
        int a=2552;
        int temp=a;
        int sum=0;
        while(temp>0){
            int remainder=temp%10;
            sum=(sum*10)+remainder;
            temp=temp/10;
        }
        if(sum==a){
            System.out.println("Palindrome number");
        }else{
            System.out.println("mot a palindrome number");
        }
    }
}
