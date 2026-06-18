class Solution {
    public double angleClock(int hour, int minutes) {
        double ang = Math.abs(30*hour - 5.5*minutes);
        return (double) Math.min(ang,Math.abs(360-ang));
    }
}