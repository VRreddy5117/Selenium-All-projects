package com.readNcompare;

public class POJO1 {
    private String duration;
    private String status;

    public POJO1 () {
    }

    public POJO1(String duration, String status) {
        this.duration = duration;
        this.status = status;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
                "duration='" + duration + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
