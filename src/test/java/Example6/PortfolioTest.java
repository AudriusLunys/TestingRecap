package Example6;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class PortfolioTest {

    private static Portfolio portfolio;
    private static StockService stockService;

    @BeforeAll
    public static void setUp (){
        portfolio=new Portfolio();
        // create mock for object StockService
        stockService=mock(StockService.class);

        portfolio.setStockService(stockService);

    }

    @Test
    void getMarketValue() {
        List<Stock> stocks = new ArrayList<>();
        Stock googleStonks = new Stock("1","google",2);
        Stock microStonks = new Stock("2","mikrasofts",2);
        stocks.add(googleStonks);
        stocks.add(microStonks);
        portfolio.setStocks(stocks);
   //mocking stockservice
        when(stockService.getPrice(googleStonks)).thenReturn(50.00);
        when(stockService.getPrice(microStonks)).thenReturn(1000.00);

        assertEquals(2100,portfolio.getMarketValue());

        when(stockService.getPrice(googleStonks)).thenReturn(5000.00);
        when(stockService.getPrice(microStonks)).thenReturn(5000.00);
        assertEquals(20000,portfolio.getMarketValue());
    }
}