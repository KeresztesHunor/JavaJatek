package javajatek;

public class Balra extends Helyszin
{
    @Override public String leiras()
    {
        return "Ez balra van";
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
