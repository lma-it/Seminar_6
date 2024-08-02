package isp1.pay.impl;

import isp1.pay.Payable;

public interface PhonePayable extends Payable{
    
    void payPhoneNumber(int amount);
}
