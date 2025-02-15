package Novicov.HomeWork02;

/**
 * Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
 * половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
 * Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
 * Вывести на экран кому сколько пиастров полагается
 * Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?
 * Дополнительное задание со звездочкой
 * Попробовать придумать как программа может проверить правильность дележа.
 */


public class HW02_3 {
    public static void main(String[] args) {

        int treasure = 1500;
        int piratesCount = 10;
        int treasureToCaptain = treasure / 2;
        int treasureToCommander = treasure - treasureToCaptain;
        int treasureToPirates = treasureToCommander / (piratesCount + 1);

        System.out.println("Капитан получит " + treasureToCaptain + " пиастров");
        System.out.println("Джек Воробей получит " + treasureToPirates * (piratesCount - 1) + " пиастров");

        // Проверка правильности дележа
        int totalPiratesTreasure = treasureToPirates * piratesCount;
        int totalCommanderTreasure = treasureToCommander - treasureToPirates;

        if (totalPiratesTreasure + totalCommanderTreasure == treasure) {
            System.out.println("Дележ пиастров корректен");
        } else {
            System.out.println("Дележ пиастров некорректен");
        }
    }
}
