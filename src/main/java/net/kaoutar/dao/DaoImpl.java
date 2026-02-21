package net.kaoutar.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("vesion de base de données");
        double t=34;
        return t;
    }
}
