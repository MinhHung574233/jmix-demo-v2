package com.company.frontend.view.contractprovider;

import com.company.frontend.entity.ContractProvider;
import com.company.frontend.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "contractProviders", layout = MainView.class)
@ViewController(id = "ContractProvider.list")
@ViewDescriptor(path = "contract-provider-list-view.xml")
@LookupComponent("contractProvidersDataGrid")
@DialogMode(width = "64em")
public class ContractProviderListView extends StandardListView<ContractProvider> {
}