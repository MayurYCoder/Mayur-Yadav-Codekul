package Multithreading;

public class Licence {
    public static void main(String[] args) throws InterruptedException {
        Medical medical=new Medical();
        medical.start();
        medical.join();

        Trial trial=new Trial();
        trial.start();
        trial.join();

        OfficerSign officerSign=new OfficerSign();
        officerSign.start();
        officerSign.join();
    }

}
class Medical extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Medical start");
            Thread.sleep(3000);
            System.out.println("Medical done");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class Trial extends Thread{
    @Override
    public void run() {

       try{
           System.out.println("trial start");
           Thread.sleep(3000);
           System.out.println("Trial complete");
       }catch (Exception e){

       }
    }
}
class OfficerSign extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Officer Take File");
            Thread.sleep(2000);
            System.out.println("Officer signed the document");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
