package ua.paik.hw13;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class Box {
    public static void main (String[] args) throws JsonProcessingException {
        String json = """
                {
                    "from": "China",
                    "material": "steel",
                    "color": "black",
                    "max-lifting-capacity": [
                        {
                            "unit": "kg",
                            "value": 150
                        }
                    ],
                    "cargo": [
                        {
                            "name": "electronics",
                            "class": "C-1"
                        }
                    ],
                    "delivery-date": "2021-09-20T11:07:00"
                }
                                
                """;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        System.out.println(objectMapper.readValue(json, BoxReader.class));
    }
}

