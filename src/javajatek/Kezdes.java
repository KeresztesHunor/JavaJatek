package javajatek;

public class Kezdes extends Helyszin implements MasikIrany
{
    @Override public String leiras()
    {
        return "Ez a kezdés. Jobbra, vagy balra?";
    }
    
    @Override public String egyikBtnText()
    {
        return "Jobbra";
    }

    @Override public Helyszin egyikIrany()
    {
        return new Jobbra();
    }

    @Override public String masikBtnText()
    {
        return "Balra";
    }

    @Override public Helyszin masikIrany()
    {
        return new Balra();
    }
}
