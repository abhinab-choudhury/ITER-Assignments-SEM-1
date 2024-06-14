package DSA_MinorProject.Code;

public class Date {
  private int day, year;
  private String month;

  Date(int day, String month, int year) {
    this.day = day;
    this.year = year;
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public int getYear() {
    return year;
  }

  public String getMonth() {
    return month;
  }

  public String toString() {
    return day + "-" + month + "-" + year;
  }

}
