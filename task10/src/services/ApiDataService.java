package services;
public class ApiDataService implements DataService {
    private String apiKey;
    public ApiDataService(String apiKey) {
        this.apiKey = apiKey;
    }
    @Override
    public void performTask() {
        System.out.println("Fetching data from API using key: " + apiKey);
    }
}
