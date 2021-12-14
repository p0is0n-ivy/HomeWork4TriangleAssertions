package AreaTriangleTest;

import AreaTriangle.AreaTriangleFunction;
import AreaTriangle.MyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AsserJTest {

        @Test
    void assertJ() throws MyException {
        assertThat(AreaTriangleFunction.calcAreaTriangle(6, 8, 10)).isEqualTo(24);
    }
    @Test
    void assertJException () throws MyException {
        Assertions.assertDoesNotThrow(() -> AreaTriangleFunction.calcAreaTriangle(6, 8, 10));
    }

}
