//creating class employee
class EMPLOYEE {
    int employeenum;
    String name;
    float salary;

    EMPLOYEE() {
        employeenum = 1;
        name = "emma";
        salary = 26.8f;
    }

    void display_details() {
        System.out.println("employee number:" + employeenum + "employee name:" + name + "salary:" + salary);
    }
}

// creating class Main
class Main {
    public static void main(String[] args) {
        EMPLOYEE emp1 = new EMPLOYEE();
        EMPLOYEE emp2 = new EMPLOYEE();
        EMPLOYEE emp3 = new EMPLOYEE();
        emp1.display_details();
        emp2.display_details();
        emp3.display_details();
    }
}