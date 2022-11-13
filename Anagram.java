import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string 1:-");
        String s1=sc.nextLine();
        System.out.print("enter the string 2:-");
        String s2=sc.nextLine();
        boolean b=false;
        boolean c=true;
        if(s1.length()!=s2.length()){
            System.out.println("not anagram");
        }else{
            for(int i=0;i<s1.length();i++){
                int count=0;
                for(int j=0;j<s2.length();j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                        count++;
                    }
                }
                if(count>=1){
                    b=true;
                }else{
                    c=false;
                }
            }
            if(b && c){
                System.out.println("anagram");
            }else if(b && !c){
                System.out.println("not anagram");
            }
        }
    }
}
