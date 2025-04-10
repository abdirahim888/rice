package services;
public class FileDataService implements DataService {
    private String filePath;
    public FileDataService(String filePath) {
        this.filePath = filePath;
    }
