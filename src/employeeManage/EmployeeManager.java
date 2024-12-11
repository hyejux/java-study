package employeeManage;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeManager {
    /**
     * 직원 추가
     * 직원 목록 보기
     * 직원 삭제
     * 직원 정보 업데이트
     * 프로그램 종료
     */

    private ArrayList<Employee> employees = new ArrayList<>();

    // 직원 추가
    public void employeeAdd(Employee e) {

        employees.add(e);
        System.out.println("직원 추가가 완료되었습니다.");
    }

    // 직원 삭제
    public void employeeDelete(String id){


             Iterator<Employee> i = employees.iterator();
             //Iteratort 를 사용하여 안전하게 삭제

             while(i.hasNext()) {
                 Employee e = i.next();
                 if (e.id.equals(id)) {
                     i.remove(); // 직원 삭제
                     System.out.println("직원 삭제가 완료되었습니다.");
                 }
             }


    }

    // 직원 리스트 출력
    public void employeeList(){
        if(employees.isEmpty()){
            System.out.println("직원이 존재하지 않습니다.");
        } else {
            System.out.println("직원 목록 -------- ");
            for(Employee e : employees) {
                System.out.println(e.id + "|" + e.name + "|" + e.position);
            }
        }

    }

    // 직원 수정 (직책만 수정가능하도록 함)
    public void employeeUpdate(String id , String position){

        Iterator<Employee> i = employees.iterator();
        //Iteratort 를 사용하여 안전하게 삭제
        Employee employee = new Employee();
        employee.setPosition(position); // 받아온 position

        while(i.hasNext()) {
            Employee e = i.next();
            if (e.id.equals(id)) {
                i.remove(); // 직원 삭제
                employee.setId(e.getId()); // 기존 id
                employee.setName(e.getName()); // 기존 name
                break;
            }
        }

        employeeAdd(employee); // 새롭게 추가
        System.out.println("직원 수정이 완료되었습니다.");


    }

    // 직원 아이디가 존재하는지 확인
    public boolean employeeEmpty(String id) {
        for (Employee e : employees){
            if(e.id.equals(id)){ // 직원 아이디가 존재하면 true;
                return true;
            }
        }
        return false; // 직원 아이디가 존재하지 않으면 false;
    }




}
