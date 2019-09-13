class FizzBuzz {
    public static void main(String[] args) {
        int i = 0;
        Fizzbuzz(i);
    }

    public static String Fizzbuzz(int i) {
        String output = "";
        for(i = i;i <= 100; i++){
            if (i % 3 == 0) {
                output += "Fizz";
            }
            if (i % 5 == 0) {
                output += "Buzz";
            }


            if (output == "") {
                output = Integer.toString(i);
            }

            return output;
        }
        return output;

    }
}





