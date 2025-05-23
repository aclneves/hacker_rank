package tutorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {
    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double value_tipPercent = (meal_cost * tip_percent) / 100 ;
        double value_taxPercent = (meal_cost * tax_percent) / 100 ;
        double totalCost = meal_cost + value_tipPercent + value_taxPercent;
        System.out.println(Math.round(totalCost));
    }

}

public class Day2Operators {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
