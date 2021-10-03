package baseline;

public class MultiplicationTable {
    public MultiplicationTable(int length, int width) {
        //privitize variables (not doing that anymore cause sonarLint hates it)

        //make a for loop. has to be a nested for loop.
        for (int lengthCounter = 1; lengthCounter < length+1; lengthCounter++)
        {
            //print out a new line to make it look well
            System.out.printf("\n");
            for (int widthCounter = 1; widthCounter < width+1; widthCounter++)
            {
                System.out.printf("%5d", lengthCounter * widthCounter);
                //print out  lengthcounter * widthcounter, using some format specifiers so it is aligned properly
            }
        }

    }
}
