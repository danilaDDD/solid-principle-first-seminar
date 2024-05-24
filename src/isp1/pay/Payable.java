package isp1.pay;

import jdk.jshell.spi.ExecutionControl;

public interface Payable {
    void payWebMoney(int amount);
    void payCreditCard(int amount);
}
