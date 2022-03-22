package com.java.assignment;

public class R_B_I {

    float getInterestRate(){
        return 7;
    }
}

class S_B_I extends R_B_I{
    @Override
    float getInterestRate() {
        return 7.5F;
    }
}
class Axis extends R_B_I{
    @Override
    float getInterestRate() {
        return 8;
    }
}
class ICICI extends R_B_I{
    @Override
    float getInterestRate() {
        return 8.5F;
    }
}

class Main extends R_B_I
{

    public static void main(String[] args)

    {
        R_B_I ob = new R_B_I();
        System.out.print("The Interest Rate of RBI: ");

        System.out.println(ob.getInterestRate());


        S_B_I ob1 = new S_B_I();
        System.out.print("The Interest Rate of SBI: ");

        System.out.println(ob1.getInterestRate());


        Axis ob3 = new Axis();
        System.out.print("The Interest Rate of Axis: ");

        System.out.println(ob3.getInterestRate());


        ICICI ob2 = new ICICI();
        System.out.print("The Interest Rate of ICICI: ");

        System.out.println(ob2.getInterestRate());

    }
}
