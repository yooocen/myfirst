ublic class test4{
  public static void main(String[] args) throws Exception {
    // try{
    String s1="hello world";
    String s2= new String(s1.getBytes(),"iso8859_1")  ;
    System.out.println("解码   " + s2);
    String s3;
    System.out.println("=============charAt==================================");
    char c=s1.charAt(6);
    System.out.println(c);
    System.out.println("=============toCharArray=============================");
    char[] array=s1.toCharArray();
    System.out.println("backprint char array");
    for(int i=array.length-1;i>=0;i--)
      System.out.print(array[i]);
    System.out.println("\n==============concat=================================");
    s3=s2.concat(s2);
    System.out.println(s3);
    System.out.println("================equals===============================");
    s3="hello world";
    if(s1.equals(s3))
      {System.out.println("It is the same");}
  // }
  // catch(UnsupportedEncodingException e){}
  }
}
