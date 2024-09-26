package group.streamAPI;

import java.util.ArrayList;

public class EmployeeHandler {
    private final ArrayList<Employee> jobMarket = new ArrayList<>();

    public EmployeeHandler() {
        jobMarket.add(
                new Employee("Нулевой Нолик Нулевич",
                15, "Отдел ремонта банкоматов банка приколов",
                34599.32));
        jobMarket.add(new Employee("Зубенко Михаил Петрович",
                41,
                "Отдел закупки банкнот банка приколов",
                12383.2173));
        jobMarket.add(new Employee("Батиков Евгений Александрович",
                30,
                "Отдел просмотра купюр банка приколов",
                78443.344));
        jobMarket.add(new Employee("Человейников Человек Человечкин",
                22 ,
                "Отдел создания приколов банка приколов",
                12333.854));
        jobMarket.add(new Employee());

    }

    public void filterEmployeeList() {
        System.out.println(jobMarket
                .stream()
                .map(x -> x.getFullName() + " - " + x.getDepartment())
                .toList());
    }
}
