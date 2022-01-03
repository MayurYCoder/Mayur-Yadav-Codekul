package assignments;

public class Assignment83 {
    public static void main(String[] args) {
        String  str="ABCADSA";
        
        int count=0;
        for (int i=0;i<str.length()-1;i++){
            for (int j=i+1;j<str.length();j++){
                if ((str.charAt(i))==(str.charAt(j))){

                    count=count+1;
                }
            }
        }
        System.out.println(count);
    }
}
