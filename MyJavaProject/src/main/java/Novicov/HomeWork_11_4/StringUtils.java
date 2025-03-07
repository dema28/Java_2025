package Novicov.HomeWork_11_4;


public class StringUtils {

    /**
     * Проверяет, является ли строка палиндромом.
     *
     * @param str строка для проверки
     * @return true, если строка является палиндромом, иначе false
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Убираем небуквенные символы и приводим к нижнему регистру
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }
}