//Finding a Number in an Array
/*Write a program to to check if an array contains a number in Java.
int[] intArray = {1,2,3,4,5,6};
searchInArray(intArray, 6); // 5 */

public class Finding_a_Number_in_Array{
    public void linearSearch(int[] intArray, int value) {
        for(int i=0; i<intArray.length; i++) {
            if (intArray[i] == value) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(value + " is not found");
    }
}

// Time Complexity: O(n)
