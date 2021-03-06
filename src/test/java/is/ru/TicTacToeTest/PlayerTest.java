package is.ru.TicTacToe;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import org.hamcrest.Matcher;
import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static java.lang.String.format;
import java.lang.AssertionError;
import org.junit.rules.ExpectedException;
import static org.hamcrest.core.IsEqual.equalTo;


public class PlayerTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.PlayerTest");
    }

	@Test
	public void testPlayer1Name() {
		Player p = new Player("Gummi", 'o');
		p.setName("Mummi");
		assertEquals("Mummi", p.getName());
	}

	@Test
	public void  testIncreaseScore1 (){
		Player p = new Player("Gummi", 'o');
		p.increaseScore();
		assertEquals(1, p.getScore());
	}
	@Test
	public void testIncreaseScore2 () {
		Player p = new Player("Gummi", 'o');
		Player q = new Player("Bubbi", 'x');
		q.increaseScore();
		assertEquals(0, p.getScore());
	}
	@Test
	public void testIncreaseScore3() {
		Player p = new Player("Gummi", 'o');
		p.increaseScore();
		p.increaseScore();
		assertEquals(2, p.getScore());
	}

}
