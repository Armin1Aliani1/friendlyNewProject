package newProject.service.impl;

import newProject.base.service.impl.BaseServiceImpl;
import newProject.domain.Admin;
import newProject.repository.impl.AdminRepositoryImpl;
import newProject.service.AdminService;
import newProject.util.Menu;

public class AdminServiceImpl extends BaseServiceImpl<Admin, AdminRepositoryImpl> implements AdminService {

    public AdminServiceImpl(AdminRepositoryImpl repository) {
        super(repository);
    }

    @Override
    public Admin findByUsername(String username) {
        try {
            return repository.findByUsername(username);
        }catch (Exception e){
            System.out.println("Admin not found");
            return null;
        }
    }

    @Override
    public Admin login() {
        Menu.printEnterUsername();
        String username ;
        Admin admin = null;
        while (admin==null){
            username = Menu.stringScaner();
            admin = findByUsername(username);
        }
        String password ;
        while (true){
            Menu.printEnterPassword();
            password = Menu.stringScaner();
            if (password.equals(admin.getPassword())){
                System.out.println("Login successful");
                break;
            }else {
                System.out.println("username or password is wrong");
            }
        }
        return admin;
    }

}
