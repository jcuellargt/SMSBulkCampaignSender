package biz.televida.smsbulk.campaign.sender.repository;

import biz.televida.smsbulk.campaign.sender.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
