package NCUT.ShuMei.tables;

public class Book {
    public Book() {
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public void setZz(String zz) {
        this.zz = zz;
    }

    public void setCbs(String cbs) {
        this.cbs = cbs;
    }

    public void setJg(float jg) {
        this.jg = jg;
    }

    public void setFbl(int fbl) {
        this.fbl = fbl;
    }

    public void setCul(int cul) {
        this.cul = cul;
    }
public void display(){
        System.out.println(ISBN+" "+sm+" "+zz+" "+cbs+" "+jg+" "+fbl+" "+cul);
}
    private String ISBN;
    private String sm;
    private String zz;
    private String cbs;
    private float jg;
    private int fbl;
    private int cul;

    public Book(String ISBN, String sm, String zz, String cbs, float jg, int fbl, int cul) {
        this.ISBN = ISBN;
        this.sm = sm;
        this.zz = zz;
        this.cbs = cbs;
        this.jg = jg;
        this.fbl = fbl;
        this.cul = cul;
    }
}
