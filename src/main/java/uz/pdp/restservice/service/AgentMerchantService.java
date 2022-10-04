package uz.pdp.restservice.service;

import org.springframework.stereotype.Service;
import uz.pdp.restservice.model.AgentMerchantEntity;
import uz.pdp.restservice.model.admin.receive.AgentMerchantReceiveDto;
import uz.pdp.restservice.model.admin.response.ApiResponse;
import uz.pdp.restservice.service.base.BaseService;

import java.util.List;

@Service
public class AgentMerchantService implements BaseService<AgentMerchantReceiveDto, List<AgentMerchantEntity>,AgentMerchantEntity> {

    @Override
    public ApiResponse<Object> add(AgentMerchantReceiveDto agentMerchantReceiveDto) {
        return null;
    }

    @Override
    public ApiResponse<List<AgentMerchantEntity>> getList() {
        return null;
    }

    @Override
    public AgentMerchantEntity getById(long id) {
        return null;
    }

    @Override
    public ApiResponse<Object> delete(long id) {
        return null;
    }
}
