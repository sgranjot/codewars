package triangleArea;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;

// TODO: Replace examples and use TDD by writing your own tests
@TestMethodOrder(OrderAnnotation.class)
public class SolutionTest {

	Random r = new Random();
	public int test;
	private static String TEST_NAME = "Random Test: %d, size of the triangle";

	public String makeTri(int n) {
		String tri = "\n";
		for (int i = 1; i <= n; i++) {
			tri += ". ".repeat(i).trim() + "\n";
		}
		return (tri);
	}

	@Test
	@Order(1)
	@DisplayName("First triangle area")
	public void BasicTest1() {
		assertEquals(.5, Kata.tArea(makeTri(2)), 0.02);
	}

	@Test
	@Order(2)
	@DisplayName("Second triangle area")
	public void BasicTest2() {
		assertEquals(8.0, Kata.tArea(makeTri(5)), 0.02);
	}

	@Test
	@Order(3)
	@DisplayName("Third triangle area")
	public void BasicTest3() {
		assertEquals(32.0, Kata.tArea(makeTri(9)), 0.02);
	}

	@Test
	@Order(4)
	@DisplayName("Forth triangle area")
	public void BasicTest4() {
		assertEquals(2.0, Kata.tArea(makeTri(3)), 0.02);
	}

	@BeforeEach
	void randomValue() {
		test = r.nextInt(400) + 5;
	}

	@RepeatedTest(100)
	@Order(5)
	@DisplayName("Randoms Tests")
	public void RandomTests() {
		String testName = String.format(TEST_NAME, test);
		assertEquals((float) (test * test) / 2f, Kata.tArea(makeTri(test + 1)), 0.02, testName);
	}
}
