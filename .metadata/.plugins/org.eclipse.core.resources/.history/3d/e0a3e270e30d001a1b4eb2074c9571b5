/**
 * 
 */
package com.tyagi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyagi.domain.Project;
import com.tyagi.repositories.ProjectRepository;

/**
 * @author ityagi
 *
 */
@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		
		return projectRepository.save(project);
	}

}
