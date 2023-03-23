package Thursday6TaskTwo;



class Cinema {
            String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        this.seats[0][0] = "X";
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        row -=1;
        seat-=1;
        if (seats[row][seat] == "0") {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        row-=1;
        seat-=1;
        if (seats[row][seat].equals("X")) {
            seats[row][seat] = "0";
            return true;
        }
        return false;
    }
@Override
    public String toString() {
        String result = "";
        for (int i = 0; i < seats[i].length; i++) {
            result += "|";
            for (int j = 0; j < seats[j].length; j++) {
                result +=  "|";
            }
            result +="\n";
        }
       // assert result != null;
        return result.toString();
    }
}