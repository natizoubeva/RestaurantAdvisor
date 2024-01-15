/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package bg.smg.model;

/**
 *
 * @author Natalia
 */
public enum PricePoint {
    LOW("$"),     // $ - Low price
    MEDIUM("$$"), // $$ - Medium price
    HIGH("$$$");  // $$$ - High price

    private final String symbol;

    PricePoint(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
