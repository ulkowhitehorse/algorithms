public class InsertionSorting {

    int[] inputAlgorithm;
    int N;

    public InsertionSorting(int[] sortingMassive){
        inputAlgorithm = sortingMassive;
    }

    public void sortMassive() {
        System.out.println("БЫЛО: ");

        for (int x: inputAlgorithm){
            System.out.print(x);
            System.out.print(" ");
        }

        System.out.println();
        for (int i = 0; i < inputAlgorithm.length - 1; i++ ){
            int tmp;
            for (int j = inputAlgorithm.length - 1; j > i; j--){
                System.out.println("i = " + i + ", j = " + j);
                if (inputAlgorithm[j] < inputAlgorithm[i]){
                    tmp = inputAlgorithm[i];
                    System.out.printf("\nmass[%d] = %d < mass[%d] = %d\n", j, inputAlgorithm[j], i, inputAlgorithm[i] );
                    inputAlgorithm[i] = inputAlgorithm[j];
                    System.out.printf("\nmass[%d] = %d\n", i, inputAlgorithm[i]);
                    inputAlgorithm[j] = tmp;
                    System.out.printf("mass[%d] = %d\n\n", j, inputAlgorithm[j]);
                    for (int x: inputAlgorithm){
                        System.out.print(x);
                        System.out.print(" ");
                    }
                    System.out.println();
                } else {
                    System.out.printf("mass[%d] = %d > mass[%d] = %d\n\n", j, inputAlgorithm[j], i, inputAlgorithm[i] );
                }

                N++;
            }
        }

        System.out.println();
        System.out.println("СТАЛО: ");

        for (int x: inputAlgorithm){
            System.out.print(x);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println("N = " + N);
    }

    public static void main(String[] args) {
        InsertionSorting insertionSorting = new InsertionSorting(new int[] {7, 5, 6, 1, 3, 2, 8, 0});
        insertionSorting.sortMassive();
    }


}