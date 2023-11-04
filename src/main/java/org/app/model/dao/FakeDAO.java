package org.app.model.dao;

import org.app.model.objects.sensorData;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author | mbp-de-zakaria
 **/
public class FakeDAO {
    public FakeDAO() {}

    public sensorData getSensorDataFromVehicleDB(){
        sensorData data = new sensorData();
        data.setMakeAndModel("Volkswagen , Jetta");
        data.setDestinationYear(2025);
        data.setFluxCapacitorReadings(List.of(1234567.00,5244.00,998820.00));
        data.setLastCheckIn(new Timestamp(System.currentTimeMillis()));
        data.setSafetyBeltsOn(true);

        return data;
    }
}
