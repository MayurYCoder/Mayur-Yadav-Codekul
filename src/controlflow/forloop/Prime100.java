package controlflow.forloop;

public class Prime100 {
    public static void main(String[] args) {
        int no;
        int result=0;

        for(no=1; no<=100;no++){
            for(int i=2; i<=no-1;i++){
                if(no%i==0){
                    result=result+1;
                }
            }
            if(result==0){
                System.out.println(no);
            }else{
                result=0;
            }

        }
    }
}
