public class Main {
  public static void main(String[] args) {
    Person.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);
    Person.printData(Person.fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("名前：");
    // 文字列の入力を受け取ってください
    String firstName = scanner.next();
    
    System.out.print("名字：");
    // 文字列の入力を受け取ってください
    String lastName = scanner.next();
    
    System.out.print("年齢：");
    // 整数の入力を受け取ってください
    int age = scanner.nextInt();
    
    System.out.print("身長(m)：");
    // 小数の入力を受け取ってください
    double height = scanner.nextDouble();
    
    System.out.print("体重(kg)：");
    // 小数の入力を受け取ってください
    double weight = scanner.nextDouble();
    
    Person.printData(Person.fullName(firstName, lastName), age, height, weight);
  }
}
