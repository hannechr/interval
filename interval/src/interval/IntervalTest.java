package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	@Test
	void test() {
		Interval interval = new Interval(5,8);
		interval.setLowerBound(3);
		interval.setUpperBound(7);

		int width = interval.getWidth();
		assert width == 4;
	}

}
