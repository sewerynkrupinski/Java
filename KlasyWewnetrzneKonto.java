
package klasywewnetrznekonto;


public class KlasyWewnetrzneKonto {

    
    public static void main(String[] args) {
       
        KontoBankowe kontoBankowe = new KontoBankowe(1000);
        
        System.out.println(kontoBankowe.getStanKonta());
        kontoBankowe.start(5);
        
    System.out.println(kontoBankowe.getStanKonta());
    }
}

class KontoBankowe{

    public KontoBankowe(double stanKonta) {
        this.stanKonta = stanKonta;
    }
    
    
    
    private double stanKonta;
    
    double getStanKonta(){
        
        return this.stanKonta;
    }    
    
    void start(double stopa)
    {
     Odsetki odsetki = new Odsetki(stopa);
     
     
     
    }
    
    class Odsetki{

        public Odsetki(double stopaProcentowa) {
            this.stopaProcentowa = stopaProcentowa;
            this.zmienStanKonta(stopaProcentowa);
        }
        
        void zmienStanKonta(double stopa)
        {
            double odsetki = (stanKonta * stopa) / 100;
            stanKonta += odsetki;
        }
        
        
        
        private double stopaProcentowa;
        
    }
   
}
