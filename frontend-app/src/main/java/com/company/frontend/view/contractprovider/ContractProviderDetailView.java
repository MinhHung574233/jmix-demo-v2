package com.company.frontend.view.contractprovider;

import com.company.frontend.entity.ContractProvider;
import com.company.frontend.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "contractProviders/:id", layout = MainView.class)
@ViewController(id = "ContractProvider.detail")
@ViewDescriptor(path = "contract-provider-detail-view.xml")
@EditedEntityContainer("contractProviderDc")
public class ContractProviderDetailView extends StandardDetailView<ContractProvider> {
}