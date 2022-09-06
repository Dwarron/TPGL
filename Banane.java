/**
 *
 * @author Pinon
 */
public class Banane {
    private double prix;
    private String origine;
	
    public Banane() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Banane(double prix, String origine) 
    {
        if(prix < 0)
            this.prix = -prix;  //une solution possible pour interdire les prix negatifs
        else
            this.prix = prix;

        if(origine.equals(""))
                this.origine = "Espagne";  //Espagne par défaut
        else
                this.origine = origine;   
    }

    public double getPrix(){
	    return prix;
    }

    public void setPrix(double prix){
	    this.prix=prix;
    }

    public String getOrigine(){
	    return origine;
    }
 
    public void setOrigine(String origine){
	    this.origine=origine;
    }

    @Override
    public String toString(){
        return "Banane de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 bananes sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Banane or = (Banane) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une banane a des pepins
        return false;
    }

    public static void main (String[] args){
        //Ecrire ici vos tests
	    
        Banane ConstructeurDefaut = new Banane();
        Banane ConstructeurParam1 = new Banane(15, "Bretagne");
        Banane ConstructeurParam2 = new Banane(10, "");
        Banane ConstructeurParam3 = new Banane(-4, "Hongrie");

        System.out.println("premier test Banane");
        System.out.println(ConstructeurDefaut.toString());
        System.out.println(ConstructeurParam1.toString());
        System.out.println(ConstructeurParam2.toString());
        System.out.println(ConstructeurParam3.toString());

   }
}
