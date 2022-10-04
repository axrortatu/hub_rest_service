package uz.pdp.restservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "db.agent")
public class AgentEntity extends BaseModelEntity {

    @Column
    private String secretKey;

    @Column
    @OneToMany(mappedBy = "agentEntity")
    private List<AgentMerchantEntity> agentMerchantEntities;
}
