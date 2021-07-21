public class ForEach {
    public static void main(String[] args) {
        int[] vectorofInts={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("lungimea vectorului este: " + vectorofInts.length);
        for(int i= 0; i< vectorofInts.length; i++){
            System.out.println("FOR1-elementul de la pozitia " + i + "este: " + vectorofInts[i]);}
        System.out.println("......");
        for(int element : vectorofInts){
            System.out.println("FOR2-elementul este: " + element);
        }
        for(int i = 0; i < vectorofInts.length; i=i+2){
            System.out.println("FOR3-elementul de pe pozitia : " + i + "este: " + vectorofInts[i]);
        }
        System.out.println("......");
        for(int i = 1; i < vectorofInts.length; i=i+2){
            System.out.println("for4-elementul de pe pozitia: " + i +"este: " + vectorofInts[i]);
        }
    }
}
