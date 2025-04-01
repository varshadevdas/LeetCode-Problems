class Waterbottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;

        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int rembottles = numBottles % numExchange;

            ans += newBottles;
            numBottles = newBottles + rembottles; // Update numBottles correctly
        }
        return ans;
    }
}
