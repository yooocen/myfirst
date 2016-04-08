import java.util.regex.*;

public class b{
  public static void main(String[] args) {
    String patternStr="(0?[1-9]|1[0-2]):([0-5]\\d)([a|p]m)";
    String matcherStr="现在的时刻是10:15pm";
    Pattern p=Pattern.compile(patternStr);//将正则表达式编译成Pattern对象返回
    Matcher m=p.matcher(matcherStr);
    StringBuffer sb = new StringBuffer();
    int count=0;
    System.out.println("初始化字符为");
    System.out.println(matcherStr);
    while(m.find()){
      StringBuffer temp = new StringBuffer();
      if(m.group(3).equals("am")){
        temp.append(m.group(1));
        temp.append(":");
        temp.append(m.group(2));
      }
      else{
        int time=Integer.parseInt(m.group(1));
        time = time+2;
        temp.append(time+m.group(2));
      }
      m.appendReplacement(sb,temp.toString());
      System.out.println("["+(++count)+"]将"+m.group(0)+"替换为"+temp.toString());
    }
    m.appendTail(sb);
    System.out.println("最后的结果是:");
    System.out.println(sb.toString());
  }
}
