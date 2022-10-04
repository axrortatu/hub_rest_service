package uz.pdp.restservice.service;

import org.springframework.stereotype.Service;
import uz.pdp.restservice.model.GatewayEntity;
import uz.pdp.restservice.model.GatewayMerchantEntity;
import uz.pdp.restservice.model.admin.receive.GatewayMerchantReceiveDto;
import uz.pdp.restservice.model.admin.response.ApiResponse;
import uz.pdp.restservice.service.base.BaseService;

import java.util.List;

@Service
public class GatewayMerchantService implements BaseService<GatewayMerchantReceiveDto, List<GatewayMerchantEntity>, GatewayMerchantEntity> {
    @Override
    public ApiResponse<Object> add(GatewayMerchantReceiveDto gatewayMerchantReceiveDto) {
        return null;
    }

    @Override
    public ApiResponse<List<GatewayMerchantEntity>> getList() {
        return null;
    }

    @Override
    public GatewayMerchantEntity getById(long id) {
        return null;
    }

    @Override
    public ApiResponse<Object> delete(long id) {
        return null;
    }
}
