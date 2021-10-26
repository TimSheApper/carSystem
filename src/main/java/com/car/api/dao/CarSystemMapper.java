package com.car.api.dao;

import com.car.api.entity.Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CarSystemMapper {

    void saveVehicleEntryInfo(Info info);

    void saveVehicleExitInfo(Info info);
}
