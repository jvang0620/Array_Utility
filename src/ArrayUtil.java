public class ArrayUtil {

   int arrayLength = 0;

   int[] intArray;                           //integer array field named intArry


   public ArrayUtil() {                      //default constructor
   }


   public ArrayUtil(int[] testArray){
   }

   
   public int[] getArray(){                  //get array
      return intArray;
   }

   
   public void setIntArray(int[] mum){       //setintArray
      intArray = mum;
   }


   public  int minValue(){                   //method minValue
       
      if (intArray.length == 0) {
         return 0;
      }
                                    
         int min = intArray[0];             // initialize min to the first element
         for (int val : intArray)
         {
            if (val < min) 
                  min = val; 
         }
         return min;
   }


   public int maxValue(){                    //method maxValue
      if (intArray.length == 0) {
         return 0;
      }
         int max = intArray[0];                 // initialize max to the first element
         for (int val : intArray)
         {
            if (val > max) 
                  max = val; 
         }
      return max;
   }


   public int countUniqueIntegers() {        //method countUniqueIntegers
      if (intArray.length == 0) {
         return 0;
      }

      int length = intArray.length; 
      int count = 0;                         //create counter
      for (int i = 0; i < length; i++) {     //for loop picks all element one by one

         int j;
         for (j = 0; j < i; j++) {
            if (intArray[i] == intArray[j]) {
               break;
            }
         }

         if (i == j) {
            count++;
         }
      }
   return count;                             //return count
   }



   /*public int returnUniqueValues() { //method returnUniqueValues    **************FIRST BONUES*********************
      if (intArray.length == 0) {
         return 0;
      }

      int length = intArray.length; 
      //int count2 = 0; 
      for (int i = 0; i < length; i++) { //for loop picks all element one by one

         int j;
         for (j = 0; j < i; j++) {
            if (intArray[i] == intArray[j]) {
               break;
            }
         }

         if (i == j) {
            //int count2++; 
            System.out.println(intArray[i] + " "); // print numbers in array that are unique
         }
      }
   return 0;
   }
   */

}