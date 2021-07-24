class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    String str="SREECHARANYA";
    String result="";
    int i=str.length();
    System.out.println(i);
    while(i>0){
      //char k=str.charAt(i-1);
      result+=str.charAt(i-1);
      ;
     // System.out.println(result);
      i--;
    }
    System.out.println(result);
  }
}