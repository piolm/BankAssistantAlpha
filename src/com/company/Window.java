package com.company;

public class Window implements VisitorCalls {
    private String taloonNow;

    @Override
    public String toString() {
         return "window t = " + taloonNow;
    }

    public String getTaloonNow() {
        return taloonNow;
    }

    public void setTaloonNow(String taloonNow) {
        this.taloonNow = taloonNow;
    }

    public boolean ready(){return taloonNow==null;};

    @Override
    public void onVisitorCall() {

    }

    @Override
    public void onVisitorGone() {

    }

    public enum Op {
        CREDIT,
        CARD,
        PAYMENTS,
        BUSINESS,
        GET_DOCUMENTS
    }
    private Op type;
    private int windowNum;
}
