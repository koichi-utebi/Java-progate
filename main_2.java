class Main {
  public static void main(String[] args) {
    // 「true」を用いて、「真」を表す真偽値を出力してください
    System.out.println(true);

    // 「false」を用いて、「偽」を表す真偽値を出力してください
    System.out.println(false);

    // 「==」を用いて、値を比較した結果を出力してください
    System.out.println(12 / 4 == 3);

    // 「!=」を用いて、値を比較した結果を出力してください
    System.out.println(12 / 4 != 3);

    // 変数を定義し、値を比較した結果を代入してください
    boolean bool = 3 * 9 == 27;

    // 変数boolの値を出力してください
    System.out.println(bool);

    // trueと出力されるようにしてください
    System.out.println(true || false);

    // falseと出力されるようにしてください
    System.out.println(false && true);

    // 「8 < 5」かつ「3 >= 2」の結果を出力してください
    System.out.println(8 < 5 && 3 >= 2);

    // 「8 < 5」または「3 >= 2」の結果を出力してください
    System.out.println(8 < 5 || 3 >= 2);

    // 「8 < 5」でない、の結果を出力してください
    System.out.println(!(8 < 5));

    // 条件式に直接trueをいれてください
    if (true) {
      System.out.println("条件式がtrueのため、出力されます");
    }

    // 条件式に直接falseをいれてください
    if (false) {
      System.out.println("条件式がfalseのため、出力されません");
    }

    int x = 5;
    // if文を用いて、変数xが2より大きいとき「xは2より大きい」と出力してください
    if (x > 2) {
      System.out.println("xは2より大きい");
    }

    // if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力してください
    if (x > 8) {
      System.out.println("xは8より大きい");
    }

    int number = 12;

    // numberが20より小さいとき、どちらでもないときの条件分岐を追加してください
    if (number < 10) {
      System.out.println("10より小さい");
    } else if (number < 20) {
      System.out.println("10以上、20より小さい");
    } else {
      System.out.println("20以上");
    }

    int n = 1;

    // switch文を用いて、変数nの値に応じて条件分岐をしてください
    switch (n) {
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("吉です");
        break;
      default:
        System.out.println("凶です");
        break;
    }

    int number = 10;

    // while文を用いて、numberが0より大きい場合に繰り返す、繰り返し処理を作ってください
    while (number > 0) {
      System.out.println(number);
      number--;
    }
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + "回目のループです");
    }
    
    System.out.println("=== while文 ===");
    int i = 1;
    while (i < 10) {
      // iが5の倍数のとき、繰り返し処理を終了してください
      if (i % 5 == 0) {
        break;
      }
      System.out.println(i);
      i++;
    }
    
    System.out.println("=== for文 ===");
    for (int j = 1; j < 10; j++) {
      // jが3の倍数のとき、処理をスキップしてください
      if (j % 3 == 0) {
        continue;
      }
      System.out.println(j);
    }
    
  }
}