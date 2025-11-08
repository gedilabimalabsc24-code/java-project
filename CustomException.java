import java.time.LocalDateTime;

public class CustomException extends Exception {
    private String timestamp;
    
    public CustomException(String message) {
        super(message);
        this.timestamp = LocalDateTime.now().toString();
    }
    
    @Override
    public String getMessage() {
        return super.getMessage() + " [" + timestamp + "]";
    }
}
