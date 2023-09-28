import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debtTracker;

    public IOU() {
        this.debtTracker = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.debtTracker.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.debtTracker.getOrDefault(toWhom, Double.valueOf(0));
    }
}
