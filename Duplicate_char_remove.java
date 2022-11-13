public class Duplicate_char_remove {
    public static void main(String[] args) {
        boolean flag=false;
        boolean start=false;
        String a="eechoo";
        String b="";
        for(int i=0;i<a.length();i++){
            int count=0;
            for(int j=0;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    count++;
                }
            }
            if(count>=2 && b.indexOf(a.charAt(i))<0){
                b+=a.charAt(i);
                System.out.println(a.charAt(i)+" repeated "+count+" times");
                flag=true;
            }
        }
        if(flag==false && start==false){
            System.out.println("no repeated element is found");
        }
    }
}
