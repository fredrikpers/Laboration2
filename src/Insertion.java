import java.util.Scanner;

public class Insertion {
    public static void sort(int [] a) {
        int swap = 0;
        /**
         * Metod som går igenom arrayen och byter plats på de element som inte är i ordning.
         * När metoden har körts klart så ligger alla element i arrayen i stigande ordning.
         */
        for(int i = 0; i < a.length; i++) {

            for(int j = i; j > 0; j--) {
                System.out.println("Inside loop: " +toString(a));
                if(a[j] < (a[j-1]))
                {
                    swap(a,j,j-1);
                    swap++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println("Number of swaps: "+swap);
    }

    /**
     * Byter plats på två element i arrayen, skriver sedan ut vilka som bytte plats
     */
    private static void swap (int [] a, int j, int i) {
        int swap = a[j];
        a[j] = a[i];
        a[i] = swap;
        System.out.println("Swapping " + a[j] + " with " + a[i]);
    }

    /**
     * Metod som gör om arrayen till en String och returnerar denna.
     */
    public static String toString(int [] a) {
        String s = "List: ";
        for(int i = 0; i < a.length; i++) {
            s += a[i]+ ", ";
        }
        s = s.substring(0, s.length() - 2);
        s += "\n";
        return s;
    }

    /**
     * Metod som sätter ett värde på storleken på arrayen.
     * @return size
     */
    public static int arraySize(){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        return size;
    }

    /**
     * Skapar arrayen som användaren knappar in.
     */
    public static int[] createArray(int size){
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[size];
        for(int i = 0; i < size; i++)
            array[i] = scanner.nextInt();
        return array;
    }

    /**
     * Metod som räknar ut de inversions som finns.
     * Printar även ut dessa och avslutas med att printa antalet inversions.
     */
    public static void inversions(int [] a) {
        int inversions = 0;

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    System.out.println("[" + i + "," + a[i] + "] ---> [" + j + "," + a[j]+"]");
                    inversions++;
                }
            }
        }
        System.out.println("Number of inversions: "+inversions);

    }

    public static void main(String[] args) {
        System.out.println("How large array do you want? ");
        int size = Insertion.arraySize();
        System.out.println("Enter your array");
        int [] array = Insertion.createArray(size);

        Insertion.inversions(array);

        System.out.println("Before sorting: \n" +Insertion.toString(array));
        Insertion.sort(array);
        System.out.println("After sorting: \n" +Insertion.toString(array));
    }
}

