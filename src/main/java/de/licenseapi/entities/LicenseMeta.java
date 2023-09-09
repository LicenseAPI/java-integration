package de.licenseapi.entities;

public class LicenseMeta {

    private final String key;
    private final String value;

    /**
     * Constructor of the {@link LicenseMeta} class. It contains the key and the value of the meta.
     * <p>
     * You can define the meta in the project dashboard.
     * </p>
     *
     * @param key   The key of the meta information
     * @param value The value of the meta information
     */
    public LicenseMeta(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Gets the key of the meta information
     *
     * @return the key of the meta information
     */
    public String getKey() {
        return key;
    }

    /**
     * Gets the value of the meta information
     *
     * @return the value of the meta information
     */
    public String getValue() {
        return value;
    }

}
