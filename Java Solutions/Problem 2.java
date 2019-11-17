//Project Euler Problem Two Solution
//Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2,
//the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

class Problem_2{
  public static void main(String[] args){

    int fibOne = 0;
    int fibTwo = 1;
    int evenTotal = 0;

    while(fibTwo <= 4_000_000){
      fibTwo = fibOne + fibTwo;
      fibOne = fibTwo - fibOne;

      if(fibTwo%2 ==0){
        evenTotal+= fibTwo;
      }
    }
    System.out.println(evenTotal);
  }
}
