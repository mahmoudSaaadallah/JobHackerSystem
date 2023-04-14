import java.util.*;
class vaildParentheses {
    public static boolean isValid(String s) {
             Scanner scan = new Scanner(System.in);
        Stack <Character>st = new Stack<Character>();
        for(char ch : s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if(!st.empty()){
                if(ch == ')' && st.peek() == '('){
                    st.pop();
                }
                else if (ch == '}' && st.peek() == '{')
                {
                    st.pop();
                }
                else if (ch == ']' && st.peek() == '['){
                    st.pop();
               }
               else 
return false;
            }
            else
            return false;           
        }
        return st.empty();

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        boolean b = isValid(s);
        System.out.println(b);

    }
    }