package org.Alex;

import org.springframework.stereotype.Component;


public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Some RAP Song";
    }
}
