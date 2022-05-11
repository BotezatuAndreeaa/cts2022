package cts.clase.adapter;

import cts.clasevalidatorSubteran.ValidatorSubteran;
import cts.clasevalidatorTerestru.ValidatorTerestru;

public class Adapter implements ValidatorTerestru {
    ValidatorSubteran validatorMetrou;

    public Adapter(ValidatorSubteran validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonament();
    }
}
