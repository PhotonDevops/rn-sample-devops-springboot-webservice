package com.devops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devops.model.Credential;

@Repository("credentialRepository")
public interface CredentialRepository extends JpaRepository<Credential, String> {
}
