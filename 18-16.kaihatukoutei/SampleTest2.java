package comexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SampleTest2 {
	
	@Nested
	class getColor {
		@Test
		void success() {
			assertEquals("赤", Sample.getColor(1));
			assertEquals("緑", Sample.getColor(2));
			assertEquals("青", Sample.getColor(3));
		}
		@Test
		@DisplayName("引数エラー")
		void fail() {
			assertThrows(IllegalArgumentException.class, () -> {
				Sample.getColor(99);
			});
		}
	}
}
