/**
 * 
 */
package com.tyagi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tyagi.domain.Project;

/**
 * @author ityagi
 *
 */
@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{
	
	Project findByProjectIdentifier(String projectIdentifier);
	
	
 }
