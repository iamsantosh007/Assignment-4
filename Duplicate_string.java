import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate_string {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the String:-");
        String a=sc.nextLine();
        String b="";
        for(int i=0;i< a.length();i++){
            int count=0;
            for(int j=0;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    count++;
                }
            }
            if(count>=2){
                b+=" ";
            }else{
                b+=a.charAt(i);
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
