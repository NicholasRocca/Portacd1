public class Cd {
    private String titolo;
    private String autore;
    private int brani;
    private int durata;
        public Cd (String titolo, String autore, int brani, int durata){
        this.autore=autore;
        this.titolo=titolo;
        this.brani=brani;
        this.durata=durata;
    }
public String getTitolo() {
    return titolo;
}
public void setTitolo(String titolo) {
    this.titolo = titolo;
}
public String getAutore() {
    return autore;
}
public void setAutore(String autore) {
    this.autore = autore;
}
public int getBrani() {
    return brani;
}
public void setBrani(int brani) {
    
    this.brani = brani;

}
public int getDurata(){
    return durata;
}
public void setDurata(int durata){
    
        this.durata = durata;
    
}
public int compareDurata(Cd cd ){
    int compare= 0;
    if(cd.getDurata()==getDurata()){
        
    } else {
        
    if(cd.getDurata()>getDurata()){
        compare = cd.getDurata();
    } else {
        compare = getDurata();
    }
}


    return compare;
}
public boolean equals(Object o){
    boolean equal=false;
    if (o==this){
        equal=true;
    } else{ 
        if (o instanceof Cd){
           Cd d = (Cd)o;
           if(this.getAutore().equals(d.getAutore())&& this.getDurata() == d.getDurata() && this.brani == d.getBrani() && this.titolo.equals(d.getTitolo())){
            equal = true;
        }
    }
}
    
    return equal;
}
public String toString() {
    String s="";
    s= "titolo : "  + getTitolo() 
      + " autore : " + getAutore() 
    +   " brani : " + getBrani() + 
        " durata : " + getDurata() ;


    return s;
    
}
}
