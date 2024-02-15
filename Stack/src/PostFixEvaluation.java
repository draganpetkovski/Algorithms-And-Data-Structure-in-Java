import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;


public class PostFixEvaluation {
	static int evaluatePostfix(char [] izraz, int n)
    { 
           Stack<Integer> operationsStack = new ArrayStack<>(n);

        for (int i = 0; i < n; i++) {
            char current = izraz[i];

           if (Character.isDigit(current)) {
            String broj="";
            while (izraz[i]!=' ') {
                broj=broj+ izraz[i];
                i++;
                //Ako imame povekjecifren broj 
            }
            i--; // Go namaluvame  zatoa sto sme stignale do karakterot sto ne e broj i za toj karakter treba da go proverime uslovot
            operationsStack.push(Integer.parseInt(broj));
             
            } else if (current == '+') {
                int x = operationsStack.pop();
                int y = operationsStack.pop();
                operationsStack.push(x + y);
            } else if (current == '-') {
                int x = operationsStack.pop();
                int y = operationsStack.pop();
                operationsStack.push(y - x);
            } else if (current == '*') {
                int x = operationsStack.pop();
                int y = operationsStack.pop();
                operationsStack.push(x * y);
            } else if (current == '/') {
                int x = operationsStack.pop();
                int y = operationsStack.pop();
                operationsStack.push(y / x);
            }
           
        }

        return operationsStack.pop();
    }
	
	public static void main(String[] args) throws Exception{
          
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String expression = br.readLine();
        char exp[] = expression.toCharArray();
        
        int rez = evaluatePostfix(exp, exp.length);
        System.out.println(rez);
        
        br.close();

	}

}