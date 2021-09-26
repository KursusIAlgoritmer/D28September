public class Classy{

  public static void main(String[] args){


    try{
      Kattio io           = new Kattio(System.in, System.out);

      int numberOfcases   = io.getInt();

      for(int c = 1; c <= numberOfcases; c++){

          int numberOfPeople  = io.getInt();

          String[]  names     = new String[numberOfPeople];
          long[]     rank     = new long[numberOfPeople];


          for(int i = 0 ; i < numberOfPeople ; i++){
            String name       = io.getWord();
            String klasse     = io.getWord();
            String endLine    = io.getWord();
            rank[i]           = getRank(klasse);
            names[i]          = name.substring(0,name.length()-1);   //ikke optimalt
          }

          insertionSort(rank,names);

          for(int i=names.length - 1; i >=0; i-- ) io.println(names[i]);

          io.println("==============================");

      }

      io.close();

    }catch(Exception e){
      System.out.println(e);
    }
  }


  public static void insertionSort(long[] rank, String[] names){

    for(int i = 1 ; i < rank.length ; i++){

      long numberToSort = rank[i];
      String nameToSort = names[i];

      int j = i;


      while(j > 0 &&  toBeSorted(numberToSort,rank[j-1],nameToSort,names[j-1])){
        rank[j]   = rank[j-1];
        names[j]  = names[j-1];
        j--;
      }

      rank[j]   = numberToSort;
      names[j]  = nameToSort;
    }
  }

  public static boolean toBeSorted(long nA, long nB,String sA, String sB){
    return nA==nB ? sA.compareTo(sB) > 0 : nA < nB;
  }


  public static long getRank(String klasse){

    int[] rank    = new int[10];
    int rankIndex = 0;

    for(int i=0; i< 10;i++)rank[i]=2;

    for(int i = klasse.length() -1 ; i >= 0 ; i --){
      //System.out.println(i + " :" +klasse.charAt(i));
      if(       klasse.charAt(i) == 'u'){
        //System.out.println("upper fundet!");
        rank[rankIndex]=3; rankIndex++; i-=4;
      }else if( klasse.charAt(i) == 'm'){
        //System.out.println("middle fundet!");
        rank[rankIndex]=2; rankIndex++; i-=4;
      }else if( klasse.charAt(i) == 'o'){
        //System.out.println("lower fundet!");
        rank[rankIndex]=1; rankIndex++; i-=4;
      }
    }

    //for(int i : rank ) System.out.print(i + " "); System.out.println( " ..." + name);
    long numb = rank[0]*1000000000L +
                rank[1]*100000000L +
                rank[2]*10000000L +
                rank[3]*1000000L +
                rank[4]*100000L +
                rank[5]*10000L +
                rank[6]*1000L +
                rank[7]*100L +
                rank[8]*10L +
                rank[9]*1L;
    return numb;
  }

}
