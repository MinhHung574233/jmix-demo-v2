package com.company.frontend.view.department;

import com.company.frontend.entity.Department;
import com.company.frontend.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "departments", layout = MainView.class)
@ViewController("Department.list")
@ViewDescriptor("department-list-view.xml")
@LookupComponent("departmentsDataGrid")
@DialogMode(width = "50em", height = "37.5em")
public class DepartmentListView extends StandardListView<Department> {
}