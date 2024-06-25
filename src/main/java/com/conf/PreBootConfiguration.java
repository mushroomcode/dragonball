package com.conf;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.BitSet;

@Configuration
public class PreBootConfiguration {

    @Conditional(ParamImportCond.class)
    public BitSet onConditionParam() {
        return new BitSet();
    }

}
