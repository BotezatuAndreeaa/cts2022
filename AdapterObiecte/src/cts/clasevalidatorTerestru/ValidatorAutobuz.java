package cts.clasevalidatorTerestru;

public class ValidatorAutobuz implements ValidatorTerestru{
    @Override
    public void valideazaBilet() {
        System.out.println("A fost validat biletul pentru autobuz!");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("A fost validat abonamentul pentru autobuz!");
    }
}


//am putea face adapter ul in pachetul validatorTerestru
