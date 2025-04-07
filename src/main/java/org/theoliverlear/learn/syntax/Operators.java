package org.theoliverlear.learn.syntax;

public class Operators {
    //-------------------------Logical-Operators------------------------------
    public static void logicalOperators() {
        //----------------------------AND-------------------------------------
        boolean carHasOil = true;
        boolean carHasGas = false;
        /* |  X  |  Y  | AND |
         * |-----|-----|-----|
         * |  F  |  F  |  F  |
         * |  F  |  T  |  F  |
         * |  T  |  F  |  F  |
         * |  T  |  T  |  T  |
         */
        boolean carIsReady = carHasOil && carHasGas;
        System.out.printf("""
                Car has oil: %b,
                Car has gas: %b,
                Car is ready: %b%n""", carHasOil, carHasGas, carIsReady);
        //-----------------------------OR-------------------------------------
        boolean carIsHot = true;
        boolean carIsCold = false;
        /* |  X  |  Y  | OR  |
         * |-----|-----|-----|
         * |  F  |  F  |  F  |
         * |  F  |  T  |  T  |
         * |  T  |  F  |  T  |
         * |  T  |  T  |  T  |
         */
        boolean carIsUncomfortable = carIsHot || carIsCold;
        System.out.printf("""
                Car is hot: %b,
                Car is cold: %b,
                Car is uncomfortable: %b%n""", carIsHot, carIsCold, carIsUncomfortable);
        //----------------------------Not-------------------------------------
        /* |  X  | NOT |
         * |-----|-----|
         * |  F  |  T  |
         * |  T  |  F  |
         */
        boolean carIsNotReady = !carIsReady;
        System.out.printf("""
                Car is ready: %b,
                Car is not ready: %b%n""", carIsReady, carIsNotReady);
        //----------------------Mixed-Operations------------------------------
        boolean carHasPeople = true;
        boolean cannotDrive = carIsNotReady && !carHasPeople;
        System.out.printf("""
                Car is not ready: %b,
                Car has people: %b,
                Cannot drive: %b%n""", carIsNotReady, carHasPeople, cannotDrive);
        //------------------------Exclusive-OR--------------------------------
        boolean hasLeatherSeats = true;
        boolean hasVinylSeats = false;
        /* |  X  |  Y  | XOR |
         * |-----|-----|-----|
         * |  F  |  F  |  F  |
         * |  F  |  T  |  T  |
         * |  T  |  F  |  T  |
         * |  T  |  T  |  F  |
         */
        boolean hasSpecialSeatMaterial = hasLeatherSeats ^ hasVinylSeats;
        System.out.printf("""
                Has leather seats: %b,
                Has vinyl seats: %b,
                Has special seat material: %b%n""", hasLeatherSeats, hasVinylSeats, hasSpecialSeatMaterial);
    }
    //------------------------Arithmetic-Operators----------------------------
    public static void arithmeticOperators() {
        double totalRevenue = 0.0;
        int numCustomers = 10;
        float pricePerTicket = 12.50F;
        //-----------------------Core-Operators-------------------------------
        int repeatViewers = numCustomers / 5;
        numCustomers += repeatViewers;
        totalRevenue += numCustomers * pricePerTicket;
        float movieLicense = 400.0F;
        totalRevenue -= movieLicense;
        double profitPerViewer = totalRevenue / numCustomers;
        //--------------------Increment-Decrement-----------------------------
        int remainingCustomers = numCustomers;
        int footTraffic = 0;
        while (remainingCustomers > 0) {
            remainingCustomers--;
            footTraffic++;
        }
        //--------------------------Modulus-----------------------------------
        int rowOneNumSeats = 10;
        if (rowOneNumSeats % 2 == 0) {
            System.out.println("Row one has an even number of seats.");
        } else {
            System.out.println("Row one has an odd number of seats.");
        }
        //--------------------Comparison-Operators----------------------------
        if (totalRevenue < 0) {
            System.out.println("Shut it down. We're losing money.");
        } else if (totalRevenue > 0) {
            System.out.println("We're making money!");
        }
        if (totalRevenue == 0) {
            System.out.println("We're breaking even.");
        }
        if (totalRevenue <= movieLicense) {
            System.out.println("We've effectively made no money.");
        }
        if (repeatViewers >= (numCustomers / 3)) {
            System.out.println("It's a cult classic hit!");
        }
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        System.out.println("Logical Operators:");
        logicalOperators();
        System.out.println("Arithmetic Operators:");
        arithmeticOperators();
    }
}
