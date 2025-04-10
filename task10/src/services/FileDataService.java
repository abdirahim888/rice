package services;
public class FileDataService implements DataService {
    private String filePath;
    public FileDataService(String filePath) {
        this.filePath = filePath;
    }
    @Override
    public void performTask() {
        System.out.println("Reading data from file: " + filePath);
    }
}
