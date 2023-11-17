
public abstract class sekil {
    private String isim;
    public sekil(String isim){
        this.isim=isim;
    }
    abstract void alanhesapla();
    public void setisim(String isim){
        this.isim=isim;
    }
    public String getisim(){
        return isim;
    }
}
