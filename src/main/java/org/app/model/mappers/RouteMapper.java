package org.app.model.mappers;

import org.app.model.objects.sensorData;

/**
 * @author | mbp-de-zakaria
 **/
public class RouteMapper {
    public static byte[] getSensorDataResponse(sensorData data){
        return data.toBuffer().toByteArray();
    }
}
