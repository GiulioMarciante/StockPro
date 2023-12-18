public enum DeviceTypes {
    TABLET,
    SMARTPHONE,
    NOTEBOOK;

    public static DeviceTypes fromString(String value) {
        for (DeviceTypes type : DeviceTypes.values()) {
            if (type.name().equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Nessun enum corrispondente a " + value);
    }
    }