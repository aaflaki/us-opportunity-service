package com.example.opportunity.repository;

import com.example.opportunity.model.Opportuinty;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "opportunities", path = "opportunities")
public interface OpportunityRepository extends PagingAndSortingRepository<Opportuinty, Long> {
}
