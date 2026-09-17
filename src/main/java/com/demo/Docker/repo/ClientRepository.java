package com.demo.Docker.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Docker.model.ClientCodeDtls;
import com.demo.Docker.model.ClientIdentity;


@Repository
public interface ClientRepository extends JpaRepository<ClientCodeDtls, ClientIdentity>{

    Optional<ClientCodeDtls> findByCcdPan(String ccdPan);

}
