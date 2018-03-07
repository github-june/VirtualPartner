package com.famgy.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by famgy on 3/7/18.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {

        public String info;
    }
}
