package net.kaoutar.presentation;

import net.kaoutar.dao.DaoImpl;
import net.kaoutar.metier.MetierImpl;
import net.kaoutar.ext.DaoImplv2;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplv2 d = new DaoImplv2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);
        System.out.println("Res = "+metier.calcul());
    }
}
