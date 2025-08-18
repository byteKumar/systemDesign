package com.chamankumar.lld.oop.day08.Builder;

import chamankumar.lld.oop.day08.Builder.code.Database;
import chamankumar.lld.oop.day08.Builder.code.DatabaseType;
import chamankumar.lld.oop.day08.Builder.code.Datastore;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DatabaseTest {

    @Test
    public void testConstructor() {
        Database database = new Database("localhost", 4533, "username", "password", 1L, DatabaseType.MY_SQL);
        assertNotNull(database, "If constructor is called object should not be null");
    }

    @Test
    public void testInvalidPort() {
        Database database = new Database("localhost", 2001, "username", "password", 1L, DatabaseType.MY_SQL);
    }

    @Test
    public void testSetter() {
        Database database = new Database();
        database.setHost("localhost");
        database.setPort(4553);

        assertEquals("localhost", database.getHost(), "if host setter is called, host should be localhost");
    }

    @Test
    public void testHashMapConstructor() {
        Map<String, Object> values = new HashMap<>();
        values.put("host", "localhost");
        values.put("port", 3306);
        values.put("type", DatabaseType.MY_SQL);

        Database database = new Database(values);
        assertEquals("localhost", database.getHost(), "if host setter is called, host should be localhost");
        assertEquals(DatabaseType.MY_SQL, database.getType(), "if type setter is called, type should be MY_SQL");
    }

    @Test
    public void testBuilder() {

        Datastore database = Datastore
                .builder()
                .mySQL()
                .init("localhost", 3303)
                .build();

        assertEquals("localhost", database.getHost(), "if host setter is called, host should be localhost");
        assertEquals(DatabaseType.MY_SQL, database.getType(), "if type setter is called, type should be MY_SQL");

    }

    @Test
    public void testLombokBuilder() {
        Database database = Database.builder().host("localhost").port(4000).build();

        assertEquals("localhost", database.getHost(), "if host setter is called, host should be localhost");
        assertEquals(4000, database.getPort(), "if port setter is called, type should be 4000");
    }

}
