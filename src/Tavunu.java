
/**
 * A tavunu is an imaginary Earth-dwelling being.
 *
 * A tavunu looks a bit like a Patagonian Mara and lives in a non-gendered but
 * hierarchical society. Most interactions among tavuni are negotiated with
 * pava -- items of status used for bargaining.
 *
 * @author Mithat Konar
 * @author Your Name
 */
public class Tavunu {
   private String name;
   private int birthYear;
   private int pava;
  
   public Tavunu() {
       name="";
       birthYear=Integer.MIN_VALUE;
       pava=0;
   }
   // Constructors
   public Tavunu(String name, int birthYear, int pava) {
       super();
       this.name = name;
       this.birthYear = birthYear;
       this.pava = pava;
   }
   
   public void setBirthYear(int birthYear) {
       this.birthYear=birthYear;
   }

   public int getPava() {
       return pava;
   } 
   
   public String getName() {
       return name;
   }
   
   public int getBirthYear() {
       return birthYear;
   }
    // Spend Pava if amount is positive.
    public boolean spendPava(int amount){

        if(amount <= 0){
            return false;
        }
        else {
            pava-=amount;
            return true;
        }
        
    }
    // Receive pava if amount is positive.
   public boolean receivePava(int amount){

        if(amount <= 0){
            return false;
        }
        else{
            pava+=amount;
            return true;
        }
        
    }
   // Change name if name starts with T or D
   public boolean setName(String name){
        if(name.charAt(0) != 'T' && name.charAt(0) != 'D'){
            return false;
        }
        this.name = name;
        return true;
    }
   
    public String toString(){
        String stringRepresentation = name + " born in " + String.valueOf(birthYear) + " has " + String.valueOf(pava) + " pava.";

        return stringRepresentation;
    }
  
  
  
  
  
}
