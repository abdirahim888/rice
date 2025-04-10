package services;
public class Main {
    public static void main(String[] args) {
        DataService apiService = new ApiDataService("API-123-XYZ");
        DataProcessor processor1 = new DataProcessor(apiService);
        processor1.execute();
        DataService fileService = new FileDataService("/data/input.txt");
        DataProcessor processor2 = new DataProcessor(fileService);
        processor2.execute();
    }
}
