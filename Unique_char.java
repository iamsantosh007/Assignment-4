public class Unique_char {
    public static void main(String[] args) {
        String s1="minaksh";
        boolean flag=false;
        for(int i=0;i<s1.length();i++){
            int count=0;
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    count++;
                }
            }
            if(count>=2){
                System.out.println("Having not unique character in String");
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Unique character String");
        }

    }
}
