package Day9;

public class _1Day9 {
    /*
    * class RBI bank
    * getROI() : int 0
    *
    * class HDFC child of the RBIBank
    * override getROI() ; 8
    *
    * class SBI child of the RBI Bank
    * override getROI() : 7.5
    *
    * */
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        SBIBank sbiBank = new SBIBank();
        System.out.println(hdfc.getRateOfIntrest());
        System.out.println(sbiBank.getRateOfIntrest());
    }
}

class Rbi{


    int getRateOfIntrest(){
        return 0;
    }
}
class HDFC extends Rbi{
    @Override
    int getRateOfIntrest(){
        return 8;
    }
}
class SBIBank extends Rbi{
    @Override
    int getRateOfIntrest(){
        return (int) 7.5;
    }
}

