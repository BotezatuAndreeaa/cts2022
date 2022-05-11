package cts.main;

import cts.clase.adapter.Adapter;
import cts.clasevalidatorSubteran.ValidatorMetrou;
import cts.clasevalidatorSubteran.ValidatorSubteran;
import cts.clasevalidatorTerestru.ValidatorAutobuz;
import cts.clasevalidatorTerestru.ValidatorTerestru;

public class Main {

    public static void valideazaBilet(ValidatorTerestru validatorTerestru){
        validatorTerestru.valideazaBilet();
    }

    public static void main(String[] args) {
        ValidatorSubteran validatorMetrou= new ValidatorMetrou();
        ValidatorTerestru validatorAutobuz= new ValidatorAutobuz();

        valideazaBilet(validatorAutobuz);
        //valideazaBilet(validatorMetrou);

        Adapter adapter = new Adapter(validatorMetrou);
        valideazaBilet(adapter);
    }
}
