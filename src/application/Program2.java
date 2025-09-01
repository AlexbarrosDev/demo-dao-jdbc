package application;

import model.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("[ < Teste 1: findAll > ]");
        List<Department> list = new ArrayList<>();
        list = departmentDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n[ < Teste 2: findById > ]");
        Department dep = departmentDao.findById(2);
        System.out.println(dep);

        System.out.println("\n[ < Teste 3: insert > ]");
        Department dep2 = new Department(null, "Restrooms");
        departmentDao.insert(dep2);
        System.out.println("Inserted with success!");

        System.out.println("\n[ < Teste 4: update > ]");
        dep.setName("Cars");
        departmentDao.update(dep);
        System.out.println("Update complete!");

        System.out.println("\n[ < Teste 5: delete > ]");
        departmentDao.deleteById(18);
        System.out.println("Delete with success!");
    }
}