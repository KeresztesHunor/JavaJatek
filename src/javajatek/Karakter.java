package javajatek;

import java.util.ArrayList;
import java.util.Random;

public class Karakter
{
    private final ArrayList<Targy> felszereles;
    
    private int eletero;
    private int ugyesseg;
    private int szerencse;
    
    private static final Random r = new Random();

    public Karakter()
    {
        felszereles = new ArrayList<>();
        eletero = d6(2) + 12;
        ugyesseg = d6() + 6;
        szerencse = d6() + 6;
    }

    public int getEletero()
    {
        return eletero;
    }

    public void setEletero(int eletero)
    {
        this.eletero = eletero;
    }

    public int getUgyesseg()
    {
        return ugyesseg;
    }

    public void setUgyesseg(int ugyesseg)
    {
        this.ugyesseg = ugyesseg;
    }

    public int getSzerencse()
    {
        return szerencse;
    }

    public void setSzerencse(int szerencse)
    {
        this.szerencse = szerencse;
    }
    
    public void felvesz(Targy t)
    {
        felvesz(t, 1);
    }
    
    public void felvesz(Targy t, int db)
    {
        for (int i = 0; i < db; i++)
        {
            felszereles.add(t);
        }
    }
    
    private static int d6()
    {
        return d6(1);
    }
    
    private static int d6(int n)
    {
        int eredmeny = 0;
        for (int i = 0; i < n; i++)
        {
            eredmeny = r.nextInt(6) + 1;
        }
        return eredmeny;
    }
}
