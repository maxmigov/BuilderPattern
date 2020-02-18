public class SmartPhone {
    private final String brand;
    private final Integer year;
    private final String model;
    private final String diagonal;
    private final String memory;
    private final String cores;
    private final String battery;

    @Override
    public String toString() {
        return "SmartPhone { " +
                "brand = '" + brand + '\'' +
                ", year = " + year +
                ", model = '" + model + '\'' +
                ", diagonal = '" + diagonal + '\'' +
                ", memory = '" + memory + '\'' +
                ", cores = '" + cores + '\'' +
                ", battery = '" + battery + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public Integer getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public String getMemory() {
        return memory;
    }

    public String getCores() {
        return cores;
    }

    public String getBattery() {
        return battery;
    }

    public static class Builder {
        private final String brand;
        private final Integer year;
        private final String model;
        private final String diagonal;

        private String memory;
        private String cores;
        private String battery;

        public Builder(String brand, Integer year, String model, String diagonal) {
            this.brand = brand;
            this.year = year;
            this.model = model;
            this.diagonal = diagonal;
        }

        public Builder memory(String val) {
            memory = val;
            return this;
        }

        public Builder cores(String val) {
            cores = val;
            return this;
        }

        public Builder battery(String val) {
            battery = val;
            return this;
        }

        public SmartPhone build() {
            return new SmartPhone(this);
        }
    }

    private SmartPhone(Builder builder) {
        brand = builder.brand;
        year = builder.year;
        model = builder.model;
        diagonal = builder.diagonal;
        memory = builder.memory;
        cores = builder.cores;
        battery = builder.battery;
    }

    public static void main(String[] args) {
        SmartPhone newSmartPhone = new SmartPhone.Builder("nokia", 1999, "3510i", "3")
                .memory("128K")
                .cores("1")
                .battery("2500mAh")
                .build();
        System.out.println(newSmartPhone.toString());
    }

}