public class InvertedRightAngledTriangle {
  public static void main(String[] args) {
    

    for(int i = 0 ; i < 6 ; i++){
      for(int j = 4 ; j >= i ; j--){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}