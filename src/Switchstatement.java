public class Switchstatement {
    public static void main(String[] args) {
        int dayofweek = 7;
        /*
        0-ii luni
        1-marti
        2-miercuri
        3-joi
        4-vineri
        5-sambata
        6-duminica
         */
        switch(dayofweek){
            case 0:
                System.out.println("luni");
                break;
            case 1:
                    System.out.println("marti");
                    break;
            case 2:
                System.out.println("miercuri");
                break;
            case 3:
                System.out.println("joi");
                break;
            case 4:
                System.out.println("vineri");
                break;
            case 5:
                System.out.println("sambata");
                break;
            case 6:
                System.out.println("duminica");
                break;
            default:
                System.out.println("ce zi e asta?");


        }
    }
}
