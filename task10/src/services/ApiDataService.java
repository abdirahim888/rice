package services;
public class ApiDataService implements DataService {
    private String apiKey;
    public ApiDataService(String apiKey) {
        this.apiKey = apiKey;
    }
