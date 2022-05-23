package com.example.taskmanager.domain;

import com.google.gson.annotations.SerializedName;

public enum TaskCategory {
    @SerializedName("Home") HOME,
    @SerializedName("Work") WORK,
    @SerializedName("Study") STUDY

}