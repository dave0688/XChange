package com.xeiam.xchange.coinsetter.service.marketdata;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Ignore;

import com.xeiam.xchange.Exchange;
import com.xeiam.xchange.ExchangeFactory;
import com.xeiam.xchange.coinsetter.CoinsetterExchange;
import com.xeiam.xchange.currency.CurrencyPair;
import com.xeiam.xchange.dto.marketdata.Ticker;
import com.xeiam.xchange.service.polling.marketdata.PollingMarketDataService;

/**
 * @author timmolter
 */
public class TickerFetchIntegration {

  // TODO add this back when exchange is fixed
  @Ignore
  public void tickerFetchTest() throws Exception {

    Exchange exchange = ExchangeFactory.INSTANCE.createExchange(CoinsetterExchange.class.getName());
    PollingMarketDataService marketDataService = exchange.getPollingMarketDataService();
    Ticker ticker = marketDataService.getTicker(new CurrencyPair("BTC", "USD"));
    System.out.println(ticker.toString());
    assertThat(ticker).isNotNull();
  }

}