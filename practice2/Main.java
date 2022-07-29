import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    Bicycle bicycle1 = new Bicycle("ビアンキ", "緑", 0);
    
    bicycle1.printData();
    System.out.println("-----------------");
    
    System.out.println("走る距離を入力してください：");
    int i = scanner.nextInt();
    bicycle1.run(i);
    
    System.out.println("=================");
    
    Car car1 = new Car("フェラーリ", "赤", 0, 0);
    car1.printData();
    
    System.out.println("-----------------");
    System.out.println("走る距離を入力してください：");
    int n = scanner.nextInt();
    car1.run(n);
    
    System.out.println("-----------------");
    System.out.println("給油する量を入力してください：");
    int t = scanner.nextInt();
    car1.change(t);
  }
}