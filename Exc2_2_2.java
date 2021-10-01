public class Exc2_2_2{

  public static void main(String[] args){

    String values = "EASYQUESTION";
    String[] array = values.split("(?!^)");
    Comparable[] list = array;

    for(Comparable s : list) System.out.print(s);System.out.println("");

    mergeSort(list);

  }


  private static Comparable[] aux;

  public static void mergeSort(Comparable[] a){
    aux = new Comparable[a.length];
    mergeSort(a, 0, a.length - 1);
  }

  public static void mergeSort(Comparable[] a, int lo, int hi){
    if(hi <= lo) return;
    int mid = lo + (hi - lo)/2;
    mergeSort(a, lo, mid);
    mergeSort(a, mid+1, hi);
    merge(a,lo,mid,hi);
  }

  public static void merge(Comparable[] a, int lo, int mid, int hi){

    System.out.println("merge(a," + lo + "," + mid + "," + hi + ")");
    int i = lo, j = mid +1;
    for(int k = lo ; k <= hi ; k++)
      aux[k] = a[k];
    for(int k = lo; k <= hi ; k++)
      if      (i > mid)             a[k] = aux[j++];
      else if (j > hi)              a[k] = aux[i++];
      else if (less(aux[j],aux[i])) a[k] = aux[j++];
      else                          a[k] = aux[i++];

    for(Comparable s : a) System.out.print(s);System.out.println("");
  }

  public static boolean less(Comparable v, Comparable w){
    return v.compareTo(w) < 0;
  }

}
