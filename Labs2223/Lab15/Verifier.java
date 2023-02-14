// Author : Brendan Phelan
// Date : 13/2/2023

package Lab15;

public class Verifier {

    public void verifyIntRange(int value, int low, int high) throws MyOutOfRangeException 
    {
        if (value < low || value > high) 
        {
            throw new MyOutOfRangeException();
        }
    }
    
    public void verifyPasswordStrength(String password) throws MyInvalidPasswordException 
    {
        if (password.length() < 8) 
        {
            throw new MyInvalidPasswordException("Password should be at least 8 characters!!");
        }
    }
    
}
