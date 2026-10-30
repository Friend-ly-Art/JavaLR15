public class Restaurant {
    private final String name;
    private final String cuisine;
    private final double rating;

    private static int totalRestaurants;
    private static double totalRating = 0;

    public Restaurant(String name, String cuisine, double rating) {
        if (name == null || name.isBlank() || cuisine == null || cuisine.isBlank()) {
            throw new IllegalArgumentException("Название ресторана и кухня обязательны.");
        }
        if (!Double.isFinite(rating) || rating < 0 || rating > 5) {
            throw new IllegalArgumentException("Рейтинг должен быть от 0 до 5.");
        }
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
        totalRestaurants++;
        totalRating += rating;
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public double getRating() {
        return rating;
    }

    public static double getAverageRating() {
        return totalRestaurants == 0 ? 0.0 : totalRating / totalRestaurants;
    }
}
