public class Classy{

  public static void main(String[] args){

    Kattio io           = new Kattio(System.in, System.out);

    try{

      int numberOfcases   = io.getInt();
      int numberOfPeople  = io.getInt();

      String[]  names     = new String[numberOfPeople];
      int[]     rank      = new int[numberOfPeople];

      for(int i = 0 ; i < numberOfPeople ; i++){
        String name       = io.getWord();
        String klasse     = io.getWord();
        String endLine    = io.getWord();
        rank[i]           = getRank(klasse);
        names[i]          = name.substring(0,name.length()-1);   //ikke optimalt
  ;
      }

      for(String name : names){
        io.println(name);
      }
      io.println("==============================");

      io.close();

    }catch(Exception e){
      io.println(e);
    }
  }

  public static int getRank(String klasse){
    int rank = 1;
    for(int i = 0 ; i < klasse.length() ; i ++){
      if(       klasse.charAt(i) == 'u'){
        System.out.println("upper fundet!");
        i+=5;
      }else if( klasse.charAt(i) == 'm'){
        System.out.println("middle fundet!");
        i+=6;
      }else if( klasse.charAt(i) == 'l'){
        System.out.println("lower fundet!");
        i+=5;
      }
    }
    return 0;
  }





}
