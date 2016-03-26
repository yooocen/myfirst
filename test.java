interface Flyer{
  public void fly();
}

interface Sailer{
  public void cruise();
}

abstract class Vehicle{
  public abstract void consume();
}

abstract class Animal{
  public abstract void eat();
}

abstract class AirPlane extends Vehicle implements Flyer{
  public void consume(){
    System.out.println("i need  oil");
  }
  public void fly(){
    System.out.println("plane way");
  }
}
class SeaPlane extends AirPlane implements Sailer{
  public void cruise(){
    System.out.println("ship way");
  }
}
class Bird extends Animal implements Flyer{
  public void eat(){
    System.out.println("i need to eat");
  }
  public void fly(){
    System.out.println("animal way");
  }
}

public class test{
  public static void main(String[] args) {
    SeaPlane sp = new SeaPlane();
    Bird b = new Bird();

    System.out.println("=============SeaPlane====================");
    sp.fly();
    sp.consume();
    sp.cruise();

    System.out.println("=============Bird=========================");
    b.fly();
    b.eat();
  }
}
