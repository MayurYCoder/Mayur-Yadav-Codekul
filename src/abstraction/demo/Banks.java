package abstraction.demo;

public abstract class Banks {
    abstract int getrateOfIntrest();
}

class SBI extends Banks {

    @Override
    int getrateOfIntrest() {
        return 5;
    }
}

class ICICI extends Banks {

    @Override
    int getrateOfIntrest() {
        return 7;
    }
}

class RBI {
    public static void main(String[] args) {
        Banks banks=new SBI();
        System.out.println("SBI rate of intrest=>"+banks.getrateOfIntrest());
        Banks banks1=new ICICI();
        System.out.println("ICICI rate of intrest=>"+banks1.getrateOfIntrest());

    }
}
