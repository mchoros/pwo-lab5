package pwo.utils;

import java.math.BigDecimal;

public interface SequenceGenerator {

    void reset();

    BigDecimal nextTerm();

    BigDecimal getTerm(int i);
    
    BigDecimal previousTerm(int i);
}
