public class For {
    public static void main(String[] args) {
        /*
        for(statement de initializare; conditie de oprire)
         */
        for(int counter = 0; counter < 25; counter++){
            System.out.println("FOR1=counterul are valoarea " + counter);
        }
        System.out.println("..........");
        int interator;
        for(interator = 0; interator < 100; interator++)
            System.out.println("FOR2= iteratorul are valoarea " + interator);
        System.out.println("iteratorul are valoarea" + interator);
        interator = 0;
        for(;interator < 25;) {
            System.out.println("FOR3-iteratorul are valoarea" + interator);
            interator++;
        }    }
}
