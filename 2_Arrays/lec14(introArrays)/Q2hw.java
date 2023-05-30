public class Q2hw {
    public static void main(String[] args) {
        //convert the list of the strins {"a,b", "bc","cd","de","ef","fg","gh"}
        //into an array of strings and print all strings stored on odd indices only

        String array []= {"ab", "bc","cd","de","ef","fg","gh"};

        for (int i = 0; i < array.length; i++) {
            if (i%2!=0) {
                System.out.println(array[i]);
            }
        }

    }
}
