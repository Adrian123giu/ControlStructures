public class Break {
    public static void main(String[] args) {
        for(int counter = 0; counter < 25; counter++){
            if(counter == 10)
                break;
            System.out.println("FOR1-counter are val: " + counter);
        }
        int counter = 0;
        while(counter < 25){
            if(counter == 20)
                break;
            System.out.println("while counter are val: " + counter);
            counter++;
        }
        counter = 0;
        do {
            if (counter == 30)
                break;
            System.out.println("dowhile-counter are val: " + counter);
            counter++;
        }while(counter < 50);

    }
}
