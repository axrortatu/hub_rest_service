package uz.pdp.restservice.service;

import org.springframework.stereotype.Service;
import uz.pdp.restservice.model.GatewayEntity;
import uz.pdp.restservice.model.admin.receive.GatewayReceiveDto;
import uz.pdp.restservice.model.admin.response.ApiResponse;
import uz.pdp.restservice.service.base.BaseService;

import java.util.List;

@Service
public class GatewayService implements BaseService<GatewayReceiveDto, List<GatewayEntity>,GatewayEntity> {
    @Override
    public ApiResponse<Object> add(GatewayReceiveDto gatewayReceiveDto) {
        return null;
    }

    @Override
    public ApiResponse<List<GatewayEntity>> getList() {
        return null;
    }

    @Override
    public GatewayEntity getById(long id) {
        return null;
    }

    @Override
    public ApiResponse<Object> delete(long id) {
        return null;
    }
}
