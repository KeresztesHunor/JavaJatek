package javajatek;

public class Balra extends Helyszin
{
    @Override public String leiras()
    {
        return "Ez van balra";
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
