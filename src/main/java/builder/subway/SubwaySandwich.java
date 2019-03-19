package builder.subway;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubwaySandwich {
  private BunType bunType;
  private MeatType meatType;
  private Set<Addon> addons;
  private Sauce sauce;




  public void setBunType(BunType bunType) {
    this.bunType = bunType;
  }

  public void setMeatType(MeatType meatType) {
    this.meatType = meatType;
  }

  public void setAddons(Set<Addon> addons) {
    this.addons = addons;
  }

  public void setSauce(Sauce sauce) {
    this.sauce = sauce;
  }

  public BunType getBunType() {
    return bunType;
  }

  public MeatType getMeatType() {
    return meatType;
  }

  public Set<Addon> getAddons() {
    return addons;
  }

  public Sauce getSauce() {
    return sauce;
  }
}
