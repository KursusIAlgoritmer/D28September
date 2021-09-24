public class Exc2_1_1{
  //E-ASYQUESTION
  //AE-SYQUESTION
  //AES-YQUESTION
  //AESY-QUESTION
  //AEQSY-UESTION
  //AEQSUY-ESTION
  //AEEQSUY-STION
  //AEEQSSUY-TION
  //AEEQSSTUY-ION
  //AEEIQSSTUY-ON
  //AEEIOQSSTUY-N
  //-AEEINOQSSTUY

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
