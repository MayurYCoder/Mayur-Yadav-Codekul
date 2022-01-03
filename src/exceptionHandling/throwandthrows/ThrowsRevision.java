package exceptionHandling.throwandthrows;

public class ThrowsRevision {
    void m() throws Exception {
        throw new Exception("divice error");
    }
    void p() throws Exception {
        m();
    }
    void n(){
        try {
            p();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThrowsRevision obj=new ThrowsRevision();
        obj.n();
        System.out.println("throws with propogation");
    }
}
