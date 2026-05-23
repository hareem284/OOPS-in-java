//public class DataSet { private double[] data; private int dataSize; 
// private double sum; public DataSet() { data = new double[100]; dataSize = 0; sum = 0; }
//  public void add(double value) { data[dataSize] = value; dataSize++; sum += value; }
//  public double getAverage() { if (dataSize == 0) { return 0; } else { return sum / dataSize; } }

//  // additional methods not shown } (a)

//  Write an instance method for the DataSet class called 
// ‘getStandardDeviation’ that returns the standard deviation of the values in the data array.
//  Assume that the data array is full and contains at least one value. (b) Assume that the DataSet 
// class has a ‘toString’ method that returns a string representation of the DataSet object. 
// Write a static method for the DataSet class called ‘calculateAverage’ that takes an array of 
// DataSet objects and returns the average of their averages, as a double. The array is guaranteed 
// to have at least one element.

import java.util.Arrays;

class DataSet {
    private double[] data;
    private int dataSize;
    private double sum;

    public DataSet() {
        data = new double[100];
        dataSize = 0;
        sum = 0;
    }

    public void add(double value) {
        // Optional safety check
        if (dataSize == data.length) {
            System.out.println("DataSet is full!");
            return;
        }
        data[dataSize] = value;
        dataSize++;
        sum += value;
    }

    public double getAverage() {
        return (dataSize == 0 ? 0 : sum / dataSize);
    }

    // Part (a): Calculate standard deviation
    public double getStandardDeviation() {
        if (dataSize == 0)
            return 0;

        double mean = getAverage();
        double sumOfSquares = 0.0;

        for (int i = 0; i < dataSize; i++) {
            double diff = data[i] - mean;
            sumOfSquares += diff * diff; // more efficient than Math.pow(diff, 2)
        }

        return Math.sqrt(sumOfSquares / dataSize);
    }

    // Part (b): Static method to compute average of averages
    public static double calculateAverage(DataSet[] datasets) {
        double total = 0.0;
        for (DataSet ds : datasets) {
            total += ds.getAverage();
        }
        return total / datasets.length;
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "data=" + Arrays.toString(data) +
                ", dataSize=" + dataSize +
                ", sum=" + sum +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        // Test Part (a): Standard Deviation
        DataSet dataset = new DataSet();
        dataset.add(10.0);
        dataset.add(3.7);
        dataset.add(4.5);
        System.out.println("Standard Deviation: " + dataset.getStandardDeviation());

        // Test Part (b): Average of Averages

        DataSet d1 = new DataSet();
        d1.add(20.00);
        d1.add(30.00);
        d1.add(40.00);

        DataSet d2 = new DataSet();
        d2.add(10.00);
        d2.add(20.00);
        d2.add(30.00);

        DataSet d3 = new DataSet();
        d3.add(30.00);
        d3.add(50.00);
        d3.add(10.00);

        DataSet[] datasets = { d1, d2, d3 };
        System.out.println("the average of the three datasets are : " + DataSet.calculateAverage(datasets));

    }
}