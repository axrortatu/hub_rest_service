package uz.pdp.restservice.service;

import org.springframework.stereotype.Service;
import uz.pdp.restservice.model.AgentEntity;
import uz.pdp.restservice.model.admin.receive.AgentReceiveDto;
import uz.pdp.restservice.model.admin.response.ApiResponse;
import uz.pdp.restservice.service.base.BaseService;

import java.util.List;

@Service
public class AgentService implements BaseService<AgentReceiveDto, List<AgentEntity>,AgentEntity> {
    @Override
    public ApiResponse<Object> add(AgentReceiveDto agentReceiveDto) {
        return null;
    }

    @Override
    public ApiResponse<List<AgentEntity>> getList() {
        return null;
    }

    @Override
    public AgentEntity getById(long id) {
        return null;
    }

    @Override
    public ApiResponse<Object> delete(long id) {
        return null;
    }
}
