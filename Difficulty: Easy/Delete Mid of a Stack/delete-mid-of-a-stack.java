class Solution {
    public void deleteMid(Stack<Integer> s) {

     int n=s.size()/2;
      Stack<Integer> s2=new Stack<>();

      for (int i=1;i<=n;i++){
          s2.push(s.pop());
      }
      s.pop();

      while (!s2.empty()){
          s.push(s2.pop());
      }

      while (!s.empty()){
          System.out.print(s.pop()+" ");
      }




       
           
    }
}