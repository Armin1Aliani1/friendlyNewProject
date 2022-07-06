package newProject.repository;

import newProject.base.repository.BaseRepository;
import newProject.domain.Admin;

public interface AdminRepository extends BaseRepository<Admin> {
    Admin findByUsername(String username);
}
