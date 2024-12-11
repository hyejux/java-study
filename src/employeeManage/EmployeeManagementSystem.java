package employeeManage;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args){

        int num = 0;
        String emId = "";
        EmployeeManager em = new EmployeeManager();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("-----------------------------");
            System.out.println("직원 관리 프로그램 입니다. 원하는 번호를 선택하여 작업을 시작하세요.");
            System.out.println("1: 직원 목록 \n 2: 직원 등록 \n 3: 직원 삭제 \n 4: 직원 수정 \n 5: 프로그램 종료");
            System.out.println("-----------------------------");
            System.out.println("번호 선택 >> ");
            num = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            switch (num){
                case 1 :
                    System.out.println("[[[[직원 목록]]]]");
                    em.employeeList();
                    break;
                case 2 :
                    System.out.println("[[[[직원 추가]]]]");
                    System.out.println("직원아이디 : ");
                    String id = sc.next();
                    if(em.employeeEmpty(id)){
                        System.out.println("이미 아이디가 존재합니다.");
                        break;
                    }
                    System.out.println("직원명 : ");
                    String name = sc.next();
                    System.out.println("직원직책 : ");
                    String position = sc.next();
                    Employee e = new Employee(id , name, position);
                    em.employeeAdd(e);
                    break;
                case 3 :
                    System.out.println("[[[[직원 삭제]]]]");
                    System.out.println("삭제를 원하는 직원 아이디를 입력해주세요 >> ");
                    System.out.println(" 취소는 m 키를 눌러주세요. ");
                    emId = sc.next();
                    if(emId.equals("m")){
                        break;
                    }else{
                        if(em.employeeEmpty(emId)){
                            em.employeeDelete(emId);
                        }else {
                            System.out.println("직원이 존재하지 않습니다.");
                        }
                    }
                    break;
                case 4 :
                    System.out.println("[[[[직원 수정]]]]");
                    System.out.println("수정을 원하는 직원 아이디를 입력해주세요 >> ");
                    emId = sc.next();
                    if(em.employeeEmpty(emId)){
                        System.out.println("직책 수정 >> ");
                        System.out.println(" 취소는 m 키를 눌러주세요. ");
                        String po = sc.next();
                        if(po.equals("m")){
                            break;
                        }else{
                            em.employeeUpdate(emId, po);
                        }
                    }else {
                        System.out.println("직원이 존재하지 않습니다.");
                    }
                    break;
                case 5 :
                    System.out.println("[[[[프로그램 종료]]]]");
                    sc.close();
                    return;
                default:
                    System.out.println("올바른 메뉴를 입력해주세요.");
            }

        }



    }

}
