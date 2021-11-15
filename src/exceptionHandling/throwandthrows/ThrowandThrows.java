package exceptionHandling.throwandthrows;

public class ThrowandThrows {
    public static void main(String[] args) throws Exception{
        int age=17;
        if (age<=18){
            throw new Exception("you can't vote");
        }else{
            System.out.println("you can vote");
        }
        System.out.println("hii");
    }
}



/*                 Throw.                                         Thrown.
1.Throw is used to throw Exception          1.Thrown is used to declare the exception.
2.Throw is used in the method               2.thrown is used in the method signature.
3.you can throw only one exception at time. 3.you can declare multiple exception.
4.throw is followed by instance             4.throws is followed by class





 */