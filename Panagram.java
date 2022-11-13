import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string to panagram check:-");
        String x=sc.nextLine();
        String s1=x.toLowerCase();
        int size=26;
        for(char c='a';c<='z';c++){
            int count=0;
            for(int i=0;i<s1.length();i++){
                if(c==s1.charAt(i)){
                    count++;
                }
            }
            if(count>=1){
                size-=1;
            }
        }
        if(size>=1){
            System.out.println("The above String is not panagram");
        }else{
            System.out.println("The above String is panagram");
        }
    }
}
