//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Restaurant[] restaurants = {
            new Restaurant("У моря", "рыбная", 4.6),
            new Restaurant("Сакура", "японская", 4.8),
            new Restaurant("ПиццаХаус", "итальянская", 4.2),
            new Restaurant("Хинкальная", "грузинская", 4.4)
    };

    for (Restaurant restaurant : restaurants) {
        System.out.printf("%s (%s): рейтинг %.1f%n",
                restaurant.getName(), restaurant.getCuisine(), restaurant.getRating());
    }
    System.out.printf("Средний рейтинг: %.2f%n", Restaurant.getAverageRating());
}
