package NCUT.ShuMei.tables;

public class Book {
    Book() {
    }

    void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    void setSm(String sm) {
        this.sm = sm;
    }

    void setZz(String zz) {
        this.zz = zz;
    }

    void setCbs(String cbs) {
        this.cbs = cbs;
    }

    void setJg(float jg) {
        this.jg = jg;
    }

    void setFbl(int fbl) {
        this.fbl = fbl;
    }

    void setCul(int cul) {
        this.cul = cul;
    }

    public void display() {
        System.out.println(ISBN + " " + sm + " " + zz + " " + cbs + " " + jg + " " + fbl + " " + cul);
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
