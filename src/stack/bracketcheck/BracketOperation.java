package stack.bracketcheck;

public class BracketOperation {
    StackChar stackChar;
    String s;
    public BracketOperation(String s){
        stackChar = new StackChar(s.length());
        this.s = s;
    }
    public void validateBrackets(){
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            switch (c){
                case '(':
                case '{':
                case '[':
                    stackChar.push(c);
                    break;
                case ']':
                case '}':
                case ')':
                    if(!stackChar.isEmpty()){
                        char c1 = stackChar.pop();
                        if(c==']' && c1!='[' ||
                                c=='}' && c1!='{' ||
                                c==')' && c1!='('){
                            System.out.println("invalid "+c+" at "+i);
                            return;
                        }
                    } else {
                        System.out.println("invalid "+c+" at "+i);
                        return;
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println("valid");
    }
}
