package model;

public class Tenis {
    private int id;
    private String tenis;

    public Tenis(int id, String tenis) {
        this.id = id;
        this.tenis = tenis;
    }

    public Tenis(String tenis) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenis() {
        return tenis;
    }

    public void setTenis(String tenis) {
        this.tenis = tenis;
    }
    
    
}
