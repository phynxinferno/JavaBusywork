class main {
    public static void println(String text) {
        System.out.println(text);
    }
    public static void print(String text) {
        System.out.print(text);
    }
    public static char term = 'a';
    public static void cycleTerm() {
        println("\nPart " + term);
        term += (char) 1;
    }
    public static void main(String[] args) {
        int iter;
        int patterns[][] = {{6,-1,-1},{0,3,33},{-15,5,20},{1,2,2048}};
        for(int iter1 = 0; iter1 <= patterns.length - 2; iter1++) {
            cycleTerm();
            for(iter = patterns[iter1][0]; iter != patterns[iter1][2]; iter += patterns[iter1][1]) {
                println(iter + " --> " + (iter*2+5));
            }    
        }
        cycleTerm();
        for(iter = patterns[3][0]; iter != patterns[3][2]; iter *= patterns[3][1]) {
            println(iter + " --> " + (iter*2+5));
        }
    }
}