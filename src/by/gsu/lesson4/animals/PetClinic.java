package by.gsu.lesson4.animals;

public class PetClinic {
    private Pet currentPet;


    public Pet getCurrentPet() {
        return currentPet;
    }

    public void work() {
        if (currentPet != null) {
            currentPet.heal();
        }
    }

    public void setCurrentPet(Pet currentPet) {
        if (this.currentPet == null || this.currentPet != currentPet) {
            if (!currentPet.isHealthy()) {
                this.currentPet = currentPet;
            }
        }
    }
}
