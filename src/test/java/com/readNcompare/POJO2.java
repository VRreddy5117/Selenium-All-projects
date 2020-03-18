package com.readNcompare;

public class POJO2 {

    private String val;
    private long offset;

    public POJO2() {
    }

    public POJO2(String val, long offset) {
        this.val = val;
        this.offset = offset;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "{" +
                "val='" + val + '\'' +
                ", offset=" + offset +
                '}';
    }
}
