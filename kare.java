
public class kare extends sekil{
    private int kenar;
    public kare(String isim,int kenar){
        super(isim);
        this.kenar=kenar;
    }
    public void alanhesapla(){
        double alan=kenar*kenar;
        System.out.println(getisim()+" seklinin alani: "+alan);
    }
    
}
