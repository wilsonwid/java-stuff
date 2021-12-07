class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStar;

    String getBrand() {
        return brand;
    }

    void setBrand(String newBrand) {
        brand = newBrand;
    }

    int getNumPickups() {
        return numOfPickups;
    }

    void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    boolean getRockStar() {
        return rockStar;
    }

    void setRockStar(boolean rockStarUses) {
        rockStar = rockStarUses;
    }
}

class ElectricGuitarDriver { 
    public static void main(String args[]){
        ElectricGuitar eg1 = new ElectricGuitar();
        System.out.println("EG1 brand: " + eg1.getBrand());
    }
}