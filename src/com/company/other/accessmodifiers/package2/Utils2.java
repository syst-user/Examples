package com.company.other.accessmodifiers.package2;

import com.company.other.accessmodifiers.package1.Utils;

public class Utils2 extends Utils {

    public void checkAccess() {
        publicMethod();
        protectedMethod();
    }

    @Override
    public String publicMethod() {
        return super.publicMethod();
    }

    @Override
    protected String protectedMethod() {
        return super.protectedMethod();
    }
}
