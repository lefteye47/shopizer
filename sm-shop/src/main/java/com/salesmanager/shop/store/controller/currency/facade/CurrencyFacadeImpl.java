package com.salesmanager.shop.store.controller.currency.facade;

import com.salesmanager.core.business.services.reference.currency.CurrencyService;
import com.salesmanager.core.model.reference.currency.Currency;
import com.salesmanager.shop.store.api.exception.ResourceNotFoundException;
import com.salesmanager.shop.store.controller.currency.facade.CurrencyFacade;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class CurrencyFacadeImpl implements CurrencyFacade {

  @Inject
  private CurrencyService currencyService;

  @Override
  public List<Currency> getList() {
    List<Currency> currencyList = currencyService.list();
    if (currencyList.isEmpty()){
      throw new ResourceNotFoundException("No languages found");
    }
    return currencyList;
  }
}
