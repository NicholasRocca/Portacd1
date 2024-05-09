public class Portacd {
    private Cd dischi[];
    private int max_num_cd ;
    public Portacd (int max_num_cd){
        this.dischi = new Cd [max_num_cd];
        this.max_num_cd=max_num_cd;
    }
    public Cd getCd(int posizione){
        if  (posizione<0 || posizione>max_num_cd){
        return null;
     } else 
        {
            return dischi[posizione] ;
        }
    }
    public int setCd(Cd cd, int posizione){
        int result = -1;
        if (posizione<0 || posizione>max_num_cd){
        } else {
        if (dischi[posizione]!=null ){
            result=-2;
        } else {
            dischi[posizione]=cd;
            result=1;
        } 
        }


        return result;
    }
    public int KillCd(int posizione){
        int result=-1;
        if (dischi[posizione]==null){
            result = -2;
        } else{
            dischi[posizione]=null;
            result=1;
        }
        return result;
    }
    public int getNum_max_dischi(){
        return max_num_cd;
    }
    public int getN(){
        int conta= 0;
        for (int i = 0; i < dischi.length; i++) {
            if(dischi[i] != null){
                conta++;
            }
        }
        return conta;
    }
    public String confrontaTuttaCollezione(Portacd portacd){
          String p = "" ;
          int x=0;
          int varuscita   = -1;
          boolean trovato = true;
          while (trovato && x <max_num_cd) { 
            int i =0;
            while (trovato && i< max_num_cd) {
                if(dischi[i]!=null && portacd.getCd(i)!=null){
                    if(dischi[i]!= null && portacd.dischi[i]!=null && !(dischi[i].equals(portacd.dischi[i]))){
                        trovato = false;

                    }
                }
            i++;
            }
            x++;
          }
        
        
        
          return p;

    }
    public int Cercacdpertitolo(String titolo){
        int result =-1;
        int i =0;
        boolean trovato=false;
        while(i<dischi.length&& trovato == false){
            if (dischi[i]!=null){
                if (dischi[i].getTitolo().equals(titolo)){;
                trovato=true; 
                result=i;
            }
            }
        }
        return result;
    }
    
}
