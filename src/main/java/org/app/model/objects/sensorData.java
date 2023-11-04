package org.app.model.objects;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import static org.app.model.mappers.BaseMapper.sqltimeToProtoTime;

/**
 * @author | mbp-de-zakaria
 **/
public class sensorData implements Serializable {
    private String makeAndModel;
    private int destinationYear ;
    private List<Double> fluxCapacitorReadings;

    private Timestamp lastCheckIn;
    private boolean safetyBeltsOn;

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public int getDestinationYear() {
        return destinationYear;
    }

    public void setDestinationYear(int destinationYear) {
        this.destinationYear = destinationYear;
    }

    public List<Double> getFluxCapacitorReadings() {
        return fluxCapacitorReadings;
    }

    public void setFluxCapacitorReadings(List<Double> fluxCapacitorReadings) {
        this.fluxCapacitorReadings = fluxCapacitorReadings;
    }

    public Timestamp getLastCheckIn() {
        return lastCheckIn;
    }

    public void setLastCheckIn(Timestamp lastCheckIn) {
        this.lastCheckIn = lastCheckIn;
    }

    public boolean isSafetyBeltsOn() {
        return safetyBeltsOn;
    }

    public void setSafetyBeltsOn(boolean safetyBeltsOn) {
        this.safetyBeltsOn = safetyBeltsOn;
    }

}
