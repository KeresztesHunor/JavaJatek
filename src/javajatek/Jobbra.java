package javajatek;

public class Jobbra extends Helyszin
{
    @Override public String leiras()
    {
        return "Ez van jobbra";
    }

    @Override public String egyikBtnText()
    {
        return "???";
    }

    @Override public Helyszin egyikIrany()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
