import java.util.Scanner;

public class Vowel_consonent {
    public static boolean isvowel(char c) {
        if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u'){
            return true;
        }
        return false;
    }
    public static boolean isspecial(char c){
        if(c>='a' && c<='z'){

        }else{
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string you want to count:-");
        String value=sc.nextLine();
        String str = value.toLowerCase();
        String vowels = "aeiou";
        String user_Defined_String = str.toLowerCase();
        int count = 0;
        int consonent = 0;
        int special=0;
        for(int i=0;i<str.length();i++){
            if(isvowel(str.charAt(i))){
                count++;
            }else if(!isvowel(str.charAt(i)) && !isspecial(str.charAt(i))){
                consonent++;
            }else if(!isvowel(str.charAt(i)) && isspecial(str.charAt(i))){
                special++;
            }
        }

        System.out.println(" vowels are "+count+" consonent "+consonent+" special char is "+special);
    }
}
