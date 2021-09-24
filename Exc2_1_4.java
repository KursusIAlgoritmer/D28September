public class Exc2_1_4{
//  -EASYQUESTION
//  A-ESYQUESTION
//  AE-SYQUESTION
//  AEE-YQUSSTION
//  AEEI-QUSSTYON
//  AEEIN-USSTYOQ
//  AEEINO-SSTYUQ
//  AEEINOQ-STYUS
//  AEEINOQS-TYUS
//  AEEINOQSS-YUT
//  AEEINOQSST-UY
//  AEEINOQSSTU-Y
//  -AEEINOQSSTUY


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
