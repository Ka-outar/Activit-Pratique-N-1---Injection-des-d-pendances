package net.kaoutar.presentation;

import net.kaoutar.dao.IDao;
import net.kaoutar.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pres2 {
    //FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao d=(IDao) cDao.newInstance();



        String metierClassName = sc.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier= (IMetier) cDao.getConstructor(IDao.class).newInstance(d);
    }
}
