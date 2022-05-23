package com.example.taskmanager.json;

import com.example.taskmanager.domain.Task;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;

public class JsonProcessing {

    public static final Path path = Path.of("src", "main", "resources", "data.json");
    public static GsonBuilder gsonBuilder = new GsonBuilder();

    public static void serialize(ArrayList<Task> list) throws IOException {
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateSerializer());
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        String gsonToJson = gson.toJson(list);
        System.out.println(gsonToJson);
        Files.write(path, gsonToJson.getBytes());
    }

    public static ArrayList<Task> deserialize() {
        String json = null;
        try {
            json = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateDeserializer());
        Gson gson = gsonBuilder.setPrettyPrinting().create();

        Type taskArrayList = new TypeToken<ArrayList<Task>>() {}.getType();
        return gson.fromJson(json, taskArrayList);
    }
}
