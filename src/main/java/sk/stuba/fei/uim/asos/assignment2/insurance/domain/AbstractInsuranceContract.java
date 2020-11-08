package sk.stuba.fei.uim.asos.assignment2.insurance.domain;

import org.springframework.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Abstraktná trieda poistnej zmluvy.
 *
 * @param <T> Trieda identifikátora zmluvy
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbstractInsuranceContract<T> {

    @NonNull
    protected T id;

}
