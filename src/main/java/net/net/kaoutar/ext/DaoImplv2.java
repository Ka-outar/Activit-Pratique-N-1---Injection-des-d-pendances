package net.net.kaoutar.ext;

import net.kaoutar.dao.IDao;

public class DaoImplv2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteurs ...");
        double t = 12;
        return t;
    }
}
