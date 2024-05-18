import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;


import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class JsonSerializerTest {

    private Logger loggerFactory = LoggerFactory.getLogger(JsonSerializer.class);

    @Test
    public void testSerialize() {
        Person person = new Person();
        person.setName("Aramide");
        person.setDateOfBirth(LocalDate.now());
        person.setPhoneNumber("0903456732");
        person.setGender(Gender.SHIM);


        String json = JsonSerializer.serialize(person);

        String expected = "{\"name\":\"Aramide\",\"dateOfBirth\":\"2024-03-03\",\"phoneNumber\":\"0903456732\",\"gender\":\"SHIM\"}";
        assertEquals(expected, json);
    }

    @Test
    public void testDeserialize() throws JsonProcessingException {
        Person person = new Person("John", LocalDate.now(), "0903456732", Gender.MALE);
        String json = JsonSerializer.serialize(person);
        Person personFromJson = JsonSerializer.deserialize(json);


        assertNotNull(personFromJson);
        assertEquals(person.getDateOfBirth(), personFromJson.getDateOfBirth());
        assertEquals(Gender.MALE, personFromJson.getGender());

    }

}