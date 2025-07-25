package HerancaEPolimorfismo;

import HerancaEPolimorfismo.Domain.Employee;
import HerancaEPolimorfismo.Domain.Manager;
import HerancaEPolimorfismo.Domain.Salesman;

public class HerancaMain {
    public static void main(String[] args){
        Employee employee = new Employee();
        Salesman salesman = new Salesman();
        Manager manager = new Manager();

        System.out.println(employee instanceof Employee);
    }
//        Manager manager = new Manager();
//        printEmployee(new Manager());
//        printEmployee(new Salesman());
    }
//    public static void printEmployee(Employee employee){
//        System.out.printf("======%s======\n", employee.getClass().getCanonicalName());
        // employee é uma instancia de Manager?
//        switch (employee){
//            case Manager manager ->{
//                manager.setCode("123");
//                manager.setName("João");
//                manager.setSalary(5000);
//                manager.setLogin("João");
//                manager.setPassword("123456");
//                manager.setComission(1200);
//
//                System.out.println(manager.getCode());
//                System.out.println(manager.getSalary());
//                System.out.println(manager.getName());
//                System.out.println(manager.getLogin());
//                System.out.println(manager.getPassword());
//                System.out.println(manager.getComission());
//
//            }
//            case Salesman salesman ->{
//                salesman.setCode("456");
//                salesman.setName("Anne");
//                salesman.setSalary(2800);
//                salesman.setPercentPerSold(10);
//                salesman.setSoldAmount(1000);
//
//                System.out.println(salesman.getCode());
//                System.out.println(salesman.getSalary());
//                System.out.println(salesman.getName());
//                System.out.println(salesman.getPercentPerSold());
//                System.out.println(salesman.getSoldAmount());
//            }
//        }
//        System.out.println(employee.getFullSalary(500));
//        System.out.println(employee.getFullSalary());
//        System.out.println("================");
//    }
//    }

