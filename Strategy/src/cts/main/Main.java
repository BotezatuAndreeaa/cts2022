package cts.main;

import cts.clase.CardBancar;
import cts.clase.CardCalatori;
import cts.clase.Sms;
import cts.clase.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator= new Validator(new CardCalatori(), 3);
        validator.platesteCalatorie();
        validator.setModPlata(new CardBancar());
        validator.platesteCalatorie();
        validator.setModPlata(new Sms());
        validator.platesteCalatorie();
    }
}
