//Project Euler Problem One Solution
//If we list all the natural numbers below 10 that are multiples
//of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.
class Problem_1{

  public static void main(String[] args){

    int total = 0;

    for(int n = 1; n < 1000; n++){
      if(n%5 == 0 || n%3 == 0){
        total +=n;
      }
    }

    System.out.println(total);

    int add = 0;
    for(int i = 0; i<1000; i++){
      add +=i;
    }
    System.out.println(add);
  }

}
