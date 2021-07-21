public class Continious {
    public static void main(String[] args) {
        for (int counter = 0; counter < 42; counter++) {
            if (counter % 2 != 0) {
                continue;
            }
            System.out.println("FOR-counter are val: " + counter);

        }
        System.out.println("............");
        int counter = 0;
        while (counter < 42) {
            if (counter % 2 == 1) {
                counter++;
                continue;

            }
            System.out.println("while counter are valoarea: " + counter);
            counter++;
        }
        System.out.println("...........");
        counter = 0;
        do {
            if ((counter - 1) % 2 == 0) {
                counter++;
                continue;
            }
            System.out.println("dowhile counter are val: " + counter);
            counter++;
        }while(counter < 42);
    }
}
