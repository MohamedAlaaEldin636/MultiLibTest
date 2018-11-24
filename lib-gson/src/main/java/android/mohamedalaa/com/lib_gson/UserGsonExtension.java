package android.mohamedalaa.com.lib_gson;

import android.mohamedalaa.com.lib_core.User;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Mohamed on 11/24/2018.
 *
 */
public class UserGsonExtension extends User {

    /**
     * test.
     * @param user param.
     * @return return.
     */
    public static String convertUserToJsonString(User user){
        if (user == null){
            return null;
        }

        Gson gson = new GsonBuilder()
                .serializeNulls()
                .setLenient()
                .create();

        return gson.toJson(user);
    }

    public static User convertJsonStringToUser(String jsonString){
        if (jsonString == null || jsonString.isEmpty()){
            return null;
        }

        Gson gson = new GsonBuilder()
                .serializeNulls()
                .setLenient()
                .create();

        return gson.fromJson(jsonString, User.class);
    }

}
