package com.example.deepakrattan.parcelabledemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by deepak.rattan on 1/1/2017.
 */

public class Student implements Parcelable {
    String name, age, course;

    public Student(String name, String age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    //Retrieving student data from Parcel object
    protected Student(Parcel in) {
        this.name = in.readString();
        this.age = in.readString();
        this.course = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    //Storing student data to Parcel object
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(age);
        parcel.writeString(course);
    }
}
