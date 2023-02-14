// Author : Brendan Phelan
// Date : 13/2/2023

package Lab15;

public class Verifier {

    public void verifyIntRange(int value, int low, int high) throws MyOutOfRangeException {
        if (value < low || value > high) {
            throw new MyOutOfRangeException();
        }
    }
    
}
