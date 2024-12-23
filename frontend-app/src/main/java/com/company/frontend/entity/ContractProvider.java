package com.company.frontend.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "CONTRACT_PROVIDER", indexes = {
        @Index(name = "fk_contract_provider_on_contract", columnList = "CONTRACT_ID")
})
@Entity
public class ContractProvider {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "CONTRACT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Contract contract;

    @Column(name = "PROVIDER")
    private String provider;

    @Column(name = "EMAIL")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}