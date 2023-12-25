package com.bountiful.loyaltysystem.persistence.entities;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class GenderDeserializer extends StdDeserializer<Gender> {


    protected GenderDeserializer(Class<?> vc) {
        super(Gender.class);
    }


    @Override
    public Gender deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        var node = jsonParser.getCodec().readTree(jsonParser);
        var value = node.get("value").asToken().asString();
        for (var gender : Gender.values()
             ) {
            if (gender.name().equalsIgnoreCase(value))
                return  gender;
        }
        return null;
    }
}
