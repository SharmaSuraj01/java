//abstract class Checkpoint {
//    String checkpointId;
//    String locationName;
//    double distanceFromLast;
//    double expectedDuration;
//    double actualDuration;
//
//    public Checkpoint(String id, String name, double distance, double expected, double actual) {
//        this.checkpointId = id;
//        this.locationName = name;
//        this.distanceFromLast = distance;
//        this.expectedDuration = expected;
//        this.actualDuration = actual;
//    }
//
//    boolean isDelayed() {
//        return actualDuration > expectedDuration;
//    }
//
//    abstract String getType();
//    abstract boolean isCritical();
//    abstract double calculatePenalty();
//
//    public String getCheckpointId() {
//        return checkpointId;
//    }
//}
//
//// Delivery Checkpoint
//class DeliveryCheckpoint extends Checkpoint {
//    public DeliveryCheckpoint(String id, String name, double distance, double expected, double actual) {
//        super(id, name, distance, expected, actual);
//    }
//
//    @Override
//    String getType() {
//        return "DeliveryCheckpoint";
//    }
//
//    @Override
//    boolean isCritical() {
//        return true;
//    }
//
//    @Override
//    double calculatePenalty() {
//        if (isDelayed()) {
//            return (actualDuration - expectedDuration) * 2;
//        }
//        return 0;
//    }
//}
//
//// Fuel Checkpoint
//class FuelCheckpoint extends Checkpoint {
//    public FuelCheckpoint(String id, String name, double distance, double expected, double actual) {
//        super(id, name, distance, expected, actual);
//    }
//
//    @Override
//    String getType() {
//        return "FuelCheckpoint";
//    }
//
//    @Override
//    boolean isCritical() {
//        return true;
//    }
//
//    @Override
//    double calculatePenalty() {
//        return isDelayed() ? 10 : 0;
//    }
//}
//
//class RestCheckpoint extends Checkpoint {
//    public RestCheckpoint(String id, String name, double distance, double expected, double actual) {
//        super(id, name, distance, expected, actual);
//    }
//    public class
//}
//public class Logistics{
//    public static void main(String[] args) {
//
//    }
//}
