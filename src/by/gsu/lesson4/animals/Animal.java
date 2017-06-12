package by.gsu.lesson4.animals;

import javafx.beans.binding.ObjectExpression;

public class Animal {

    private boolean healthy = false;

    void heal() {
        healthy = true;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Animal)) return false;

        Animal other = (Animal) o;

        return other.healthy == this.healthy;
    }
}
