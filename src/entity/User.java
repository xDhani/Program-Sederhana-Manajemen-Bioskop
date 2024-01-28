package entity;

abstract public class User {
    protected String nama;
    protected String pass;
    protected String nik;

    abstract public String getNama();

    abstract public String getPass();

    abstract public String getNik();
}
