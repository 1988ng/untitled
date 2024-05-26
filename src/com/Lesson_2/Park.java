package com.Lesson_2;

/**
 *
 */
 public class Park {

    private String parkName;
    private Attraction[] attractions;

    public Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new Attraction[0];
    }

    public void addAttraction(String attractionName, String openingTime, String closingTime, double price) {
        Attraction attraction = new Attraction(attractionName, openingTime, closingTime, price);

        Attraction[] newAttractions = new Attraction[attractions.length + 1];

        for (int i = 0; i < attractions.length; i++) {
            newAttractions[i] = attractions[i];
        }

        newAttractions[attractions.length] = attraction;

        attractions = newAttractions;
    }

    public void displayAttractions() {
        System.out.println("Аттакционы в " + parkName + ":");
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    private class Attraction {
        private String attractionName;
        private String openingTime;
        private String closingTime;
        private double price;

        public Attraction(String attractionName, String openingTime, String closingTime, double price) {
            this.attractionName = attractionName;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Аттракционы: " + attractionName + ", Открытие: " + openingTime + ", Закрытие: " + closingTime + ", Прайс: " + price;
        }
    }
}
