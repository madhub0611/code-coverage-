import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    
    @Test
    void testIsPalindrome() {
        // Test cases for isPalindrome function
        assertTrue(Palindrome.isPalindrome("racecar"));
        assertTrue(Palindrome.isPalindrome("level"));
        assertTrue(Palindrome.isPalindrome("A man, a plan, a canal, Panama"));
        assertFalse(Palindrome.isPalindrome("hello"));
        }
      }  
