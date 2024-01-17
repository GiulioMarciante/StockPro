public enum ProductTypes {
    TABLET,
    SMARTPHONE,
    NOTEBOOK;

    public static ProductTypes fromString(String value) {
        for (ProductTypes type : ProductTypes.values()) {
            if (type.name().equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Nessun enum corrispondente a " + value);
    }
    }