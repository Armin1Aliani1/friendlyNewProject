package newProject.service;

import newProject.base.service.BaseService;
import newProject.domain.Admin;

public interface AdminService extends BaseService<Admin> {
    Admin findByUsername(String username);

    Admin login();

}
