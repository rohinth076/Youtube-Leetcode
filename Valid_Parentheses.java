class Solution {
    public boolean isValid(String S) {
        Stack<Character> s = new Stack<>();
        Map<Character,Character> m = new HashMap<>();
        m.put('{','}');
        m.put('[',']');
        m.put('(',')');
        for(char i:S.toCharArray()){
            if(m.containsKey(i)){
                s.push(m.get(i));
            }
            else{
                if(s.isEmpty() || s.pop() != i)
                    return false;
            }
        }
        return s.isEmpty();
    }
}
