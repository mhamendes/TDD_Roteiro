class Money  {
   protected int amount;
   
   public boolean equals(Object object)  {
      Money money = (Money) object;
      return amount == money.amount;
   }   
}

class Dollar extends Money {
   Dollar(int amount) {
      this.amount= amount;
   }
   void times(int multiplier) {
      amount= amount * multiplier;
   }
}	



class Franc extends Money {   				
   Franc(int amount) {      
      this.amount= amount;
    }					
    Franc times(int multiplier)  {      
       return new Franc(amount * multiplier);					
    }   				
}
