package exercise;

public class Line implements Comparable{
  int length;

  public Line(int length){
    this.length = length;
  }

  @Override
  public String toString() {
    return "Line[" +
        "length=" + length +
        ']';
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Line) {
      Line line = (Line) o;

      if (this.length > line.length) {
        return 1;
      } else if (this.length < line.length) {
        return -1;
      } else {
        return 0;
      }
    }
    return -999;
  }
}
