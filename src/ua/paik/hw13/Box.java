import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

public class Box {
    private String from;
    private String material;
    private String color;
    private MaxLiftingCapacity maxLiftingCapacity;
    private Cargo cargo;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime deliveryDate;


    public static class MaxLiftingCapacity {
        private String unit;
        private int value;
    }

    public static class Cargo {
        private String name;
        private String cargoClass;
    }
}
