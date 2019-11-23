/**
 * 
 */
package com.tyagi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyagi.domain.Project;
import com.tyagi.exceptions.ProjectIdException;
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
		try {
			return projectRepository.save(project);
		}catch (Exception e) {
			throw new ProjectIdException("Project ID '"+project.getProjectIdentifier().toUpperCase()+"' is already exists! ");
		}
	}

}
