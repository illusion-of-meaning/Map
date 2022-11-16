package com.asherbakov.phoneBook;

public enum TestPhoneData {
    phone1("89140111111"),
    phone2("+79160191111"),
    phone3("81245682135"),
    phone4("85465541235"),
    phone5("86532653265"),
    phone6("+75412485462"),
    phone7("85454125674"),
    phone8("85414175421"),
    phone9("83230200014"),
    phone10("85454663200"),
    phone11("+78512346521"),
    phone12("80101010102"),
    phone13("86633220521"),
    phone14("84451234521"),
    phone15("84455223366"),
    phone16("84567913246"),
    phone17("82200550011"),
    phone18("80505030102"),
    phone19("83131246132"),
    phone20("81463257980");

    private String phone;
    TestPhoneData(String str) {
        phone = str;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
