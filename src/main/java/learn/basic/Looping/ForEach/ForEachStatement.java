package learn.basic.Looping.ForEach;

public class ForEachStatement {
  public static void main(String[] args) {
    // Inisialisasi data berbentuk array
    String[] cities = {"Surabaya", "Malang", "Jakarta", "Sidoarjo", "Jember"};

    // Melakukan looping foreach
    for (String city : cities) {
      System.out.println(city);
    }
  }
}
