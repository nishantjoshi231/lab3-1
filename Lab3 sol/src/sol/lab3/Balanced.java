package sol.lab3;
import java.util.Stack;

public class Balanced {
	
	
	    public static void main (String [] args)
	    {
	        String test_string = "{}(){{}()}}";
	       
	        if(checkBalanced(test_string)) {
	        	System.out.println("Balanced String");
	        }else {
	        System.out.println("Unbalanced String");
	        }
	        }

	    public static boolean checkBalanced(String check)
	    {
	        Stack<Character> S = new Stack<Character>();
	        for(int i = 0; i < check.length(); i++)
	        {
	            char temp = check.charAt(i);
	            if(temp == '[' || temp == '{' || temp == '(')
	                S.push(temp);
	            
	                if(S.empty())
	                    return false;
	                switch(temp)
	                {
	                    
	                    case ']':
	                        if (S.pop() != '[')
	                            return false;
	                        break;
	                     
	                    case '}':
	                        if (S.pop() != '{')
	                            return false;
	                        break;
	                    
	                    case ')':
	                        if (S.pop() != '(')
	                            return false;
	                        break;
	                    default:
	                        break;
	                }
	            }
	        
	        if(S.empty())
	            return true;
	        return false;
	    }
	}

