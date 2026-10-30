import java.util.ArrayList;
import java.util.List;

public class University {
    private final int id;
    private final String name;
    private final String country;
    private int rank;
    private final List<Integer> studentRatings;

    public University(int id, String name, String country, int rank, List<Integer> studentRatings) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.rank = rank;
        this.studentRatings = new ArrayList<>(studentRatings);
    }

    public double getAverageRating() {
        if (studentRatings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int rating : studentRatings) {
            sum += rating;
        }
        return (double) sum / studentRatings.size();
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if (rank < 1) {
            throw new IllegalArgumentException("Ранг должен быть положительным числом.");
        }
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, %s (%s), ранг: %d, средний рейтинг: %.2f",
                id, name, country, rank, getAverageRating());
    }

    public static void printUniversities(List<University> universities, int rank) {
        System.out.println("Университеты с рангом " + rank + ":");
        boolean found = false;
        for (University university : universities) {
            if (university.getRank() == rank) {
                System.out.println(university);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет университетов с таким рангом.");
        }
    }
}