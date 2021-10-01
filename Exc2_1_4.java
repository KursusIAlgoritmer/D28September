public class Exc2_1_4{
  //2.1.4 Show, in the style of the example trace with Algorithm 2.2, how insertion sort
  //sorts the array E A S Y Q U E S T I O N

//i=1, j=1
//E - A S Y Q U E S T I O N
//A E - S Y Q U E S T I O N
//i=1, j=0
//---------
//i=2, j=2
//A E - S Y Q U E S T I O N
//---------
//i=3, j=3
//A E S - Y Q U E S T I O N
//---------
//i=4, j=4
//A E S Y - Q  U E S T I O N
//exchange
//A E S Q - Y  U E S T I O N
//i=4, j=3
//A E S Q - Y  U E S T I O N
//exchange
//A E Q S - Y  U E S T I O N
//i=4,j=2
//---------
//i=5, j=5
//A E Q S Y - U E S T I O N













  public static void main(String[] args){
    char[] list = new char[args[0].length()];

    for(int i=0; i< list.length ; i++)list[i] = args[0].charAt(i);

    selectionSort(list);

    udskriv(list,0);
  }


  public static void udskriv(char[] list,int index){
    for(int i =0; i < list.length ; i++){
      if(i==index) System.out.print("-");
       System.out.print(list[i]);
     }
     System.out.println("");
  }



  public static void selectionSort(char[] word){

    for(int i = 0; i < word.length ; i++){

      udskriv(word,i);

          int smallestIndex = i;

          for(int j=i+1; j < word.length ; j++){
            System.out.println("I indre loop");
            if( ((int)word[smallestIndex]) > ((int)word[j]) ){
              smallestIndex = j;
            }

          }

          if(((int)word[smallestIndex]) < ((int)word[i])) byt(i,smallestIndex,word);

    }

  }


  public static void byt(int indexA, int indexB ,char[] word){
    char valueA = word[indexA];
    char valueB = word[indexB];
    word[indexB] = valueA;
    word[indexA] = valueB;
  }


}
