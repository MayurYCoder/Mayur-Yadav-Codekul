package string;

public class DuplicateElement {
    public static void main(String[] args) {
        String str1="aabcfdf";
        StringBuilder stringBuilder=new StringBuilder(str1);

        for (int i=0;i<stringBuilder.length();i++){
            for (int j=i+1;j<stringBuilder.length();j++){
                if (stringBuilder.charAt(i)==stringBuilder.charAt(j)){

                    stringBuilder.deleteCharAt(j);
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
