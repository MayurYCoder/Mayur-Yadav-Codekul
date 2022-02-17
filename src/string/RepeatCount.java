package string;

public class RepeatCount {
    public static void main(String[] args) {
        String str="aabcgg";
        int count=0;

        for (int i=0;i<=str.length()-1;i++){
            for (int j=i+1;j<str.length();j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count = count + 1;

                }
            }
            System.out.println(str.charAt(i)+"-"+count);
        }
    }
}
