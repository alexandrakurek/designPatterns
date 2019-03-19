package abstractfactory.koszyk;

import lombok.Data;

@Data
public class Pear extends Fruit {

  private double sourness = 1;
  private Color color = Color.GREEN;
  private String type;

  public Pear(String type) {
    this.type = type;
  }

  @Override
  public String getSummary() {
    return String.format("Pear %s %s, sourness: %s",
        color, type, sourness);
  }

  @Override
  public double getSourness() {
    return sourness;
  }

  @Override
  public Color getColor() {
    return color;
  }

  public String getType() {
    return type;
  }
}
