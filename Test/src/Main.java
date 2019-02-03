import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("    *********Меню************\n");
        System.out.println("База данных создана ");
        System.out.println("Выберите действие:");
        System.out.println("Просмотреть информацию о студентах - 1");
        System.out.println("Просмотреть информацию о преподователях - 2");
        System.out.println("Просмотреть информацию о группах - 3");
        System.out.println("Провести перекличку - 4");
        System.out.println("Выбрать старосту - 5");

        Scanner sc = new Scanner(System.in);
        int punkt = Integer.parseInt(sc.nextLine());
        switch (punkt) {
            case 1:
                TheOne.printAllStudents(TheOne.getGroupList());
                break;
            case 2:
                TheOne.printProfessorList(TheOne.getProfessorList());
                break;
            case 3:
                TheOne.printGroupList(TheOne.getGroupList());
                break;
            case 4:
                System.out.println("Выберите группу :\n 1 - 1Java \n 2 - 1PHP \n 3 - 2PHP\n 4 - 1Python");
                int temp = Integer.parseInt(sc.nextLine());
                switch (temp) {
                    case 1:
                        TheOne.rollСall(TheOne.get1JavaGroup());
                        break;
                    case 2:
                        TheOne.rollСall(TheOne.get1PHPGroup());
                        break;
                    case 3:
                        TheOne.rollСall(TheOne.get2PHPGroup());
                        break;
                    case 4:
                        TheOne.rollСall(TheOne.get1PythonGroup());
                        break;
                    default:
                        TheOne.rollСall(TheOne.get1JavaGroup());
                        break;
                }
                break;

            case 5:
                System.out.println("Выберите группу :\n 1 - 1Java \n 2 - 1PHP \n 3 - 2PHP\n 4 - 1Python");
                int temp1 = Integer.parseInt(sc.nextLine());
                switch (temp1) {
                    case 1:
                        TheOne.getPraepostor(TheOne.get1JavaGroup());
                        break;
                    case 2:
                        TheOne.getPraepostor(TheOne.get1PHPGroup());
                        break;
                    case 3:
                        TheOne.getPraepostor(TheOne.get2PHPGroup());
                        break;
                    case 4:
                        TheOne.getPraepostor(TheOne.get1PythonGroup());
                        break;
                    default:
                        TheOne.getPraepostor(TheOne.get1JavaGroup());
                        break;
                }
                break;
            default:
                System.out.println("Неверная команда");
                break;
        }

    }
}

