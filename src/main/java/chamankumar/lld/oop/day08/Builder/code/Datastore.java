package chamankumar.lld.oop.day08.Builder.code;

import lombok.Getter;

/**
 * Datastore class demonstrating the Builder design pattern.
 * This pattern is used to create complex objects step-by-step while ensuring immutability and validation.
 */
@Getter
public class Datastore {

    // Fields representing the Datastore configuration
    private String host;
    private Integer port;
    private String username;
    private String password;
    private Long id;
    private DatabaseType type;

    // Step 1: Hide the outer constructor to prevent direct instantiation
    private Datastore() {}

    /**
     * Static initializer to create a builder instance.
     * @return A new instance of DatastoreBuilder.
     */
    public static DatastoreBuilder builder() {
        return new DatastoreBuilder();
    }

    /**
     * Static inner class implementing the Builder pattern.
     * Responsible for constructing Datastore objects.
     */
    public static class DatastoreBuilder {

        // Step 3: Use a single instance of the outer class to avoid duplicate fields
        private final Datastore datastore;

        // Step 2: Initialize the builder with a new Datastore instance
        public DatastoreBuilder() {
            this.datastore = new Datastore();
        }

        /**
         * Step 4: Fluent interface for setting host and port.
         * @param host The host of the datastore.
         * @param port The port of the datastore.
         * @return The current builder instance.
         */
        public DatastoreBuilder init(String host, Integer port) {
            datastore.host = host;
            datastore.port = port;
            return this;
        }

        /**
         * Fluent interface for setting the type to MySQL.
         * @return The current builder instance.
         */
        public DatastoreBuilder mySQL() {
            datastore.type = DatabaseType.MY_SQL;
            return this;
        }

        /**
         * Step 5: Build method to create the Datastore object.
         * Validates the object before creation.
         * @return A valid Datastore object.
         * @throws RuntimeException If validation fails.
         */
        public Datastore build() {
            if (!validate()) {
                throw new RuntimeException("Object is not valid");
            }
            return datastore;
        }

        /**
         * Validation hook to ensure the Datastore object is valid.
         * @return True if the object is valid, false otherwise.
         */
        public boolean validate() {
            return datastore.type != null;
        }
    }
}