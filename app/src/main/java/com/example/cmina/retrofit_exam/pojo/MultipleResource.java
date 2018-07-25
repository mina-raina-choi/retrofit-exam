package com.example.cmina.retrofit_exam.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class MultipleResource {

//    SerializedName 어노테이션은 JSON결과값에서 field이름을 나타냄.
    @SerializedName("page")
    public Integer page;

    @SerializedName("per_page")
    public Integer perPage;

    @SerializedName("total")
    public Integer total;

    @SerializedName("total_pages")
    public Integer totalPages;

    @SerializedName("data")
    public List<Datum> data = null;

    public class Datum {
        @SerializedName("id")
        public Integer id;
        @SerializedName("name")
        public String name;
        @SerializedName("year")
        public Integer year;
        @SerializedName("pantone_value")
        public String pantoneValue;
    }
}
