package object;

class Phone {
  // field
  private String model;
  private int price;

  // method
  void print() {
    System.out.println(price + "원의 모델 " + model + " 휴대폰 입니다.");
  }

  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
}
