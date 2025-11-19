public class ProductRating {
    public static void main(String[] args) {
        
        int[][] ratings = {
            {4, 5, 4}, 
            {3, 5, 3}, 
            {4, 5, 3}, 
            {1, 2, 1}  
        };

        int customers = ratings.length;
        int criteria = ratings[0].length;

        
        System.out.println("Rating Product Package Delivery");

        
        double[] criterionAvg = new double[criteria];
        for (int j = 0; j < criteria; j++) {
            int sum = 0;
            for (int i = 0; i < customers; i++) {
                sum += ratings[i][j];
            }
            criterionAvg[j] = (double) sum / customers;
        }

        
        System.out.print("Average ");
        for (int j = 0; j < criteria; j++) {
            System.out.printf("%.2f\t", criterionAvg[j]);
        }
        System.out.println();

        
        for (int i = 0; i < customers; i++) {
            int sum = 0;
            for (int j = 0; j < criteria; j++) {
                sum += ratings[i][j];
            }
            double avg = (double) sum / criteria;
            System.out.printf("Customer %d provide the average rating %.2f%n", i + 1, avg);
        }
    }
}
