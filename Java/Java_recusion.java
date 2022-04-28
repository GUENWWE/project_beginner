public class Java_recusion {

/* Java Recursion
Recursion is the technique of making a function call itself. 
This technique provides a way to break complicated problems down into simple problems which are easier to solve. */
public static int sum(int k)
{
  if (k > 0)
  {
    return k + sum(k-1); // return k + sum(k-1) to perform recursion
  }
  else
  {
    return 0; // if don't have any number to add, return 0
  }
}
 

 // Halting Condition(Điều kiện tạm dừng) :
public static int recuc(int start, int end) {
  if (end > start) {

    return end + recuc(start, end - 1);
    
  } else {
    return end;
  }
}

public static void main(String[] args){
  int result = sum(10); // 10 is argument for k in sum method
  System.out.println(result); 
  /*  Example Explained Recusion:
 When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k and returns the result. 
 When k becomes 0, the function just returns 0. When running, the program follows these steps:
 
 10 + sum(9)
 10 + ( 9 + sum(8) )
 10 + ( 9 + ( 8 + sum(7) ) )
 ...
 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 */
     
  // Halting Condition(Điều kiện tạm dừng):
  int result2 = recuc(5 , 10);
  System.out.println(result2);

  /* Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion. 
  Infinite recursion is when the function never stops calling itself.
   Every recursive function(Mọi hàm đệ quy) should have a halting condition, which is the condition where the function stops calling itself.
   In the previous example, the halting condition is when the parameter k becomes 0. */





  }
}
