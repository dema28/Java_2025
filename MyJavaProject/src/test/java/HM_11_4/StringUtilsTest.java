package HM_11_4;


import Novicov.HomeWork_11_4.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilsTest {

    @Test
    public void testIsPalindrome() {
        // Позитивные тесты
        Assert.assertTrue(StringUtils.isPalindrome("racecar")); // Палиндром
        Assert.assertTrue(StringUtils.isPalindrome("A man, a plan, a canal, Panama")); // Палиндром с пробелами и знаками препинания
        Assert.assertTrue(StringUtils.isPalindrome("12321")); // Числовой палиндром

        // Негативные тесты
        Assert.assertFalse(StringUtils.isPalindrome("hello")); // Не палиндром
        Assert.assertFalse(StringUtils.isPalindrome("12345")); // Не палиндром
        Assert.assertFalse(StringUtils.isPalindrome(null)); // null строка
    }

    @Test
    public void testEdgeCases() {
        // Граничные случаи
        Assert.assertTrue(StringUtils.isPalindrome("")); // Пустая строка
        Assert.assertTrue(StringUtils.isPalindrome("a")); // Один символ
        Assert.assertTrue(StringUtils.isPalindrome("Aa")); // Палиндром с разным регистром
    }
}