package stack.reserveword;

public class StringOperation {
    StackChar stackChar;
    public StringOperation(String s){
        this.stackChar = new StackChar(s.length());
        for (int i=0; i<s.length(); i++){
            this.stackChar.push(s.charAt(i));
        }
    }
    public String reverse(){
        StringBuilder sb = new StringBuilder("");
        while (!stackChar.isEmpty()){
            sb.append(stackChar.pop());
        }
        return sb.toString();
    }
}
