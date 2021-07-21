public class whiledowhile {
    public static void main(String[] args) {
        int counter = 0;
        /*
        while (expresie adevarata){bloc de cod
        }

         */
        while(counter < 25){
            System.out.println("counterul are valoarea:" + counter);
            counter++;}
        System.out.println(".................");

        /*
        do{
        bloc de cod}while(conditie care trebuie sa fie adevarata);
         */
        counter = 0;
        do{
            System.out.println(" Dowhile Counterul are valoarea: " + counter);
            counter++;
        }while(counter < 25);


        }
    }

