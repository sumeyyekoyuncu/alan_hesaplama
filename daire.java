
public class daire extends sekil{
    private float yaricap;
    public daire(String isim,int yaricap){
        super(isim);
        this.yaricap=yaricap;
         }
    public void alanhesapla(){
        double alan=(Math.PI)*yaricap*yaricap;
        System.out.println(getisim()+" seklinin alani: "+alan);
    }
}
