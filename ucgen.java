
public class ucgen extends sekil{
    private int a;
    private int b;
    private int c;
    
    
    public ucgen(String isim,int a,int b,int c){
        super(isim);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public void alanhesapla(){
        double u=(a+b+c)/2.0;
        double alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(getisim()+"seklinin alanı:"+alan);
        
    }
   
}
