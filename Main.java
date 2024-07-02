public class Main {
    public static void main(String[] args) {
        // To declare an array you use [] brackets
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // creates an array of Strings
        int[] Numbers = {10, 20, 45, 15}; // to create an array of ints

        // to access a certain point of an array

        System.out.println(Numbers[0]); // prints 10

        // to change a value in an array you just
        Numbers[4] = 25;

        // for length of an array
        System.out.println(cars.length);

        // To loop through an array you can use a for loop
        for (int i = 0, i < cars.length; i++){
            System.out.println(cars[i]);
        }

        // But for-each loops are made excussively for looping through elemnts in an array
        for (int x : Numbers){
            System.out.println(Numbers[x]);
        }
        
        // Multidimensional Arrays
        // To create a two-dimensional array, add each array within its own set of curly braces
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        // To get a specefic element
        System.out.println(myNumbers[1][2]);


        // to loop through a Multidimensional Array
        int[][] moreNumbers = { {1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10} };
        for (int i = 0; i < moreNumbers.length; ++i) {
            for(int j = 0; j < moreNumbers[i].length; ++j) {
                System.out.println(moreNumbers[i][j]);
            }
        }
    }
}