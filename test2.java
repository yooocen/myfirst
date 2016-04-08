//测试Byte.parseByte()这个函数的用法
//测试Integer.parseInt()
public class test2{
  public static void main(String[] args) {
  String number;
  number = "12";
  byte b;
  b = Byte.parseByte(number);
  System.out.println("decimal byte:"+b);
  b= Byte.parseByte(number,8);
  System.out.println("octal byte:" +b);
  b = Byte.parseByte(number,16);
  System.out.println("haexdecimal byte:" + b);
  int i;
  i = Integer.parseInt(number);
  System.out.println("decimal int: " + i);
 }
}
