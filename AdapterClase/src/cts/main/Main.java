package cts.main;


import cts.clase.adapter.*;
import cts.clase.validatorSubteran.*;
import cts.clase.validatorTerestru.*;

public class Main {
    public static void main(String[] args) {
        ValidatorTerestru validatorAutobuz = new ValidatorAutobuz();
        validatorAutobuz.valideazaBilet();
        validatorAutobuz.valideazaAbonament();

        ValidatorTerestru validatorMetrou = new Adapter();
        validatorMetrou.valideazaBilet();
        validatorMetrou.valideazaAbonament();
    }
}
