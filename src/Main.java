public class Main {

    public static int FirstLast(int[] a)
    {
        int tempResult = a[a.length -1] - a[0];

        return tempResult;
    }

    public static int Average(int[] b)
    {
        int tempAvg = 0;

        for(int i =0; i < b.length; i++)
        {
            tempAvg = tempAvg+ b[i];
        }
        return tempAvg/b.length;
    }

    public static void avgName(String[] a)
    {
        double avgNumName=0;
        for(int i = 0; i < a.length; i++)
        {
            avgNumName = avgNumName + a[i].length();
        }
        avgNumName = avgNumName/a.length;
        System.out.println("Average Number of Letters: " + avgNumName);
    }

    public static void nameArray(String[] a)
    {
        String result = "";
        int temp = 0;

        do{

          result =  result.concat(a[temp]) + " ";

            temp++;
        }while( temp < a.length);

        System.out.println("String of Names: " + result);
    }
    
    
    public static void sumArray(String[] a)
    {
      int nameLengths[]= new int[a.length];
      
      for(int i =0; i < a.length; i++)
      {
        nameLengths[i] = a[i].length();

      }
      
      int sum =0;
      
      for(int j = 0; j < nameLengths.length; j++)
      {
        sum = sum + nameLengths[j];
        
      }
        
      System.out.println("Sum of all the elements: " + sum);
    }
    
    static String repeatWord(String userWord, int numTimes) {
   
      String newString = "";
      for (int i = 0; i < numTimes; i++) {
          newString += userWord;
      }
      
      return newString;
  }
    
    static String fullName (String firstName, String lastName) {
      
      String nameFull = firstName + " " + lastName;
      
      return nameFull;
  }
    
    
static boolean sumArray100 ( int k[] ) {
     
    boolean sumResult= true;
    int addSum = 0;
    
    for(int i = 0; i < k.length; i++)
    {
      addSum = addSum + k[i];
    }
    
    if(addSum < 100)
    {
      sumResult = false;
    }
    else
    {
      sumResult = true;
    }
  
      return sumResult;
  }
    
static double dAverage ( double k[] ) {
  
  double sumAverage = 0;
  
  for(int i = 0; i < k.length; i++)
  {
    sumAverage = sumAverage + k[i];
  }
  
  
   return sumAverage/k.length;
}

static boolean dCompareAverage ( double k[], double m[] ) {
  
    double number1 = 0,number2 = 0, avg1 =0, avg2 =0;
    
    boolean bResults = false;
    
    for(int i =0; i < k.length; i++)
    {
      number1 = number1 + k[i];
    }
  
    for(int i =0; i < m.length; i++)
    {
      number2 = number2 + m[i];
    }
    
    
    avg1 = number1/k.length;
    avg2 = number2/m.length;
    
    
    if(avg1  > avg2)
    {
      bResults = true;
    }
    else
    {
      bResults = false;
    }
    
    
   return bResults;
} 

static boolean willBuyDrink ( boolean isHotOutside, double moneyInPocket ) {
  
  
    boolean tempResult = false;
    
    if(isHotOutside == true && moneyInPocket > 10.50)
    {
      tempResult = true;
    }
    
    return tempResult;
} 

static boolean isPalindrome ( String word) {
  
  //This Method was created to test is a word is a palindrome.
  //Created because it is a common interview question
  
  boolean tempResult = false;
  
  String nstr = "";
  char ch;
  
  for (int i=0; i<word.length(); i++)
  {
    ch= word.charAt(i); //extracts each character
    nstr= ch+nstr; //adds each character in front of the existing string
  }
  
  if(nstr.equalsIgnoreCase(word))
    {
      tempResult = true;
    
    }
    
  
  return tempResult;
} 
    public static void main(String[] args) {

       //Coding Step 1 A
        int[] ages = new int[]{3, 9, 23, 64, 2, 8, 28, 93};

        int result1 = FirstLast(ages);
        System.out.println("First Run:" + result1);

        //Coding Step 1 B
        int[] ages2 = new int[]{3, 9, 23, 64, 2, 8, 28, 93, 100};
        int result2 = FirstLast(ages2);
        System.out.println("Second Run:" + result2);

        //Coding Step 1 C
        int average1 = Average(ages);
        System.out.println("First Average:" + average1);

        int average2 = Average(ages2);
        System.out.println("Second Average:" + average2);
    //Code Step 2
        String [] names = new String[]{"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        avgName(names);
        nameArray(names);
    //Code Step 5 and 6
        sumArray(names);
        
    //Code Step 7
        
        String word = "Hello";
        int repeat = 3;
        
        System.out.println("Repeat Word Result: " +repeatWord(word,repeat));
        
    //Code Step 8
        String first = "Bianca";
        String last = "Gurule";
        
        System.out.println("Full Name Result: " + fullName(first, last));
        
    //Code Step 9
        System.out.println("Array Sum Result: " + sumArray100(ages));
        
   //Code Step 10
        double[] numbers = new double[]{3.0, 19.59, .23, 64.75, 2.00, .80, 28.44, 93.99};
        System.out.println("Double Array Average Result: "+ dAverage(numbers));
        
   //Code Step 11
        
        double[] numbers2 = new double[]{15.0, 1.59, 1.23, 64.00, 2.00, .80, 28.44, 100.00}; 
        System.out.println("Double Array Compare Result: "+ dCompareAverage(numbers, numbers2));
        
   //Code Step 12
        System.out.println("Buying Drink Result 1: " + willBuyDrink(true, 15.00));
        System.out.println("Buying Drink Result 2: " + willBuyDrink(false, 15.00));
        System.out.println("Buying Drink Result 3: " + willBuyDrink(true, 9.12));
        
 //Code Step 13
        System.out.println("MyMethod Result1: " + isPalindrome("Hannah"));
        System.out.println("MyMethod Result2: " + isPalindrome("Sarah"));
        
        
        
        
        
    }
    

    
}
