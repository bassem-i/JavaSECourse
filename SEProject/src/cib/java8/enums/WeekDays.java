package cib.java8.enums;

public enum WeekDays {
    SAT(1),SUN(2),MON(3),TUE(4),WED(5),THR(6),FRI(7);
    
    private int val;
    WeekDays(int val) {
        this.val = val;
    }


    public void setVal(int val) {
        this.val = val;
    }
    public int getVal() {
        return val;
    }
}