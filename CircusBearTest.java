import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class CircusBearTest{
  CircusBear circusBear;
  Edible salmon;
  Edible steak;
  Edible tophat;

  @Before
  public void before(){
    circusBear = new CircusBear();
    Edible salmon = new Salmon();
    Edible steak = new Steak();
    Edible tophat = new TopHat();
  }

  @Test
  public void canEat(){
    circusBear.eat(steak);
    assertEquals(1, circusBear.foodCount());
  }

  @Test
  public void cannotEatWhenBellyFull(){
    for (int i = 0; i < 12; i++){
      circusBear.eat(salmon);
    }
    assertEquals(10, circusBear.foodCount());
  }

// Now can eat steak
  @Test
  public void cantEatSteak(){
    // This will cause a compilation error
    circusBear.eat(steak);
  }
}