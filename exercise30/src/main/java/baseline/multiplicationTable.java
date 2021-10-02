package baseline;

public class multiplicationTable {
    //privitize variables
    private int Length;
    private int Width;
    public multiplicationTable(int length, int width) {
        Length = length;
        Width = width;

        //make a for loop. has to be a nested for loop.
        for (int i = 1; i < length+1; i++){
            //print out a new line to make it look well
            for (int k = 1; k < width+1; k++){
                //print out  i * k, using some format specifiers so it is aligned properly
            }
        }

    }
}
