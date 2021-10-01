public class Exc2_1_1{
  //Show, in the style of the example trace with Algorithm 2.1, how selection sort
  //sorts the array E A S Y Q U E S T I O N.

  // i=0
  // E - A S Y Q U E S T I O N
  // i=1
  // A E - S Y Q U E S T I O N
  // i=2
  // A E S - Y Q U E S T I O N
  // i=3
  // A E E - Y Q U S S T I O N
  // i=4
  // A E E N - Q U S S T I O Y


// Inderste loop (N-1) + (N-2) + (N-3) + ... + 3 + 2 + 1 = N*N/2
// ikke inputafhængig - laver samme arbejde hver gang



  public static void main(String[] args){
    char[] list = new char[args[0].length()];

    for(int i=0; i< list.length ; i++)list[i] = args[0].charAt(i);

    insertionSort(list);

    udskriv(list,0);
  }


  public static void udskriv(char[] list,int index){
    for(int i =0; i < list.length ; i++){
      if(i==index) System.out.print("-");
       System.out.print(list[i]);
     }
     System.out.println("");
  }



  public static void insertionSort(char[] word){

    for(int i = 1; i < word.length ; i++){

      udskriv(word,i);

        if(  ((int)word[i])  <   ((int)word[i-1])   )

          for(int j=i-1; j >=0; j--){
            System.out.println("I indre loop");

            if( ((int)word[i]) >  ((int)word[j]) ){
              insert(i,j+1,word);
              break;
            }
            if( j == 0){
              insert(i,0,word);
            }


          }

    }

  }


  public static void insert(int fromIndex, int toIndex ,char[] word){
      char value = word[fromIndex];
        for(int i=fromIndex-1 ; i >= toIndex ; i--){
              word[i+1] = word[i];
        }
        word[toIndex] = value;
  }


}
