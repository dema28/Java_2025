package Novicov.HomeWork07_3;
/*
Тимми и Сара думают, что они влюблены, но в том месте, где они живут, они узнают об этом только тогда,
когда каждый из них сорвет по цветку. Если у одного из цветков четное количество лепестков,
а у другого — нечетное, это значит, что они влюблены.

Напишите функцию, которая будет принимать количество лепестков каждого цветка
и возвращать значение true, если они влюблены, и false, если нет.
 */
public class MainCW_2 {
    public static boolean areYouLove(int lemons, int oranges) {
        return (lemons % 2 == 0 && oranges % 2!= 0) || (lemons % 2!= 0 && oranges % 2 == 0);

    }
}


/*
public class OppositesAttract {

  public static boolean isLove(final int flower1, final int flower2) {
    return (flower1 % 2 == 0 && flower2 % 2!= 0) || (flower1 % 2!= 0 && flower2 % 2 == 0);
  }
}
 */