package cts.clase.adapter;
import cts.clase.*;
import cts.clase.validatorSubteran.ValidatorMetrou;
import cts.clase.validatorTerestru.ValidatorTerestru;

public class Adapter extends ValidatorMetrou implements ValidatorTerestru {
	    @Override
	    public void valideazaBilet() {
	        super.valideazaCalatorie();
	    }

	    @Override
	    public void valideazaAbonament() {
	        super.valideazaAboonament();
	    }
}
