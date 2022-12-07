class Main {

    public static void main(String args[]){
      twoDieRole();
    }

     //put your method here 
     public static byte dieRoll(){
         return (byte)(Math.random()*6+1);
     }
     public static void twoDieRole() {
      int rolls[] = {dieRoll(), dieRoll()};
      System.out.println(rolls[0] + " and "+ rolls[1] +" ==> total " + (rolls[0] + rolls[1]));
     }


}
