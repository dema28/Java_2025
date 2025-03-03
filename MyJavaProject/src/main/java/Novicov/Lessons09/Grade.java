package Novicov.Lessons09;

public class Grade {
    private final int numGrade;

    public Grade(int numGrade) {
        if (numGrade < 1 || numGrade > 5) {
            throw new IllegalArgumentException("Grade must be 1, 2, 3, 4, 5");
        }
        this.numGrade = numGrade;
    }

    public Grade(char letter) {
        this(numFromLetter(letter));
    }

    private static int numFromLetter(char letter) {
        switch (letter) {
            case 'A': return 5;
            case 'B': return 4;
            case 'C': return 3;
            case 'F': return 2;
            default: throw new IllegalArgumentException("Invalid letter grade");
        }
    }

    public int getNumGrade() {
        return numGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grade grade = (Grade) o;
        return numGrade == grade.numGrade;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(numGrade);
    }
}
