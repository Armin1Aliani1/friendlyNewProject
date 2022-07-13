package newProject.util;

import newProject.repository.impl.AdminRepositoryImpl;
import newProject.service.AdminService;
import newProject.service.impl.AdminServiceImpl;

public class ApplicationContext {
    public ApplicationContext() {
    }

    public static HibernateUtil hibernateUtil = new HibernateUtil();

    public static AdminService adminService = new AdminServiceImpl(new AdminRepositoryImpl());
}
