// public class a{
//   public static void main(String[] args) {
//     String s = "java";
//     StringBuffer sb = new StringBuffer("java");
//     String str = "8";
//     s.concat(str);//只能是本字符串和本字符串连接
//     sb.append(str);
//     System.out.println(s);
//     System.out.println(sb);
//   }
// }

// class Myclass{
//   public Myclass a(){
//     System.out.println("use a");
//     return this;
//   }
//   public Myclass b(){
//     System.out.println("use b");
//     return this;
//   }
//   public void c(){
//     System.out.println("use c");
//   }
// }
//
// public class a{
//   public static void main(String[] args) {
//     Myclass mc=new Myclass();
//     mc.a().b().c();
//   }
// }
// public class a{
//   public static void main(String[] args) {
//     StringBuffer sb1=new StringBuffer("java");
//     System.out.println("before operate "+sb1);
//
//     sb1.append("8").insert(4,"SE").delete(1,2).reverse();
//     System.out.println("after operate "+sb1);
//   }
// }

class  Outter{
  class Inner{
    public void show(){
      System.out.println("successful!");
    }
  }
  public void createrInner(){
    Inner i = new Inner();
    i.show();
  }
}

class a{
  public static void main(String[] args) {
    Outter o = new Outter();
    // o.createrInner();
    Outter.Inner i = o.new Inner();
    i.show();
  }
}
