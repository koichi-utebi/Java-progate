class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;
  
  Car(String name, String color, int distance, int fuel) {
    this.name = name;
    this.color = color;
    this.distance += distance;
    this.fuel += fuel;
  }
  
  public void printData() {
    System.out.println("【車の情報】");
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel +"L");
  }
  
  public void run(int distance) {
    System.out.println(distance + "km走ります");
    this.distance = this.distance + distance;
    if(this.distance <= this.fuel) {
      this.fuel -= this.distance;
      System.out.println("走行距離：" + this.distance + "km");
      System.out.println("ガソリン量：" + this.fuel + "L");
    } else {
      System.out.println("ガソリンが足りません");
      System.out.println("走行距離：0km");
      System.out.println("ガソリン量：" + this.fuel + "L");
    }
  }
  public void change(int addFuel) {
    System.out.println(addFuel + "L給油します");
    if (addFuel <= 0) {
      System.out.println("給油できません");
    } else if (this.fuel + addFuel >= 100) {
      System.out.println("満タンまで給油します");
      this.fuel = 100;
    } else {
      this.fuel = this.fuel + addFuel;
    }
   System.out.println("ガソリン量：" + this.fuel + "L");
  }
}