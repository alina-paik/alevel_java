package ua.paik.hw13;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.Arrays;

public class BoxReader {
    private String from;
    private String material;
    private String color;
    @JsonProperty("max-lifting-capacity")
    private MaxLiftingCapacity[] maxLiftingCapacity;
    private Cargo[] cargo;
    @JsonProperty("delivery-date")
    private LocalDateTime DeliveryDate;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDateTime getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        DeliveryDate = deliveryDate;
    }

    public MaxLiftingCapacity[] getMaxLiftingCapacity() {
        return maxLiftingCapacity;
    }

    public void setMaxLiftingCapacity(MaxLiftingCapacity[] maxLiftingCapacity) {
        this.maxLiftingCapacity = maxLiftingCapacity;
    }

    public Cargo[] getCargo() {
        return cargo;
    }

    public void setCargo(Cargo[] cargo) {
        this.cargo = cargo;
    }

    public static class MaxLiftingCapacity {
        private String unit;
        private int value;

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "MaxLiftingCapacity{" +
                    "unit='" + unit + '\'' +
                    ", value=" + value +
                    '}';
        }
    }

    public static class Cargo {
        private String name;
        @JsonProperty("class")
        private String boxClass;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBoxClass() {
            return boxClass;
        }

        public void setBoxClass(String boxClass) {
            this.boxClass = boxClass;
        }

        @Override
        public String toString() {
            return "Cargo{" +
                    "name='" + name + '\'' +
                    ", boxClass='" + boxClass + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "BoxReader{" +
                "from='" + from + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", maxLiftingCapacity=" + Arrays.toString(maxLiftingCapacity).replace("[", "").replace("]", "") +
                ", cargo=" + Arrays.toString(cargo).replace("[", "").replace("]", "") +
                ", DeliveryDate=" + DeliveryDate +
                '}';
    }
}

