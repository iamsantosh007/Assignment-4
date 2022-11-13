import java.util.Scanner;

public class Maximum_occuring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:-");
        String s1=sc.nextLine();
        int max=0;
        char c='_';
        for(int i=0;i<s1.length();i++){
            int count=0;
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    count++;
                }
            }
            if((count)>max){
                c=s1.charAt(i);
                max=count;
            }

        }
        System.out.println("The char "+c+" repeated "+max+" times");
    }
}
