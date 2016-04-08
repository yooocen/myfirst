//测试valueOf()这个函数的用法
public class test3{
  public static void main(String[] args) {
    String s;
    boolean b;
    b=true;
    s = String.valueOf(b);
    System.out.println("boolean translate into String" + s);
    char c;
    c = 'A';
    s = String.valueOf(c);
    System.out.println("char translate into String" + s);
    char[] cs;
    cs = new char[]{'A','b','E','H'};
    s = String.valueOf(cs,1,2);
    System.out.println("char[] translate into String" + s);
  }
}
