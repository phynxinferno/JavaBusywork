class Main {

    public static void main(String args[]){
      dieRoll();
    }

     //put your method here 
     public static byte dieRoll(){
         byte roll = (byte)(Math.random()*6+1);
         System.out.println("You rolled a " + roll);
         return roll;
     }



}
