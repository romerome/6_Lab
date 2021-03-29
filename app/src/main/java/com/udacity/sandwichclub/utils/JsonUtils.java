package com.udacity.sandwichclub.utils;

import com.google.gson.Gson;
import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class JsonUtils {

    private static final String NAME = "name";
    private static final String MAIN_NAME = "mainName";

    public static Sandwich parseSandwichJson(String json) {

        try {
            Gson gson = new Gson();
            Sandwich sandwich = gson.fromJson(json, Sandwich.class);

            JSONObject root = new JSONObject(json);
            JSONObject name = root.getJSONObject(NAME);
            sandwich.setMainName(name.getString(MAIN_NAME));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
