package com.b2b.hotel.in.mapper;

import com.b2b.hotel.in.dto.rate.DatewiseRate;
import com.b2b.hotel.in.dto.rate.DatewiseRateIntoDatabase;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-14T23:24:10+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class DateWiseRateMapperImpl implements DateWiseRateMapper {

    @Override
    public DatewiseRateIntoDatabase dateWiseRateToDatewiseRateIntoDatabase(DatewiseRate datewiseRate) {
        if ( datewiseRate == null ) {
            return null;
        }

        DatewiseRateIntoDatabase.DatewiseRateIntoDatabaseBuilder datewiseRateIntoDatabase = DatewiseRateIntoDatabase.builder();

        datewiseRateIntoDatabase.agentId( datewiseRate.getAgentId() );
        datewiseRateIntoDatabase.roomRates( mapRoomRates( datewiseRate ) );
        datewiseRateIntoDatabase.hotelId( datewiseRate.getHotelId() );
        datewiseRateIntoDatabase.hotelCode( datewiseRate.getHotelCode() );
        datewiseRateIntoDatabase.flowId( datewiseRate.getFlowId() );

        return datewiseRateIntoDatabase.build();
    }
}
