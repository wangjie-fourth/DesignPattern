package org.github.fourth.desgin.pattern.behavioral.chainOfResponsibility.handler;


import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SuppressFBWarnings("EI_EXPOSE_REP")
public class ConfigContext {
    /**
     * Mutable keys, initialized from request
     */
    private Set<String> keys;

    /**
     * Mutable result, found key-values will be put here
     */
    private Map<String, String> configs = new HashMap<>();

    public ConfigContext(Set<String> keys) {
        this.keys = keys;
    }
}
